public class Main {
    public static void main(String[] args) {
        // Implementación en Java
        int r = 3;
        int c = 3;
        int[] arr = new int[r * c];
        // Matriz inicializada
        int[][] TwoDArr = { {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9} };
        // Almacenar elementos en un array unidimensional
        // ordenados por filas
        int k = 0;
        for (int x = 0; x < r; x++) {
            for (int y = 0; y < c; y++) {
                k = x * c + y;
                arr[k] = TwoDArr[x][y];
                k++;
            }
        }
        // Mostrar elementos del array bidimensional por columnas
        System.out.println("Los elementos del array bidimensional son:");
        for (int y = 0; y < c; y++) {
            for (int x = 0; x < r; x++) {
                System.out.print(TwoDArr[x][y] + " ");
            }
            System.out.println();
        }
        // Mostrar elementos del array unidimensional
        System.out.println("\nLos elementos del array unidimensional son:");
        for (int x = 0; x < r; x++) {
            for (int y = 0; y < c; y++) {
                System.out.print(arr[x * c + y] + " ");
            }
        }
    }
}