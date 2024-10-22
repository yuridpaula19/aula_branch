public class teste {
    public static void main(String[] args) {
        // Definindo duas matrizes de exemplo
        int[][] matrizA = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[][] matrizB = {
            {9, 8, 7},
            {6, 5, 4},
            {3, 2, 1}
        };

        // Verificando se as matrizes têm o mesmo tamanho
        if (matrizA.length != matrizB.length || matrizA[0].length != matrizB[0].length) {
            System.out.println("As matrizes devem ter o mesmo tamanho.");
            return;
        }

        // Criando uma matriz para armazenar a soma
        int[][] matrizSoma = new int[matrizA.length][matrizA[0].length];

        // Somando as matrizes
        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA[0].length; j++) {
                matrizSoma[i][j] = matrizA[i][j] + matrizB[i][j];
            }
        }

        // Exibindo a matriz soma
        System.out.println("Matriz Soma:");
        for (int i = 0; i < matrizSoma.length; i++) {
            for (int j = 0; j < matrizSoma[0].length; j++) {
                System.out.print(matrizSoma[i][j] + " ");
            }
            System.out.println();
        }
    }
}