package Mang;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

public class code42_DanhSachCanh {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x;
		for (int i = 1; i <= n; i++) {
			if (i == n)
				continue;
			for (int j = 1; j <= n; j++) {
				x = sc.nextInt();
				if (x == 1 && j > i) {
					System.out.printf("(%d,%d)", i, j);
					System.out.println("");
				}
			}
		}
	}
}
package J02_array;

public class J02104_dANHSACHCANH {

}
