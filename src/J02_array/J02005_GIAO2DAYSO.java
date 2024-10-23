package Mang;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class code27 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int m=sc.nextInt();
	int[]arr1=new int[100];
	Set<Integer> set2=new TreeSet<>();
	Set<Integer> set=new TreeSet<>();
	for(int i=0;i<n;i++) {
		int x=sc.nextInt();
		set.add(x);
	}
	for(int i=0;i<m;i++) {
		int x=sc.nextInt();
		if(set.contains(x)) {
			set2.add(x);
		}
	}
	for(int x:set2) {
		System.out.printf(x+" ");
	
	
	}
	
	
	
}
}
package J02_array;

public class J02005_GIAO2DAYSO {

}
