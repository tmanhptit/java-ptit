package J02_array;


import java.sql.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class J02012_SapXepChen {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		for (int i = 0; i < n; i++) {
			
			Arrays.sort(arr, 0, i+1);
			System.out.print("Buoc "+i+": ");
			for(int j=0;j<=i;j++) {
				System.out.print(arr[j]+" ");
			}
			System.out.println();
		}

	}
}
