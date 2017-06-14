package com.gwh.bhcs;

import java.util.Scanner;

/**
 * 输入日期判断星期几
 * 
 * @author guowenhao
 * @version 2.0
 */
public class WeekDay {
	// 初始化每个月有几天，不可修改
	final private static int[] monthDay = new int[] { 29, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	// 初始化每个中文输出，不可修改
	final private static String[] week = new String[] { "天", "一", "二", "三", "四", "五", "六", };

	public static void main(String[] args) {
		// 得到输入的合法日期
		Scanner sc = new Scanner(System.in);
		int[] date = receiveDate(sc);
		sc.close();

		// 接收输入的 年 月 日
		int year = date[0];
		int month = date[1];
		int day = date[2];

		// 定义第一天为星期一
		int firstday = 1;
		// 当前的这一天为星期一
		int thisday = 1;

		// 当前这一年的第一天是星期几
		for (int i = 1; i < year; i++) {
			if (isRunnian(i))
				firstday = (firstday + 366) % 7;
			else
				firstday = (firstday + 365) % 7;
		}

		// 当前这个月的第一天是星期几
		for (int i = 1; i < month; i++) {
			if (i == 2 && isRunnian(year))
				firstday = (firstday + monthDay[0]) % 7;
			else
				firstday = (firstday + monthDay[i]) % 7;
		}

		// 当前这个月的这一天是星期几
		thisday = (firstday + day - 1) % 7;
		System.out.println(year + "年" + month + "月" + day + "日是星期" + week[thisday]);
	}

	/**
	 * 判断这一年是否为闰年
	 * 
	 * @param year
	 *            要判断的年份
	 * @return 是闰年返回true 不是闰年返回falase
	 */
	private static boolean isRunnian(int year) {
		if (year % 400 == 0)
			return true;
		else if (year % 4 == 0 && year % 100 != 0)
			return true;
		else
			return false;
	}

	/**
	 * 判断输入的日期是否合法，合法返回输入，不合法则重新输入
	 * 
	 * @param sc
	 *            接收器
	 * @return 合法的日期数组
	 */
	private static int[] receiveDate(Scanner sc) {
		int[] date = new int[3];
		while (true) {
			try {
				System.out.println("请输入日期（例如1980-3-15）：");
				String input = sc.nextLine();
				String[] strDate = new String[3];
				// 分割输入的日期
				strDate = input.split("-");
				date[0] = Integer.parseInt(strDate[0]);
				date[1] = Integer.parseInt(strDate[1]);
				date[2] = Integer.parseInt(strDate[2]);
				// 日期应大于0
				if (date[0] < 1 || date[1] < 1 || date[2] < 1) {
					System.out.println("日期应为正数，请重新输入！");
					continue;
				}
				// 月份不能超过12
				else if (date[1] > 12) {
					System.out.println("月份不能大于12，请重新输入！");
					continue;
				} else if (isCorrectDate(date))
					break;
				else {
					if (date[1] == 2 && isRunnian(date[0]))
						System.out.println("日期输入有误，" + date[0] + "年的" + date[1] + "月最多只有" + monthDay[0] + "号，没有"
								+ date[2] + "号，请重新输入！");
					else
						System.out.println("日期输入有误，" + date[0] + "年的" + date[1] + "月最多只有" + monthDay[date[1]] + "号，没有"
								+ date[2] + "号，请重新输入！");
					continue;
				}
			} catch (NumberFormatException e) {
				System.out.println("输入日期应为不能超过" + Integer.MAX_VALUE + "的正整数，请重新输入！");
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("输入日期应用 - 分隔，请重新输入！");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return date;
	}

	/**
	 * 判断输入的日期是否合法
	 * 
	 * @param date
	 *            输入的日期
	 * @return 合法返回true 不合法返回false
	 */
	private static boolean isCorrectDate(int[] date) {
		if (date[1] == 2 && isRunnian(date[0])) {
			if (date[2] > monthDay[0]) {
				return false;
			} else {
				return true;
			}
		} else {
			if (date[2] > monthDay[date[1]]) {
				return false;
			} else {
				return true;
			}
		}
	}
}
