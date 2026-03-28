package tudelft.caesarshift;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CaesarShiftCipherTest {

    @Test
    public void testBasicShift() {
        CaesarShiftCipher c = new CaesarShiftCipher();
        assertEquals("def", c.CesarShiftCipher("abc", 3));
    }

    @Test
    public void testWrapAround() {
        CaesarShiftCipher c = new CaesarShiftCipher();
        assertEquals("abc", c.CesarShiftCipher("xyz", 3));
    }

    @Test
    public void testNegativeShift() {
        CaesarShiftCipher c = new CaesarShiftCipher();
        assertEquals("xyz", c.CesarShiftCipher("abc", -3));
    }

    @Test
    public void testInvalidCharacters() {
        CaesarShiftCipher c = new CaesarShiftCipher();
        assertEquals("invalid", c.CesarShiftCipher("abc1", 3));
    }

    @Test
    public void testEmptyString() {
        CaesarShiftCipher c = new CaesarShiftCipher();
        assertEquals("", c.CesarShiftCipher("", 3));
    }
}
