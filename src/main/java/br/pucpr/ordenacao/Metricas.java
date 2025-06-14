package br.pucpr.ordenacao;
public class Metricas {
    private long tempoDeExecucao;
    private long numeroDeTrocas;
    private long numeroDeComparacoes;

    public Metricas(long tempo, long trocas, long comparacoes) {
        this.tempoDeExecucao = tempo;
        this.numeroDeTrocas = trocas;
        this.numeroDeComparacoes = comparacoes;
    }

    public long getTempoDeExecucao() { return tempoDeExecucao; }
    public long getNumeroDeTrocas() { return numeroDeTrocas; }
    public long getNumeroDeComparacoes() { return numeroDeComparacoes; }
}