import org.junit.Test;
import static junit.framework.TestCase.assertEquals;

public class Test {
	@Test
	public void TestCase1() {
		Hanoi hanoi = new Hanoi();
		assertEquals(1, hanoi.calcMovimentos(1));
		assertEquals(3, hanoi.calcMovimentos(2));
		assertEquals(7, hanoi.calcMovimentos(3));
		assertEquals(15, hanoi.calcMovimentos(4));
	}
}
