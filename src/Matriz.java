import java.util.Random;

public class Matriz {

    void generarMatriz(int[][] matriz)
    {
        int i, j;
        Random aleatorio = new Random();
        System.out.println("Generando matriz de numeros enteros...");
        for(i=0;i<matriz.length;i++){
            for(j=0;j<matriz[i].length;j++){
                matriz[i][j]= aleatorio.nextInt(matriz[i].length);
            }
        }
    }

    void mostrarMatriz(int [][] matriz) {
        int i, j;
        System.out.println("Elementos de la matriz de enteros:");
        for (i = 0; i < matriz.length; i++) {
            for (j = 0; j < matriz[i].length; j++) {
                System.out.printf("%d ", matriz[i][j]);
            }
            System.out.println();
        }
    }

    void transponerMatriz(int [][] matriz) {
        int i, j;
        int aux;
        for (i = 1; i < matriz.length; i++) {
            for (j = 0; j < i; j++) {
                aux = matriz[i][j];
                matriz[i][j] = matriz[j][i];
                matriz[j][i] = aux;
            }
        }
    }
}


