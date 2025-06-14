package br.pucpr.ordenacao.algoritmos;
public abstract class AlgoritmoDeOrdenacao {
    protected long numeroDeTrocas = 0;
    protected long numeroDeComparacoes = 0;

    public abstract void sort(int[] vetor);

    public long getTrocas() {
        return numeroDeTrocas;
    }

    public long getComparacoes() {
        return numeroDeComparacoes;
    }

    public void resetMetricas() {
        this.numeroDeTrocas = 0;
        this.numeroDeComparacoes = 0;
    }
    
    protected void trocar(int[] vetor, int i, int j) {
        int temp = vetor[i];
        vetor[i] = vetor[j];
        vetor[j] = temp;
        this.numeroDeTrocas++;
    }
}