package complejidades;

public class ComplejidadLineal {
    /**
     * Complejidad: O(n)
     * Razón: Recorre todos los elementos del arreglo una sola vez.
     */
    public void ejemplo() {
        System.out.println("\nEjemplo O(n):");
        int[] numeros = {3, 6, 9, 12, 15};

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Valor: " + numeros[i]);
        }
    }
}

