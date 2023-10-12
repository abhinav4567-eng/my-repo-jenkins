package devops;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestClassCalc {
	
	MyCalc ob = new MyCalc();
	
	
	@Test
	public void test_sum() {
	
		assertEquals(25, ob.sum(15, 10));
	}
	
	@Test
	public void test_sub() {
	
		assertEquals(5, ob.sub(15, 10));
	}
	
	@Test
	public void test_mul() {
	
		assertEquals(150, ob.mul(15, 10));
	}
	
	
	@Test
	public void test_div() {
	
		assertEquals(3, ob.div(15, 5));
	}

}
