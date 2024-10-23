package J07_docghiFIle;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J07072 {
	public static String chuan(String a) {
		try (Scanner doc = new Scanner(a)) {
			String tam="";
			while(doc.hasNext()) {
				String t=doc.next().toLowerCase();
				tam+=t.substring(0, 1).toUpperCase()+t.substring(1, t.length())+" ";
			}
			return tam.substring(0, tam.length()-1);
		}
	}
public static void main(String[] args)throws IOException {
	String path="E:\\Code\\Eclip\\eclipse-workspace\\CODETIT\\src\\J07_docghiFIle\\SV.in.txt";
	Scanner sc=new Scanner(new File(path));
	ArrayList<hihi> ds=new ArrayList<hihi>();
	while(sc.hasNext()) {
		String ten=sc.nextLine();
		//System.out.println(chuan(ten));
		String[] ee=chuan(ten).split(" ");
		String nguoc=ee[ee.length-1];
		for(int i=0;i<ee.length-1;i++) {
			nguoc+=" "+ee[i];
		}
		//System.out.println(nguoc);
		ds.add(new hihi(chuan(ten),nguoc));
	}
	Collections.sort(ds);
	for (hihi string : ds) {
		System.out.println(string);
	}
}
}
class hihi implements Comparable<hihi>{
	private String ten;
    private String nguoc;
	public hihi(String ten,String nguoc) {
	this.nguoc=nguoc;
		this.ten = ten;
	}
    
	@Override
	public String toString() {
		return "" + ten + "";
	}

	@Override
	public int compareTo(hihi o) {
		// TODO Auto-generated method stub
		return this.nguoc.compareTo(o.nguoc);
	}
	
}
