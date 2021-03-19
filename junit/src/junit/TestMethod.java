package junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestMethod {
	Math math;
	@BeforeEach
	void init() {
		math= new Math();
	}

	@Test
	void testAdd() {
		int result= math.add(1,2,3);
		Assert.assertEquals(6, result);
	}
	
	void testAddNegativeNumbers() {
		int result= math.add(-1,-2,-3);
		Assert.assertEquals(-6, result);
	}
   
	void testMultiply() {
		int result= math.multiply(5,1);
		Assert.assertEquals(5, result);
	}
	
	void testMultiplyWithZero() {
		int result= math.multiply(5,0);
		Assert.assertEquals(0, result);
	}
	
	void testMultiplyWithNegative() {
		Exception exception = assertThrows(IllegalArguementException.class,()->{
		int result= math.multiply(-5,-1);
		Assert.assertEquals(5, result);
	});



}
