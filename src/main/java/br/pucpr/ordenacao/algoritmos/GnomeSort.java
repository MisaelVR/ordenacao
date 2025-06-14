package br.pucpr.ordenacao.algoritmos;
public class GnomeSort extends AlgoritmoDeOrdenacao {
    @Override
    public void sort(int[] vetor) {
        int index = 0;
        int n = vetor.length;
        while (index < n) {
            if (index == 0) {
                index++;
            }
            this.numeroDeComparacoes++;
            if (vetor[index] >= vetor[index - 1]) {
                index++;
            } else {
                trocar(vetor, index, index - 1);
                index--;
            }
        }
    }
}