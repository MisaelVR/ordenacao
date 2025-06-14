package br.pucpr.ordenacao.algoritmos;
public class SelectionSort extends AlgoritmoDeOrdenacao {

    @Override
    public void sort(int[] vetor) {
        int n = vetor.length;
        for (int i = 0; i < n - 1; i++) {
            int indiceMenor = i;
            for (int j = i + 1; j < n; j++) {
                this.numeroDeComparacoes++;
                if (vetor[j] < vetor[indiceMenor]) {
                    indiceMenor = j;
                }
            }
            trocar(vetor, i, indiceMenor);
        }
    }
}