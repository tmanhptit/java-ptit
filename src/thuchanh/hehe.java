package thuchanh;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
class hehe{
	public static int[] a=new int[21];
	public static int[] X=new int[21];
	public static int n;
	public static ArrayList<String> ds=new ArrayList<String>();
	
	public static void main(String[] args)throws IOException {
		String p="E:\\Code\\Eclip\\eclipse-workspace\\CODETIT\\src\\thuchanh\\vanban.in.txt";
		Scanner sc=new Scanner(new File(p));
		n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			a[i]=sc.nextInt();
		}
		Try(1);
		Collections.sort(ds);
		for (String string : ds) {
			System.out.println(string);
		}
	}
	public static void luu(int p) {
		String kq="";
		for(int i=1;i<p;i++) {
			if(a[X[i]]>a[X[i+1]])return ;
			kq+=a[X[i]]+" ";
		}
		kq+=a[X[p]];
		ds.add(kq);
	}
	public static void Try(int i) {
		for(int j=1;j<=n;j++) {
			if(j>X[i-1]) {
				X[i]=j;
				if(i>1&&i<n) luu(i);
				if(i<n) Try(i+1);
			}
		}
	}
}