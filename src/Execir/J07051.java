package Execir;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class J07051 {
	public static String du(String date) {
		String you=date.trim();
		String[] he=you.split("/");
		return String.format("%02d/%02d/%d", Integer.parseInt(he[0]),Integer.parseInt(he[1]),Integer.parseInt(he[2]));
	}
	public static long ch(String den,String di) {
		DateTimeFormatter dfs=DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate in=LocalDate.parse(du(den),dfs);
		LocalDate out=LocalDate.parse(du(di),dfs);
		return ChronoUnit.DAYS.between(in, out)+1;
		
	}
public static void main(String[] args) throws IOException {
	String path="E:\\Code\\Eclip\\eclipse-workspace\\CODETIT\\src\\Execir\\manh.txt";
	Scanner sc=new Scanner(new File(path));
	ArrayList<he> ds=new ArrayList<he>();
	int n=Integer.parseInt(sc.nextLine());
	int dem=0;
	while(n-->0) {
		dem++;
		String ten=sc.nextLine();
		String phong=sc.nextLine();
		String den=sc.nextLine();
		String di=sc.nextLine();
		Long ps=Long.parseLong(sc.nextLine().trim());
		ds.add(new he(dem, ten, phong, ch(den,di), ps));
	}
	Collections.sort(ds);
	for (he he : ds) {
		System.out.println(he);
	}
}
}
class he implements Comparable<he>{
    private String ma,ten,phong;
    private Long songay, thanhtien;
    
	public he(int ma, String ten, String phong, Long songay,Long ps) {
	
		this.ma = String.format("KH%02d", ma);

        Scanner sc=new Scanner(ten);
		String tam="";
		while(sc.hasNext()) {
			String tu=sc.next().toLowerCase();
			tam+=tu.substring(0, 1).toUpperCase()+tu.substring(1, tu.length())+" ";
		}
		this.ten=tam;
		
		this.phong = phong.trim();
		if(phong.charAt(0)=='1') {
			this.thanhtien=songay*25+ps;
		}else if(phong.charAt(0)=='2') {
			this.thanhtien=songay*34+ps;
		}else if(phong.charAt(0)=='3') {
			this.thanhtien=songay*50+ps;
		}else this.thanhtien=songay*80+ps;
		
		this.songay = songay;
	}

	@Override
	public String toString() {
		return String.format("%s %s%s %d %d", ma,ten,phong,songay,thanhtien);
	}

	@Override
	public int compareTo(he o) {
		// TODO Auto-generated method stub
		return Long.compare(o.thanhtien, this.thanhtien);
	}
	
}