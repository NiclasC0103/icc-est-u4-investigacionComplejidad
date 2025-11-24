package complejidades;

public class ComplejidadLogaritmica {
    /**
     * Complejidad: O(log n)
     */
    public void ejemplo() {
        System.out.println("\nEjemplo O(log n):");
        int n = 32;

        System.out.println("Valor inicial: " + n);

        while (n > 1) {
            n = n / 2;
            System.out.println("Nuevo valor: " + n);
        }
    }
}
