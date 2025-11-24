package complejidades;

public class ComplejidadCuadratica {
    /**
     * Complejidad: O(n^2)
     * Razón: Dos ciclos anidados que dependen de n.
     */
    public void ejemplo() {
        System.out.println("\nEjemplo O(n^2):");
        int[] datos = {1, 2, 3, 4};

        for (int i = 0; i < datos.length; i++) {
            for (int j = 0; j < datos.length; j++) {
                System.out.println("Par: " + datos[i] + " - " + datos[j]);
            }
        }
    }
}
