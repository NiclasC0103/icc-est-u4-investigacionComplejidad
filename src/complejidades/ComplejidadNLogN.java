package complejidades;

public class ComplejidadNLogN {
    /**
     * Complejidad: O(n log n)
     */
    public void ejemplo() {
        System.out.println("\nEjemplo O(n log n):");
        int[] datos = {5, 2, 8, 1, 3};
        dividir(datos, datos.length);
    }

    private void dividir(int[] arr, int n) {
        System.out.println("Procesando tamaño: " + n);

        if (n <= 1) {
            return; // caso base
        }

        int mitad = n / 2;

        dividir(arr, mitad);
        dividir(arr, n - mitad);
    }
}

