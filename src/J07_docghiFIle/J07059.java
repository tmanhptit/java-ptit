package J07_docghiFIle;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.io.File;
public class J07059 {
public static void main(String[] args)throws IOException {
	String path="E:\\Code\\Eclip\\eclipse-workspace\\CODETIT\\src\\J07_docghiFIle\\SV.in.txt";
    Scanner sc=new Scanner(new File(path));
    ArrayList<ca> ds=new ArrayList<ca>();
    int n=Integer.parseInt(sc.nextLine());
    int dem=0;
    while(n-->0) {
    	dem++;
    	String ns=sc.nextLine().trim();
    	String gio=sc.nextLine().trim();
    	String ma=sc.nextLine();
    	ds.add(new ca(ns+" "+gio, dem, ma));
    }
    Collections.sort(ds);
    for (ca ca : ds) {
		System.out.println(ca);
	}
}
}
class ca implements Comparable<ca>{
	private LocalDateTime nn;
	private String ma, ID;
	public ca(String nn, int ma, String iD) {
		DateTimeFormatter dfs= DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		this.nn = LocalDateTime.parse(nn,dfs);
		this.ma = String.format("C%03d", ma);
		ID = iD;
	}
	
	@Override
	public String toString() {
		DateTimeFormatter dfs= DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		return ma+" " + nn.format(dfs)  + " " + ID + "";
	}

	@Override
	public int compareTo(ca o) {
		// TODO Auto-generated method stub
		return this.nn.compareTo(o.nn);
	}
	
}