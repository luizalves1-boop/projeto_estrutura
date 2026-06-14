/*
    Alunos: Luiz Felipe, Rafaella Alves e Vinícius Vaz
    Disciplina: Estrutura de Dados
    Data de codificação: 03/06/2026
    Objetivo da classe: Essa classe foi implementada para executar toda a
    solução do problema (recebe 1 vetor por vez e ordena ele com cada método de ordenação)
    e já retornar o resultado (retorna o tempo médio de 100 execuções de cada método de ordenação).

*/

public class Teste {
    public static void main(String[] args) {
        Utilitarios utilitarios = new Utilitarios();
        int[] dataset1 = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int[] dataset2 = {1000, 2000, 3000, 4000, 5000, 6000, 7000, 8000, 9000, 10000};
        for (int i = 0; i < dataset1.length; i++) {
            System.out.print("\nVetor [" + dataset1[i] + "]");
            utilitarios.ordenarVetoresP(dataset1[i]);
        }
        for (int i = 0; i < dataset2.length; i++) {
            System.out.print("\nVetor [" + dataset2[i] + "]");
            utilitarios.ordenarVetoresG(dataset2[i]);
        }
    }
}
