package Execir;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class a07 {
	
	public static boolean check;
	public static int a[];
	public static void khoitao(int k) {
		for(int i=1;i<=k;i++) {
			a[i]=i;
		}
	}
	public static void sinh(int n,int k) {
		int i=k;
		while(a[i]==n-k+i) i--;
		
		if(i<=0) check=true;
		else {
			a[i]++;
			for(int j=i+1;j<=k;j++) {
				a[j]=a[j-1]+1;
			}
		}
	}
	public static void in(int k,int[] arr) {
		for(int i=1;i<=k;i++) {
			System.out.print(arr[a[i]-1]+" ");
		}System.out.println();
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		Set<Integer> s=new TreeSet<>();
		for(int i=0;i<n;i++) {
			s.add(sc.nextInt());
		}
		int[]arr=new int[s.size()+10];
		int dem=0;
		for (Integer i : s) {
			arr[dem]=i;
			dem++;
		}
		System.out.println(dem+" "+k);
		a=new int[dem];
		khoitao(k);
		check=false;
		while(!check) {
			in(k,arr);
			sinh(n,k);
		}
	}
}
