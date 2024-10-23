package J07_docghiFIle;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.io.File;

public class J07084 {
	public static long he(String den,String di) {
		DateTimeFormatter dfs=DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		LocalDateTime in=LocalDateTime.parse(den, dfs);
		LocalDateTime out=LocalDateTime.parse(di,dfs);
		return ChronoUnit.MINUTES.between(in, out);
	}
public static void main(String[] args)throws IOException {
	String path="E:\\Code\\Eclip\\eclipse-workspace\\CODETIT\\src\\J07_docghiFIle\\SV.in.txt";
	Scanner sc=new Scanner(new File(path));
	
	ArrayList<kk> ds=new ArrayList<>();
	int n=Integer.parseInt(sc.nextLine());
	while(n-->0) {
		String ten=sc.nextLine();
		String den=sc.nextLine();
		String di=sc.nextLine();
		ds.add(new kk(ten, he(den,di)));
	}
	Collections.sort(ds);
	for (kk kk : ds) {
		System.out.println(kk);
	}
}
}
class kk implements Comparable<kk>{
	private String ten;
	private long timee;
	public kk(String ten, long timee) {
		super();
		this.ten = ten;
		this.timee = timee;
	}
	@Override
	public String toString() {
		return "" + ten + " " + timee + "";
	}
	@Override
	public int compareTo(kk o) {
		// TODO Auto-generated method stub
		return Long.compare(o.timee, this.timee);
	}

}
