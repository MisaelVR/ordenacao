package br.pucpr.ordenacao.algoritmos;public class CountingSort extends AlgoritmoDeOrdenacao {
    @Override
    public void sort(int[] vetor) {
        if (vetor.length == 0) return;

        int max = vetor[0];
        for (int i = 1; i < vetor.length; i++) {
            this.numeroDeComparacoes++;
            if (vetor[i] > max) {
                max = vetor[i];
            }
        }

        int[] contagem = new int[max + 1];

        for (int num : vetor) {
            contagem[num]++;
            this.numeroDeTrocas++;
        }
        
        int indiceVetor = 0;
        for (int i = 0; i <= max; i++) {
            while (contagem[i] > 0) {
                vetor[indiceVetor] = i;
                indiceVetor++;
                contagem[i]--;
                this.numeroDeTrocas++;
            }
        }
    }
}