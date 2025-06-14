package br.pucpr.ordenacao.algoritmos;
public class MergeSort extends AlgoritmoDeOrdenacao {

    @Override
    public void sort(int[] vetor) {
        if (vetor == null || vetor.length <= 1) {
            return;
        }
        // No merge sort, um array auxiliar de tamanho n é necessário 
        int[] auxiliar = new int[vetor.length];
        mergeSort(vetor, auxiliar, 0, vetor.length - 1);
    }

    private void mergeSort(int[] vetor, int[] auxiliar, int inicio, int fim) {
        if (inicio < fim) {
            int meio = inicio + (fim - inicio) / 2;
            mergeSort(vetor, auxiliar, inicio, meio);
            mergeSort(vetor, auxiliar, meio + 1, fim);
            merge(vetor, auxiliar, inicio, meio, fim);
        }
    }

    private void merge(int[] vetor, int[] auxiliar, int inicio, int meio, int fim) {
        // Copia ambas as partes para o array auxiliar
        for (int i = inicio; i <= fim; i++) {
            auxiliar[i] = vetor[i];
            this.numeroDeTrocas++; // Cada cópia para o auxiliar é uma movimentação
        }

        int i = inicio;
        int j = meio + 1;
        int k = inicio;

        // Faz o merge de volta para o array original
        while (i <= meio && j <= fim) {
            this.numeroDeComparacoes++;
            if (auxiliar[i] <= auxiliar[j]) {
                vetor[k] = auxiliar[i];
                i++;
            } else {
                vetor[k] = auxiliar[j];
                j++;
            }
            k++;
            this.numeroDeTrocas++; // Cada cópia de volta é outra movimentação
        }
        
        // Copia o resto da metade esquerda, se houver
        while (i <= meio) {
            vetor[k] = auxiliar[i];
            k++;
            i++;
            this.numeroDeTrocas++;
        }
    }
}