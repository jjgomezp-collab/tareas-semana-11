import java.util.Arrays;

public class Programa2_Ordenacion2D {

    // Método para imprimir la matriz
    public static void imprimirMatriz(int[][] matriz) {
        for (int[] fila : matriz) {
            System.out.println(Arrays.toString(fila));
        }
    }

    public static void main(String[] args) {
        // Declarar matriz 3x3
        int[][] matriz = {
            {9, 3, 5},
            {1, 8, 6},
            {7, 2, 4}
        };

        System.out.println("Matriz original:");
        imprimirMatriz(matriz);

        // Ordenar la fila 1 (segunda fila, índice 1)
        int filaOrdenar = 1;
        Arrays.sort(matriz[filaOrdenar]);

        System.out.println("\nMatriz después de ordenar la fila " + filaOrdenar + ":");
        imprimirMatriz(matriz);
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class Programa2_Ordenacion2D {
    
}
