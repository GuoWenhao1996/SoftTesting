package com.gwh.JUnit;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * 2017-6-14 20:35:43<br>
 * 用JUnit为类SelfAsses自动生成的测试类<br>
 * 
 * @author guowenhao
 */
public class SelfAssesTest {

	// 正常测试
	@Test
	public void testIsNull() {
		String target = "自我评价修改成功！";
		String result = SelfAsses.isNull("我很厉害！", true);
		assertEquals(target, result);
	}

	// 输入为空并且确认提交
	@Test
	public void testIsNullStringNullTrue() {
		String target = "自我评价修改成功！";
		String result = SelfAsses.isNull(null, true);
		assertEquals(target, result);
	}

	// 输入为空并且取消提交
	@Test
	public void testIsNullStringNullFalse() {
		String target = "未提交！";
		String result = SelfAsses.isNull(null, false);
		assertEquals(target, result);
	}

	// 输入为空串并且确认提交
	@Test
	public void testIsNullStringEmptyTrue() {
		String target = "自我评价修改成功！";
		String result = SelfAsses.isNull("", true);
		assertEquals(target, result);
	}

	// 输入为空串并且取消提交
	@Test
	public void testIsNullStringEmptyFalse() {
		String target = "未提交！";
		String result = SelfAsses.isNull("", false);
		assertEquals(target, result);
	}

	// 输入为空串并且确认提交
	@Test
	public void testIsNullStringSpaceTrue() {
		String target = "自我评价修改成功！";
		String result = SelfAsses.isNull("   ", true);
		assertEquals(target, result);
	}

	// 输入为空串并且取消提交
	@Test
	public void testIsNullStringSpaceFalse() {
		String target = "未提交！";
		String result = SelfAsses.isNull("   ", false);
		assertEquals(target, result);
	}

	// 输入字符串开始为空格
	@Test
	public void testIsNullStringBeginEmpty() {
		String target = "自我评价修改成功！";
		String result = SelfAsses.isNull("   我很厉害！", true);
		assertEquals(target, result);
	}

	// 输入字符串结束为空格
	@Test
	public void testIsNullStringEndEmpty() {
		String target = "自我评价修改成功！";
		String result = SelfAsses.isNull("我很厉害！   ", true);
		assertEquals(target, result);
	}
}
