package tudelft.GreatLess;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MayorMenorTest {

    @Test
    void testEncontrarMayor() {
        List<Integer> lista = Arrays.asList(3, 8, 1, 9, 4);

        int resultado = MayorMenor.encontrarMayor(lista);

        assertEquals(9, resultado);
    }

    @Test
    void testEncontrarMenor() {
        List<Integer> lista = Arrays.asList(3, 8, 1, 9, 4);

        int resultado = MayorMenor.encontrarMenor(lista);

        assertEquals(1, resultado);
    }

    @Test
    void testListaUnElemento() {
        List<Integer> lista = Arrays.asList(5);

        assertEquals(5, MayorMenor.encontrarMayor(lista));
        assertEquals(5, MayorMenor.encontrarMenor(lista));
    }

    @Test
    void testListaConNegativos() {
        List<Integer> lista = Arrays.asList(-5, -2, -9, -1);

        assertEquals(-1, MayorMenor.encontrarMayor(lista));
        assertEquals(-9, MayorMenor.encontrarMenor(lista));
    }

    @Test
    void testListaVacia() {
        List<Integer> lista = Arrays.asList();

        assertThrows(IllegalArgumentException.class, () -> {
            MayorMenor.encontrarMayor(lista);
        });
    }
}