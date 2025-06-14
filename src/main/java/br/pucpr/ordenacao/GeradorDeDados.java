package br.pucpr.ordenacao;
import java.util.Random;

public class GeradorDeDados {

    /**
     * Gera um vetor de inteiros com valores aleatórios.
     * @param tamanho O tamanho do vetor a ser gerado.
     * @param seed A semente para o gerador de números aleatórios, para reprodutibilidade.
     * @return Um vetor de inteiros preenchido com números aleatórios.
     */
    public static int[] gerarVetorAleatorio(int tamanho, int seed) {
        int[] vetor = new int[tamanho];
        Random random = new Random(seed);
        for (int i = 0; i < tamanho; i++) {
            // Gera números entre 0 e tamanho*10 para ter alguma variedade.
            vetor[i] = random.nextInt(tamanho * 10);
        }
        return vetor;
    }
}