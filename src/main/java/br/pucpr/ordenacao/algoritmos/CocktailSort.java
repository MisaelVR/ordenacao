package br.pucpr.ordenacao.algoritmos;public class CocktailSort extends AlgoritmoDeOrdenacao {
    @Override
    public void sort(int[] vetor) {
        boolean trocado = true;
        int inicio = 0;
        int fim = vetor.length;

        while (trocado) {
            trocado = false;
            // Loop da esquerda para a direita (como o Bubble Sort)
            for (int i = inicio; i < fim - 1; ++i) {
                this.numeroDeComparacoes++;
                if (vetor[i] > vetor[i + 1]) {
                    trocar(vetor, i, i + 1);
                    trocado = true;
                }
            }
            if (!trocado) break;
            trocado = false;
            fim = fim - 1;
            // Loop da direita para a esquerda
            for (int i = fim - 1; i >= inicio; i--) {
                this.numeroDeComparacoes++;
                if (vetor[i] > vetor[i + 1]) {
                    trocar(vetor, i, i + 1);
                    trocado = true;
                }
            }
            inicio = inicio + 1;
        }
    }
}