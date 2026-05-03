package tudelft.mirror;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MirrorTest {

    @Test
    void cadenaConExtremosReflejados() {
        Mirror mirror = new Mirror();

        assertEquals("ab", mirror.mirrorEnds("abXYZba"));
    }

    @Test
    void cadenaConUnCaracterReflejado() {
        Mirror mirror = new Mirror();

        assertEquals("a", mirror.mirrorEnds("abca"));
    }

    @Test
    void cadenaPalindromaImpar() {
        Mirror mirror = new Mirror();

        assertEquals("aba", mirror.mirrorEnds("aba"));
    }

    @Test
    void cadenaPalindromaPar() {
        Mirror mirror = new Mirror();

        assertEquals("abba", mirror.mirrorEnds("abba"));
    }

    @Test
    void cadenaSinCoincidencia() {
        Mirror mirror = new Mirror();

        assertEquals("", mirror.mirrorEnds("abc"));
    }
}