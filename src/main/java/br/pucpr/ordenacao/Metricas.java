package br.pucpr.ordenacao;
public class Metricas {
    private long tempoDeExecucao; // em nanossegundos
    private long numeroDeTrocas;
    private long numeroDeComparacoes;

    // Construtor, Getters e Setters
    public Metricas(long tempo, long trocas, long comparacoes) {
        this.tempoDeExecucao = tempo;
        this.numeroDeTrocas = trocas;
        this.numeroDeComparacoes = comparacoes;
    }

    // Getters para acessar os valores
    public long getTempoDeExecucao() { return tempoDeExecucao; }
    public long getNumeroDeTrocas() { return numeroDeTrocas; }
    public long getNumeroDeComparacoes() { return numeroDeComparacoes; }
}