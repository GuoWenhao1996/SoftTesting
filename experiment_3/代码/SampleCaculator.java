package com.gwh.JUnit;

/**
 * 2017-6-14 19:14:58<br>
 * <b>JUnit测试一</b><br>
 * 简单计算器，用于练习JUnit
 * 
 * @author guowenhao
 *
 */

public class SampleCaculator {
	/**
	 * 加法
	 * 
	 * @param firstAddNum
	 *            第一个加数
	 * @param lastAddNum
	 *            第二个加数
	 * @return 和
	 */
	public int add(int firstAddNum, int lastAddNum) {
		return firstAddNum + lastAddNum;
	}

	/**
	 * 减法
	 * 
	 * @param firstSubNum
	 *            被减数
	 * @param lastSubNum
	 *            减数
	 * @return 差
	 */
	public int sub(int firstSubNum, int lastSubNum) {
		return firstSubNum - lastSubNum;
	}
}
