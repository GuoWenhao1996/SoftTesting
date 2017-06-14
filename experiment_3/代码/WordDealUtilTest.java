package com.gwh.JUnit;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * 2017-6-14 19:51:02<br>
 * 用JUnit为类WordDealUtil自动生成的测试类<br>
 * 
 * @author guowenhao
 */
public class WordDealUtilTest {

	@Test
	public void testWordFormat4DB() {
		String target = "employeeInfo";
		String result = WordDealUtil.wordFormat4DB(target);
		assertEquals("employee_info", result);
		// fail("Not yet implemented");
	}

	@Test
	public void testWordFormat4DBNull() {
		String target = null;
		String result = WordDealUtil.wordFormat4DB(target);
		assertNull(result);
	}

	@Test
	public void testWordFormat4DBEmpty() {
		String target = "";
		String result = WordDealUtil.wordFormat4DB(target);
		assertEquals("", result);
	}

	@Test
	public void testWordFormat4DBBegin() {
		String target = "EmployeeInfo";
		String result = WordDealUtil.wordFormat4DB(target);
		assertEquals("employee_info", result);
	}

	@Test
	public void testWordFormat4DBEnd() {
		String target = "employeeInfoA";
		String result = WordDealUtil.wordFormat4DB(target);
		assertEquals("employee_info_a", result);
	}

	@Test
	public void testWordFormat4DBTogether() {
		String target = "employeeAInfo";
		String result = WordDealUtil.wordFormat4DB(target);
		assertEquals("employee_a_info", result);
	}

}
