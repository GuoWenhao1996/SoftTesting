package com.gwh.bhcs;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		DoWork(x, y, z);
	}

	public static void DoWork(int x, int y, int z) {
		int k = 0, j = 0;
		if ((x > 3) && (z < 10)) {
			k = x * y - 1;
			j = (int)Math.sqrt(k);
		}
		System.out.println(k + " " + j);
		if ((x == 4) || (y > 5))
			j = x * y + 10;
		j = j % 3;
		System.out.println(k + " " + j);
	}
}
