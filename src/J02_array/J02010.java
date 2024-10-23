package J02_array;


import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class J02010 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	//Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	
	int[] arr = new int[n];
	for (int i = 0; i < n; i++) {
		arr[i] = sc.nextInt();
	}
	for(int i=0;i<n-1;i++) {
		System.out.printf("Buoc %d: ",i+1);
		for(int j=i+1;j<n;j++) {
			if(arr[i]>arr[j]) {
				int stem=arr[i];
				arr[i]=arr[j];
				arr[j]=stem;
			}
		}
		for(int e=0;e<n;e++) {
			System.out.print(arr[e]+" ");
		}
		System.out.println();
	}
	
}
}

