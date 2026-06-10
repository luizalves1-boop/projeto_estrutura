/*
    Alunos: Luiz Felipe, Rafaella Alves e Vinícius Vaz
    Disciplina: Estrutura de Dados
    Data de codificação: 03/06/2026
    Objetivo da classe: Essa classe possui os métodos de ordenação usados para a execução do projeto.

*/

public class Ordena {
    //BubbleSort
    public void bubbleSort(Item[] v) {
        for (int k = v.length; k >= 1; k--) {
            for (int j = 1; j < k; j++) {
                if (v[j - 1].getValor() > v[j].getValor())
                    troca(v, j, j - 1);
            }
        }
    }

    public void troca(Item v[], int m, int n) {
        Item aux = v[m];
        v[m] = v[n];
        v[n] = aux;
    }

    //SelectionSort
    public void selectionSort(Item[] v) {
        for (int i = 0; i < v.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < v.length; j++) {
                if (v[j].getValor() < v[min].getValor())
                    min = j;
            }
            Item aux = v[min];
            v[min] = v[i];
            v[i] = aux;
        }
    }

    //InsertionSort

    public void insertionSort(Item[] v) {
        int j = 0;
        for (int i = 1; i < v.length; i++) {
            Item aux = v[i];
            j = i;
            while (j > 0 && aux.getValor() < v[j - 1].getValor()) {
                v[j] = v[j - 1];
                j--;
            }
            v[j] = aux;
        }
    }
}
