package J07_docghiFIle;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J07081 {
public static void main(String[] args)throws IOException {
	String path="E:\\Code\\Eclip\\eclipse-workspace\\CODETIT\\src\\J07_docghiFIle\\SV.in.txt";
    Scanner sc= new Scanner(new File(path));
    int n= Integer.parseInt(sc.nextLine());
   // System.out.println(n);
    ArrayList<svvv> ds =new ArrayList<svvv>();
    while(n-->0) {
    	ds.add(new svvv(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine()));
    }
    
    Collections.sort(ds);
    for (svvv svvv : ds) {
		System.out.println(svvv);
	}

}
}
class svvv implements Comparable<svvv>{
	private String ma,ten,sdt,em, sor;

	public svvv(String ma, String ten, String sdt, String em) {

		this.ma = ma;
		this.ten = ten;
		this.sdt = sdt;
		this.em = em;
		
		String[] he=ten.split(" ");
		String tam= he[he.length-1];
		for(int i=0;i<he.length;i++) {
			tam+=" "+he[i];
		}
		tam=tam+" "+ma;
		this.sor=tam;
	}

	@Override
	public String toString() {
		String he=String.format("%s %s %s %s", ma,ten,sdt,em);
				
		return he;
	}

	@Override
	public int compareTo(svvv o) {
		// TODO Auto-generated method stub
		return this.sor.compareTo(o.sor);
	}
	
	
}
