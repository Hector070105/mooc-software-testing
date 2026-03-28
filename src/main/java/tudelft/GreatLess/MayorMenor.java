package tudelft.GreatLess;

import java.util.List;

public class MayorMenor {

    public static int encontrarMayor(List<Integer> numeros) {
        if (numeros == null || numeros.isEmpty()) {
            throw new IllegalArgumentException("La lista no puede estar vacía");
        }

        int mayor = numeros.get(0);

        for (int n : numeros) {
            if (n > mayor) {
                mayor = n;
            }
        }

        return mayor;
    }

    public static int encontrarMenor(List<Integer> numeros) {
        if (numeros == null || numeros.isEmpty()) {
            throw new IllegalArgumentException("La lista no puede estar vacía");
        }

        int menor = numeros.get(0);

        for (int n : numeros) {
            if (n < menor) {
                menor = n;
            }
        }

        return menor;
    }
}