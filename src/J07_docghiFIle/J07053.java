package J07_docghiFIle;

import java.util.Date;
import java.io.IOException;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

import java.util.Collections;
import java.util.Scanner;
import java.io.File;

public class J07053 {
	public static void main(String[] args) throws IOException {

		String path = "E:\\Code\\Eclip\\eclipse-workspace\\CODETIT\\src\\J07_docghiFIle\\SV.in.txt";
		Scanner sc = new Scanner(new File(path));
		int n = Integer.parseInt(sc.nextLine());
		ArrayList<khhh> ds = new ArrayList<khhh>();
		int dem = 0;
		while (n-- > 0) {
			dem++;
			//sc.nextLine();
			String ten = sc.nextLine();
			String nam=sc.nextLine();
		double d1=Double.parseDouble(sc.nextLine());
		double d2=Double.parseDouble(sc.nextLine());
			//System.out.println(ten+" "+nam+ " "+d2+d1);
			ds.add(new khhh(dem, ten, nam, heeh(d2,d1)));
		}
		//Collections.sort(ds);
		for (khhh khhh : ds) {
			System.out.println(khhh);
		}
	}
    public static int heeh(double a,double b) {
    	if(a>=8 &&b>=8) {
    		return (int)Math.round((a+b)/2+1.0);
    	}
    	if(a>=7.5 &&b>=7.5) {
    		return (int)Math.round((a+b)/2+0.5);
    	}else return (int)Math.round((a+b)/2);
    }
}

class khhh implements Comparable<khhh> {
	private String ma, ten,xephang;
	private int diem;
	private int tuoi;
   
	
	public khhh(int ma, String ten, String tuoi, int diem) {
	
		
		if (ma < 10)
			this.ma = "PH0" + ma;
		else
			this.ma = "PH" + ma;

		Scanner doc = new Scanner(ten);
		String rong = "";
		while (doc.hasNext()) {
			String tu = doc.next().toLowerCase();
			rong += tu.substring(0, 1).toUpperCase() + tu.substring(1, tu.length()) + " ";
		}
		this.ten = rong.substring(0, rong.length()-1);
        if(tuoi.length()==10)	this.tuoi=2021-Integer.parseInt(tuoi.substring(6, 10));
        else if(tuoi.length()==9) this.tuoi=2021-Integer.parseInt(tuoi.substring(5, 9));
        else this.tuoi=2021-Integer.parseInt(tuoi.substring(4, 8));
        this.diem=diem;
		if(diem<5) this.xephang="Truot";
		else if(diem<7) this.xephang="Trung binh";
		else if(diem<8) this.xephang="Kha";
		else if(diem<9) this.xephang="Gioi";
		else  this.xephang="Xuat sac";
		
	}

	@Override
	public String toString() {
		if(this.diem>10) this.diem=10;
		return "" + ma + " " + ten + " " + tuoi + " " + this.diem + " " + xephang + "";
	}

	@Override
	public int compareTo(khhh o) {
		// TODO Auto-generated method stub
		return Double.compare(o.diem, this.diem);
	}

}
