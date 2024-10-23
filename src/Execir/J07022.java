package Execir;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J07022 {
	public static boolean check(String a) {
		try {
			int x=Integer.parseInt(a);
			return false;
		} catch (Exception e) {
			// TODO: handle exception
			return true;
		}
	}
public static void main(String[] args) throws IOException {
	Scanner sc=new Scanner(new File("DATA.in"));
	ArrayList<String> ds=new ArrayList<String>();
	while(sc.hasNext()) {
		String a=sc.next();
		if(check(a)) ds.add(a);
	}
	Collections.sort(ds);
	for (String string : ds) {
		System.out.print(string+" ");
	}
			
}
}
