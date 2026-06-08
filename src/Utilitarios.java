/*
    Alunos: Luiz Felipe, Rafaella Alves e Vinícius Vaz
    Disciplina: Estrutura de Dados
    Data de codificação: 03/06/2026
    Objetivo da classe: Essa classe possui os métodos utilizados para resolver o problema.
    Ela gera os vetores para cada execução, clona o vetor para não perdê-lo para os proximos metodos de ordenação, ordena os vetores e
    calcula a média de 100 execuções.

*/

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Utilitarios {
    private final Random random = new Random();
    private final Ordena ordena = new Ordena();

    public int[] gerarVetores(int tam) {
        int[] v = new int[tam];
        for (int i = 0; i < tam; i++) {
            v[i] = random.nextInt(Integer.MAX_VALUE);
        }
        return v;
    }

    public void ordenarVetoresP(int tam) {
        double somaBubble = 0;
        double somaSelection = 0;
        double somaInsertion = 0;

        //Aquecimento
        for (int i = 0; i < 10000; i++) {
            int[] v = gerarVetores(tam);
            int[] bubble = v.clone();
            int[] selection = v.clone();
            int[] insertion = v.clone();
            ordena.bubbleSort(bubble);
            ordena.selectionSort(selection);
            ordena.insertionSort(insertion);
        }

        for (int i = 0; i < 100; i++) {
            int[] v = gerarVetores(tam);

            int[] bubble = v.clone();
            long inicio = System.nanoTime();
            ordena.bubbleSort(bubble);
            somaBubble += System.nanoTime() - inicio;

            int[] selection = v.clone();
            inicio = System.nanoTime();
            ordena.selectionSort(selection);
            somaSelection += System.nanoTime() - inicio;

            int[] insertion = v.clone();
            inicio = System.nanoTime();
            ordena.insertionSort(insertion);
            somaInsertion += System.nanoTime() - inicio;
        }


        System.out.print("\nTempo Bubble: " + somaBubble / 100 + "ns");
        System.out.print("\nTempo Selection: " + somaSelection / 100 + "ns");
        System.out.println("\nTempo Insertion: " + somaInsertion / 100 + "ns");
    }


    public void ordenarVetoresG(int tam) {
        double somaBubble = 0;
        double somaSelection = 0;
        double somaInsertion = 0;

        //Aquecimento
        for (int i = 0; i < 100; i++) {
            int[] v = gerarVetores(tam);
            int[] bubble = v.clone();
            int[] selection = v.clone();
            int[] insertion = v.clone();
            ordena.bubbleSort(bubble);
            ordena.selectionSort(selection);
            ordena.insertionSort(insertion);
        }

        for (int i = 0; i < 100; i++) {
            int[] v = gerarVetores(tam);

            int[] bubble = v.clone();
            long inicio = System.currentTimeMillis();
            ordena.bubbleSort(bubble);
            somaBubble += System.currentTimeMillis() - inicio;

            int[] selection = v.clone();
            inicio = System.currentTimeMillis();
            ordena.selectionSort(selection);
            somaSelection += System.currentTimeMillis() - inicio;

            int[] insertion = v.clone();
            inicio = System.currentTimeMillis();
            ordena.insertionSort(insertion);
            somaInsertion += System.currentTimeMillis() - inicio;
        }


        System.out.print("\nTempo Bubble: " + somaBubble / 100 + "ms");
        System.out.print("\nTempo Selection: " + somaSelection / 100 + "ms");
        System.out.println("\nTempo Insertion: " + somaInsertion / 100 + "ms");
    }


}
