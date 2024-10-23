package J02_array;

import java.util.Scanner;

public class J02021{
	public static int n, k;
	public static boolean check;
	public static int[] arr = new int[11];

	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    n=sc.nextInt();
    k=sc.nextInt();
    check=true;
    khoitao();
    int dem=0;
    while(check) {
    	dem++;
    	input();
    	sinh();
    }
   
    System.out.printf("Tong cong co %d to hop",dem);
	}
	public static void khoitao() {
		for(int i=1;i<=k;i++) {
			arr[i]=i;
		}
	}
	public static void input() {
		for(int i=1;i<=k;i++) {
			System.out.print(arr[i]+" ");
	
		}
		System.out.println();
	}
	public static void sinh() {
		int i=k;
		while(arr[i]==n-k+i) {
			i--;
		}
		
		if(i<=0) check=false;
		else {
			arr[i]++;
			for(int j=i+1;j<=k;j++) {
				arr[j]=arr[j-1]+1;
			}
		}
	}
}

