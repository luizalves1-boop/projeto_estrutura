public class Teste {
    public static void main(String[] args) {
        Utilitarios utilitarios = new Utilitarios();
        int[] dataset1 = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int[] dataset2 = {1000, 2000, 3000, 4000, 5000, 6000, 7000, 8000, 9000, 10000};
        for(int i = 0; i < dataset1.length; i++){
            System.out.print("\nVetor ["+ dataset1[i] + "]");
            int[] v = utilitarios.gerarVetoresP(dataset1[i]);
            utilitarios.ordenarBubbleP(v);
            utilitarios.ordenarSelectionP(v);
            utilitarios.ordenarInsertionP(v);
        }

        for(int i = 0; i < dataset2.length; i++){
            System.out.print("\nVetor ["+ dataset2[i] + "]");
            int[] v = utilitarios.gerarVetoresG(dataset2[i]);
            utilitarios.ordenarBubbleG(v);
            utilitarios.ordenarSelectionG(v);
            utilitarios.ordenarInsertionG(v);
        }



    }
}
