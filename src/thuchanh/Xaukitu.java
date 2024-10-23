package thuchanh;

import java.io.IOException;
import java.util.Scanner;
import java.util.TreeSet;
import java.io.File;

public class Xaukitu {
	public static boolean check(String s) {
		for (int i = 0; i < s.length(); i++) {
			
			//System.out.println((int)i);
			if((int)s.charAt(i)<64) return false;
			if((int)s.charAt(i)>90&&(int)s.charAt(i)<97) return false;
			if((int)s.charAt(i)>122)return false;
		}
		return true;
	}

	public static void main(String[] args) throws IOException {

		String path = "E:\\Code\\Eclip\\eclipse-workspace\\CODETIT\\src\\thuchanh\\vanban.in.txt";
		Scanner sc = new Scanner(new File(path));
		TreeSet<String> set = new TreeSet<String>();
		while (sc.hasNext()) {
			String e = sc.next();
			//System.out.println(e);
			if (check(e))
				set.add(e);
		}
		for (String string : set) {
			System.out.println(string);
		}
	}
}
