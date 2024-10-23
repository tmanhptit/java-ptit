package Execir;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class a02 {
	public static int n=5,k=3;
	public static boolean check;
	public static int a[]=new int[n];
	public static void khoitao() {
		for(int i=1;i<=k;i++) {
			a[i]=i;
		}
	}
	public static void sinh() {
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
	public static void in() {
		for(int i=1;i<=k;i++) {
			System.out.print(a[i]+" ");
		}System.out.println();
	}
	public static void main(String[] args) {
		check=false;
		khoitao();
		while(!check) {
			in();
			sinh();
		}
		
	}
	
}
// 48 0
// 53 5
//57 9