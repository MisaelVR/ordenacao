package br.pucpr.ordenacao.algoritmos;
public class InsertSort extends AlgoritmoDeOrdenacao {

    @Override
    public void sort(int[] vetor) {
        int n = vetor.length;
        for (int k = 1; k < n; k++) { // 
            int y = vetor[k]; // 
            int i = k - 1;

            // Desloque todos os elementos à esquerda de x[k] que são maiores do que y 
            while (i >= 0 && y < vetor[i]) { // 
                this.numeroDeComparacoes++;
                vetor[i + 1] = vetor[i]; // 
                this.numeroDeTrocas++; // Conta como uma movimentação/troca
                i--;
            }
            // Adiciona a comparação final que resulta em false (se o loop rodou)
            if(i >= 0) {
                 this.numeroDeComparacoes++;
            }
            
            vetor[i + 1] = y; // Armazena o elemento y na sua posição correta 
            // A inserção na posição correta também é uma operação de "troca"
            if(i != k -1) { // Só conta se houve deslocamento
                this.numeroDeTrocas++;
            }
        }
    }
}