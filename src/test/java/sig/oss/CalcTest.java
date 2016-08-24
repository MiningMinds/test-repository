public static org.junit.Assert.*;
import org.junit.Test;
public class CalcTest{
	@Test
	public void testAdd(){
		Calc c = new Calc();
		assertEquals(30, c.add(10,20));
	}
	@Test
	public void testSub(){
		assertEquals(10, c.sub(20,10));
	}
	@Test
	public void testMul(){
		assertEquals(200, c.mul(20,10));
	}
}
