package J02_array;

import java.util.Scanner;

public class J02011_SAPXEPCHON {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < n - 1; i++) {
			
			int min = i;
			for (int j = i + 1; j < n; j++) {
				if (arr[j] < arr[min]) {
					min = j;
					
				}
			}
			
			int tam = arr[i];
			arr[i] = arr[min];
			arr[min] = tam;
			System.out.print("Buoc " + (i+1) + ":");
			for (int j = 0; j < n; j++) {
				System.out.print(" "+arr[j] );
			}
			System.out.println();
		}

	}
}
