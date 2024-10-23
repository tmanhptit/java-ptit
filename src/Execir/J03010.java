package Execir;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class J03010 {
	public static String chuyen(String s) {
		Scanner doc=new Scanner(s);
		String tam="";
		while(doc.hasNext()) {
			tam+=doc.next().toLowerCase()+" ";
		}
		String[] he= tam.split(" ");
		String tamm="";
		for(int i=0;i<he.length-1;i++) {
			tamm+=he[i].substring(0, 1);
		}
		return he[he.length-1]+tamm;
	}
public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 int t=sc.nextInt();
	 sc.nextLine();
	 Map<String, Integer> map =new HashMap<String, Integer>();
	 while(t-->0) {
		 String a=sc.nextLine();
		 //System.out.println(chuyen(a));
		 if(!map.containsKey(chuyen(a))){
			 map.put(chuyen(a), 1);
			 System.out.println(chuyen(a)+"@ptit.edu.vn");
		 }else {
			 map.put(chuyen(a), map.get(chuyen(a))+1);
			 System.out.println(chuyen(a)+map.get(chuyen(a))+"@ptit.edu.vn");
		 }
		 
	 }
	 
}
}
/*
4
nGUYEn    quaNG   vInH  
tRan   thi THU    huOnG
nGO   quoC  VINH
lE            tuAn    aNH
*/