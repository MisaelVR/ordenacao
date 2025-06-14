package br.pucpr.ordenacao.algoritmos;
public class InsertSort extends AlgoritmoDeOrdenacao {

    @Override
    public void sort(int[] vetor) {
        int n = vetor.length;
        for (int k = 1; k < n; k++) { // 
            int y = vetor[k]; // 
            int i = k - 1;

            while (i >= 0 && y < vetor[i]) {
                this.numeroDeComparacoes++;
                vetor[i + 1] = vetor[i];
                this.numeroDeTrocas++;
                i--;
            }
            if(i >= 0) {
                 this.numeroDeComparacoes++;
            }
            
            vetor[i + 1] = y;
            if(i != k -1) {
                this.numeroDeTrocas++;
            }
        }
    }
}