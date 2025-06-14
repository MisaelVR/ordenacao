package br.pucpr.ordenacao;

import br.pucpr.ordenacao.algoritmos.*;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        try (PrintWriter writer = new PrintWriter(new FileWriter("resultados_analise.csv"))) {
            
            writer.println("Algoritmo,TamanhoVetor,TempoMedio_ms,TrocasMedias,ComparacoesMedias");

            int[] tamanhos = {1000, 10000, 100000, 500000, 1000000};
            int[] seeds = {10, 20, 30, 40, 50};
            int numRodadas = seeds.length;

            AlgoritmoDeOrdenacao[] algoritmos = {
                new InsertSort(),
                new SelectionSort(),
                new MergeSort(),
                new GnomeSort(),
                new CountingSort(),
                new CocktailSort()
            };

            for (AlgoritmoDeOrdenacao algoritmo : algoritmos) {
                String nomeAlgoritmo = algoritmo.getClass().getSimpleName();
                System.out.println("--- Análise do Algoritmo: " + nomeAlgoritmo + " ---");
                for (int tamanho : tamanhos) {
                    System.out.println("  Analisando tamanho: " + tamanho);
                    long tempoTotal = 0, trocasTotal = 0, comparacoesTotal = 0;

                    for (int seed : seeds) {
                        int[] vetorOriginal = GeradorDeDados.gerarVetorAleatorio(tamanho, seed);
                        int[] vetorParaOrdenar = new int[vetorOriginal.length];
                        for(int i = 0; i < vetorOriginal.length; i++) {
                            vetorParaOrdenar[i] = vetorOriginal[i];
                        }

                        algoritmo.resetMetricas();
                        long tempoInicio = System.nanoTime();
                        algoritmo.sort(vetorParaOrdenar);
                        long tempoFim = System.nanoTime();

                        tempoTotal += (tempoFim - tempoInicio);
                        trocasTotal += algoritmo.getTrocas();
                        comparacoesTotal += algoritmo.getComparacoes();
                    }

                    double tempoMedioMs = (double)(tempoTotal / numRodadas) / 1_000_000.0;
                    long trocasMedias = trocasTotal / numRodadas;
                    long comparacoesMedias = comparacoesTotal / numRodadas;

                    String linhaCsv = String.format("%s,%d,%.4f,%d,%d",
                        nomeAlgoritmo,
                        tamanho,
                        tempoMedioMs,
                        trocasMedias,
                        comparacoesMedias
                    );
                    writer.println(linhaCsv);
                }
                System.out.println("-------------------------------------------\n");
            }

        } catch (IOException e) {
            System.err.println("Erro ao escrever no arquivo CSV: " + e.getMessage());
        }
    }
}