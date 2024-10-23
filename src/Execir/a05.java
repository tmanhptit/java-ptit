package Execir;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class a05 {
	public static long chenh(String den,String di) {

		DateTimeFormatter fo=DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate l1=LocalDate.parse(den,fo);
		LocalDate l2=LocalDate.parse(di,fo);
		long chenh= ChronoUnit.DAYS.between(l1, l2);
		if(chenh==0)return 1;
		else return chenh;
	}
	public static void main(String[] args) throws IOException {
		String path="E:\\Code\\Eclip\\eclipse-workspace\\CODETIT\\src\\Execir\\manh.txt";
		Scanner sc=new Scanner(new File(path));
		
		int n=sc.nextInt();
		sc.nextLine();
		
        ArrayList<a1> ds=new ArrayList<a1>();
		while (n-- > 0) {
		   ds.add(new a1(sc.nextLine().trim()));
		}
		
		n=sc.nextInt();
		sc.nextLine();
		ArrayList<a3> ds3=new ArrayList<a3>();
		int dem=0;
		while(n-->0) {
			dem++;
			String ten=sc.nextLine();
			String ma=sc.nextLine();
			String den=sc.nextLine();
			String di=sc.nextLine();
			String maa=ma.substring(2, 3);
			for (a1 a1 : ds) {
				if(a1.getMa().equals(maa)) {
					a3 e=new a3(dem, ten, ma, chenh(den,di), a1.getDongia(), a1.getPhi());
				    ds3.add(e);
				}
			}
			
		}
		
		Collections.sort(ds3);
		for (a3 a3 : ds3) {
				System.out.println(a3);
			}
	}
}
class a1{
	private String ma,loai;
	private double dongia,phi;
	public a1(String e) {
		String[] he=e.split(" ");
		this.ma=he[0];
		this.loai=he[1];
		this.dongia=Double.parseDouble(he[2]);
		this.phi=Double.parseDouble(he[3]);
	}
	public String getMa() {
		return ma;
	}
	public double getDongia() {
		return dongia;
	}

	public double getPhi() {
		return phi;
	}
	@Override
	public String toString() {
		return "a1 [ma=" + ma + ", loai=" + loai + ", dongia=" + dongia + ", phi=" + phi + "]";
	}
	
}
class a3 implements Comparable<a3>{
	private String  ma, ten,maphong;
    private double songay,thanhtien;
	
	public a3(int ma, String ten,String maphong, long sngay,double donggia,double phi) {
		this.ma=String.format("KH%02d", ma);
		this.ten=ten;
		this.maphong=maphong;
		this.songay=sngay;
		
		double p=0.0;
		if(songay<10) p=0.0;
		else if(songay<21) p=0.02;
		else if(songay<31) p=0.04;
		else p=0.06;
		
		double tien=sngay*donggia*(1+phi)*(1-p);
		this.thanhtien=tien;
	}

	@Override
	public String toString() {
	
		return String.format("%s %s %s %.0f %.2f",ma,ten,maphong,songay,thanhtien);
	}

	@Override
	public int compareTo(a3 o) {
		// TODO Auto-generated method stub
		return Double.compare(o.songay, this.songay);
	}
		
}

/*
Bui Thi Trang
45000
23
PGD
*/