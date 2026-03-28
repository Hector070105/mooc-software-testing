package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GHappyTest {
	@Test
	public void allGsAreHappy() {
	    GHappy g = new GHappy();
	    Assertions.assertTrue(g.gHappy("xxggxx"));
	}

	@Test
	public void singleGIsNotHappy() {
	    GHappy g = new GHappy();
	    Assertions.assertFalse(g.gHappy("xxgxx"));
	}

	@Test
	public void mixedCaseNotAllHappy() {
	    GHappy g = new GHappy();
	    Assertions.assertFalse(g.gHappy("xxggyygxx"));
	}

	@Test
	public void emptyString() {
	    GHappy g = new GHappy();
	    Assertions.assertTrue(g.gHappy(""));
	}
}
