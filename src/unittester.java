import static org.junit.Assert.*;

import org.junit.Test;

public class unittester {

	@Test
	public void unittest() {
        UnitTestClass sum = new UnitTestClass();
        int result = sum.square(5);
        assertEquals(25, result);
	}

}
