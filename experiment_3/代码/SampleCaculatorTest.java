package com.gwh.JUnit;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * 2017-6-14 19:27:16<br>
 * 用JUnit为类SampleCaculator自动生成的测试类<br>
 * 
 * @author guowenhao
 */
public class SampleCaculatorTest {
	SampleCaculator sampleCaculator = new SampleCaculator();

	@Test
	public void testAdd() {
		int result = sampleCaculator.add(10, 20);
		assertEquals(30, result);
		// assertEquals(40, result);
		// fail("Not yet implemented");
	}

	@Test
	public void testSub() {
		int result = sampleCaculator.sub(10, 20);
		assertEquals(-10, result);
		// assertEquals(40, result);
		// fail("Not yet implemented");
	}
}
