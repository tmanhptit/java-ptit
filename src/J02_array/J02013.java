package J02_array;

import java.util.Scanner;


public class J02013 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
	
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int dem=1;
		while(true) { 
			boolean check=true;
		for (int i = 0; i < n-1 ; i++) {
			if(arr[i]>arr[i+1]) {
				int tam=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=tam;
				check=false;
			}
		}
		if(check) break;
		System.out.printf("Buoc %d:",dem++);
		for(int i=0;i<n;i++) {
		System.out.print(" "+arr[i]);
		}
		System.out.println();
		}

	}
}
