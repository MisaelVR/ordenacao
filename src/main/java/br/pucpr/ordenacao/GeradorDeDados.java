package br.pucpr.ordenacao;
import java.util.Random;

public class GeradorDeDados {

    /**
     * @param tamanho
     * @param seed
     * @return
     */
    public static int[] gerarVetorAleatorio(int tamanho, int seed) {
        int[] vetor = new int[tamanho];
        Random random = new Random(seed);
        for (int i = 0; i < tamanho; i++) {
            vetor[i] = random.nextInt(tamanho * 10);
        }
        return vetor;
    }
}