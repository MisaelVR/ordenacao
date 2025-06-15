import pandas as pd
import matplotlib.pyplot as plt

df = pd.read_csv('resultados_analise.csv')

df.columns = [
    'Algoritmo',
    'TamanhoVetor',
    'TempoMedio_ms',
    'TrocasMedias',
    'ComparacoesMedias'
]

print("\n=== Dados completos ===")
print(df.to_string(index=False))

best_time = (
    df.loc[df.groupby('TamanhoVetor')['TempoMedio_ms'].idxmin()]
      [['TamanhoVetor', 'Algoritmo', 'TempoMedio_ms']]
      .sort_values('TamanhoVetor')
)
print("\n=== Algoritmo mais rápido por tamanho ===")
print(best_time.to_string(index=False))

freq = (
    best_time['Algoritmo']
    .value_counts()
    .reset_index()
    .rename(columns={'index': 'Algoritmo', 'Algoritmo': 'VezesMaisRapido'})
)
print("\n=== Frequência de melhor desempenho ===")
print(freq.to_string(index=False))

metrics = ['TempoMedio_ms', 'TrocasMedias', 'ComparacoesMedias']
for metric in metrics:
    plt.figure(figsize=(8,5))
    for alg in df['Algoritmo'].unique():
        sub = df[df['Algoritmo'] == alg]
        plt.plot(
            sub['TamanhoVetor'],
            sub[metric],
            marker='o',
            label=alg
        )
    plt.xscale('log')
    plt.yscale('log')
    plt.xlabel('Tamanho do Vetor')
    plt.ylabel(metric)
    plt.title(f'{metric} por Tamanho de Vetor')
    plt.legend()
    plt.tight_layout()

plt.show()
