public class Programa1_Busqueda2D {

    // Método que busca un número en una matriz 2D
    public static int[] buscarEnMatriz(int[][] matriz, int valor) {
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int columna = 0; columna < matriz[fila].length; columna++) {
                if (matriz[fila][columna] == valor) {
                    return new int[]{fila, columna}; // Retorna posición [fila, columna]
                }
            }
        }
        return new int[]{-1, -1}; // Si no lo encuentra
    }

    public static void main(String[] args) {
        // Declarar matriz 3x3
        int[][] matriz = {
            {4, 7, 1},
            {9, 2, 5},
            {6, 8, 3}
        };

        int valorBuscado = 5;

        // Llamamos al método
        int[] posicion = buscarEnMatriz(matriz, valorBuscado);

        // Mostrar resultados en consola
        if (posicion[0] != -1) {
            System.out.println("Valor " + valorBuscado + " encontrado en posición: ["
                    + posicion[0] + ", " + posicion[1] + "]");
        } else {
            System.out.print  
}
