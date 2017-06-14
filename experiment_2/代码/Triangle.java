package com.gwh.hhcs;

import java.util.Scanner;

/**
 * 三角形类 用于练习黑盒测试
 * 
 * @author guowenhao
 * @version 1.0
 */
public class Triangle {
	public static void main(String[] args) {
		// 接收器初始化
		Scanner sc = new Scanner(System.in);
		// 三角形三边初始化
		double edge1 = 0;
		double edge2 = 0;
		double edge3 = 0;
		// 接收三角形三边
		System.out.println("即将录入三角形的边长......");
		edge1 = receiveEdge(sc, "一");
		edge2 = receiveEdge(sc, "二");
		edge3 = receiveEdge(sc, "三");
		// 判断是否能够成三角形
		if (IsTriangle(edge1, edge2, edge3)) {
			System.out.println("周长为" + (edge1 + edge2 + edge3));
			// 判断能否构成等边三角形
			if (IsEquilateralTriangle(edge1, edge2, edge3)) {
				System.out.println("等边三角形");
			}
			// 判断能否构成等腰三角形
			else if (IsIsoscelesTriangle(edge1, edge2, edge3)) {
				System.out.println("等腰三角形");
			} else {

			}
		} else {
			System.out.println("此三边无法构成三角形！程序结束！");
		}
		sc.close();
	}

	/**
	 * 判断是否为等边三角形
	 * 
	 * @param edge1
	 *            第一条边的边长
	 * @param edge2
	 *            第二条边的边长
	 * @param edge3
	 *            第三条边的边长
	 * @return 是等边三角形返回true 不是等边三角形返回false
	 */
	private static boolean IsEquilateralTriangle(double edge1, double edge2, double edge3) {
		if (edge1 == edge2 && edge1 == edge3)
			return true;
		else
			return false;
	}

	/**
	 * 判断是否为等腰三角形
	 * 
	 * @param edge1
	 *            第一条边的边长
	 * @param edge2
	 *            第二条边的边长
	 * @param edge3
	 *            第三条边的边长
	 * @return 是等腰三角形返回true 不是等腰三角形返回false
	 */
	private static boolean IsIsoscelesTriangle(double edge1, double edge2, double edge3) {
		if (edge1 == edge2 || edge1 == edge3 || edge2 == edge3)
			return true;
		else
			return false;
	}

	/**
	 * 判断输入的边长是否合法，合法返回输入，不合法则重新输入
	 * 
	 * @param sc
	 *            接收器
	 * @param index
	 *            第几条边
	 * @return 合法的边长
	 */
	private static double receiveEdge(Scanner sc, String index) {
		double edge = 0;
		while (true) {
			try {
				System.out.println("请输入第" + index + "条边：");
				String input = sc.nextLine();
				edge = Double.parseDouble(input);
				if (edge > 0)
					break;
				else {
					System.out.println("第" + index + "条边输入有误，边长应为正数，请重新输入！");
					continue;
				}
			} catch (NumberFormatException e) {
				System.out.println("第" + index + "条边输入有误，边长应为数字，请重新输入！");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return edge;
	}

	/**
	 * 通过输入的三边确定是否能构成三角形
	 * 
	 * @param edge1
	 *            第一条边的边长
	 * @param edge2
	 *            第二条边的边长
	 * @param edge3
	 *            第三条边的边长
	 * @return 能构成三角形返回true 不能构成三角形返回false
	 */
	private static boolean IsTriangle(double edge1, double edge2, double edge3) {
		if (edge1 < edge2 + edge3 && edge2 < edge1 + edge3 && edge3 < edge1 + edge2 && edge1 > Math.abs(edge2 - edge3)
				&& edge2 > Math.abs(edge1 - edge3) && edge3 > Math.abs(edge1 - edge2))
			return true;
		else
			return false;
	}
}
