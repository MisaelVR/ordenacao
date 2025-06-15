import pandas as pd
import matplotlib.pyplot as plt

# 1. Carrega o CSV (ajuste o nome/caminho se necessário)
df = pd.read_csv('resultados_analise.csv')

# 2. Renomeia colunas para facilitar (se o seu CSV já vier com esses nomes, essa parte pode ser removida)
df.columns = [
    'Algoritmo',
    'TamanhoVetor',
    'TempoMedio_ms',
    'TrocasMedias',
    'ComparacoesMedias'
]

# 3. Exibe os dados completos no console
print("\n=== Dados completos ===")
print(df.to_string(index=False))

# 4. Encontra o algoritmo mais rápido para cada tamanho de vetor
best_time = (
    df.loc[df.groupby('TamanhoVetor')['TempoMedio_ms'].idxmin()]
      [['TamanhoVetor', 'Algoritmo', 'TempoMedio_ms']]
      .sort_values('TamanhoVetor')
)
print("\n=== Algoritmo mais rápido por tamanho ===")
print(best_time.to_string(index=False))

# 5. Conta quantas vezes cada algoritmo foi o mais rápido
freq = (
    best_time['Algoritmo']
    .value_counts()
    .reset_index()
    .rename(columns={'index': 'Algoritmo', 'Algoritmo': 'VezesMaisRapido'})
)
print("\n=== Frequência de melhor desempenho ===")
print(freq.to_string(index=False))

# 6. Plota gráficos em escala log-log para cada métrica
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

# 7. Exibe todos os gráficos de uma vez
plt.show()
