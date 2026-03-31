import javax.swing.JOptionPane; //GUI
//import java.util.ArrayList; //arreglos dinamicos
import java.util.Random;
//import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Matriz matrix = new Matriz();
        int cf= 5, cc=5;
        int [][] local_matriz = new int [cf][cc];
        matrix.generarMatriz(local_matriz);
        System.out.println("Matriz original:");
        matrix.mostrarMatriz(local_matriz);
        matrix.transponerMatriz(local_matriz);
        System.out.println("Matriz transpuesta:");
        matrix.mostrarMatriz(local_matriz);
    }


    //Lista de métodos
    static int ingreso() {
        int valor;
        valor = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del usuario"));
        return valor;
    }

    static void muestra(int edad) {
        JOptionPane.showMessageDialog(null, "Usted tiene: " + edad + " años.");
    }

    static void mostrarVector(int[] vec) {
        int i;
        System.out.println("Elementos del vector de enteros:");
        for (i = 0; i < vec.length; i++) {
            System.out.printf("%d ", vec[i]);
        }
    }

    static void generarLista(int[] vec) {
        int i;
        Random aleatorio = new Random();
        System.out.println("Generando lista de enteros entre 1 y " + vec.length);
        for (i = 0; i < vec.length; i++) {
            vec[i] = aleatorio.nextInt(vec.length) + 1;
        }
    }
}





/* Comandos utiles
ctrl + . : ver sugerencias que da el entorno
f5: iniciar el depurador
f9: añadir un breakpoint
ctrl + f5: ejecutar el programa
 */

/*
- si usas tipo flotante, pon al final una f
- poner string empezando en mayuscula (es una clase)
 */