package J05_array_object;

import java.io.File;

import java.util.Scanner;
import java.io.IOException;
public class J05066 {
	public static void main(String[] args)throws IOException {
		String path = "E:\\Code\\Eclip\\eclipse-workspace\\CODETIT\\src\\J07_docghiFIle\\SV.in.txt";
		Scanner sc = new Scanner(new File(path));
		int n = Integer.parseInt(sc.nextLine());
		int dem = 0;
		while (n-- > 0) {
			dem++;
			//sc.nextLine();
			String ten = sc.nextLine();
			String nam = sc.nextLine();
			double d1 = sc.nextDouble();
			double d2 = sc.nextDouble();
			System.out.println(ten + " " + nam + " " + d2 + d1);
		}
	}
}
