package J07_docghiFIle;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Deobiet {
	public static void main(String[] args) throws FileNotFoundException {
		
	

		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ten file:");
		
		String ten = sc.nextLine().trim();
		String path = "C:\\Users\\ADMIN\\eclipse-workspace\\CODETIT\\src\\J07_docghiFIle\\" + ten;
		//C:\Users\ADMIN\eclipse-workspace\CODETIT\src\J07_docghiFIle\SV.in.txt
		//System.out.println(path);
		Scanner in = new Scanner(new File(path));
		ArrayList<String> ds = new ArrayList<>();
		
		while (in.hasNext()) {
			String line = in.nextLine();
			Scanner hihi = new Scanner(line);
			while (hihi.hasNext()) {
				ds.add(hihi.next());
			}

		}
		while(true) {
		System.out.println("---->nhap chuoi can tim");
		String chuoi=sc.nextLine().trim();
	
		for (String tu : ds) {
			if(tu.contains(chuoi))
				System.out.println(tu);
		}
		}
	}
}
