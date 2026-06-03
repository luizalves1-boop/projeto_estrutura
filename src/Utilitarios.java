import java.util.Random;

public class Utilitarios {
    public int[] gerarVetoresP(int tam) {
        int[] v = new int[tam];
        Random random = new Random();
        for (int i = 0; i < tam; i++) {
            v[i] = random.nextInt(500);
        }
        return v;
    }

    public int[] gerarVetoresG(int tam) {
        int[] v = new int[tam];
        Random random = new Random();
        for (int i = 0; i < tam; i++) {
            v[i] = random.nextInt(20000);
        }
        return v;
    }

    public int[] clonarVetor(int[] v) {
        int[] vClone = new int[v.length];
        for (int i = 0; i < v.length; i++) {
            vClone[i] = v[i];
        }
        return vClone;
    }

    public void ordenarBubbleP(int[] v) {

        Ordena ordena = new Ordena();
        int[] bubble;

        //Aquecimento
        for (int i = 0; i < 10000; i++) {
            bubble = clonarVetor(v);
            ordena.bubbleSort(bubble);
        }

        double soma = 0;
        for (int i = 0; i < 100; i++) {
            bubble = clonarVetor(v);
            long inicio = System.nanoTime();
            ordena.bubbleSort(bubble);
            long fim = System.nanoTime();
            soma += (fim - inicio);
        }
        System.out.print("\nTempo Bubble: " + soma / 100 + "Ns");
    }

    public void ordenarSelectionP(int[] v) {

        Ordena ordena = new Ordena();
        int[] selection;

        //Aquecimento
        for (int i = 0; i < 10000; i++) {
            selection = clonarVetor(v);
            ordena.selectionSort(selection);
        }

        double soma = 0;
        for (int i = 0; i < 100; i++) {
            selection = clonarVetor(v);
            long inicio = System.nanoTime();
            ordena.selectionSort(selection);
            long fim = System.nanoTime();
            soma += (fim - inicio);
        }
        System.out.print("\nTempo Selection: " + soma / 100 + "Ns");
    }

    public void ordenarInsertionP(int[] v) {

        Ordena ordena = new Ordena();
        int[] insertion;

        //Aquecimento
        for (int i = 0; i < 10000; i++) {
            insertion = clonarVetor(v);
            ordena.insertionSort(insertion);
        }

        double soma = 0;
        for (int i = 0; i < 100; i++) {
            insertion = clonarVetor(v);
            long inicio = System.nanoTime();
            ordena.insertionSort(insertion);
            long fim = System.nanoTime();
            soma += (fim - inicio);
        }
        System.out.print("\nTempo Insertion: " + soma / 100 + "Ns");
    }

    public void ordenarBubbleG(int[] v) {
        Ordena ordena = new Ordena();
        int[] bubble;

        //Aquecimento
        for (int i = 0; i < 100; i++) {
            bubble = clonarVetor(v);
            ordena.bubbleSort(bubble);
        }

        double soma = 0;
        for (int i = 0; i < 100; i++) {
            bubble = clonarVetor(v);
            long inicio = System.currentTimeMillis();
            ordena.bubbleSort(bubble);
            long fim = System.currentTimeMillis();
            soma += (fim - inicio);
        }
        System.out.print("\nTempo Bubble: " + soma / 100 + "Ms");
    }

    public void ordenarSelectionG(int[] v) {

        Ordena ordena = new Ordena();
        int[] selection;

        //Aquecimento
        for (int i = 0; i < 100; i++) {
            selection = clonarVetor(v);
            ordena.selectionSort(selection);
        }

        double soma = 0;
        for (int i = 0; i < 100; i++) {
            selection = clonarVetor(v);
            long inicio = System.currentTimeMillis();
            ordena.selectionSort(selection);
            long fim = System.currentTimeMillis();
            soma += (fim - inicio);
        }
        System.out.print("\nTempo Selection: " + soma / 100 + "Ms");
    }

    public void ordenarInsertionG(int[] v) {

        Ordena ordena = new Ordena();
        int[] insertion;

        //Aquecimento
        for (int i = 0; i < 100; i++) {
            insertion = clonarVetor(v);
            ordena.insertionSort(insertion);
        }
        double soma = 0;
        for (int i = 0; i < 100; i++) {
            insertion = clonarVetor(v);
            long inicio = System.currentTimeMillis();
            ordena.insertionSort(insertion);
            long fim = System.currentTimeMillis();
            soma += (fim - inicio);
        }
        System.out.print("\nTempo Insertion: " + soma / 100 + "Ms");
    }
}
