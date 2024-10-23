package J05_array_object;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class J05015 {
	public static double gio(String a) {
		String[] g=a.split(":");
		double gio=Double.parseDouble(g[0]);
		double phut=Double.parseDouble(g[1]);
		return (gio*60.0+phut-360.0)/60.0;
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	int n=sc.nextInt();
	sc.nextLine();
	ArrayList<vd> ds=new ArrayList<vd>();
	while(n-->0) {
		String ten=sc.nextLine();
		String tp=sc.nextLine();
		String g=sc.nextLine().trim();
		ds.add(new vd(ten, tp, gio(g)));
	}
	Collections.sort(ds);
	for (vd vd : ds) {
		System.out.println(vd);
	}
}
}
class vd implements Comparable<vd>{
	private String ten,tp,ma;
	private double vt;
	public vd(String ten, String tp, double vt) {
		super();
		this.ten = ten;
		this.tp = tp;
		this.vt = 120.0/vt;
		String tam=tp.toUpperCase()+" "+ten.toUpperCase();
		String[] he=tam.split(" ");
		String t="";
		for (String string : he) {
			t+=string.substring(0, 1);
		}
		this.ma=t;
	}
	@Override
	public String toString() {
		String he=String.format("%s %s %s %.0f Km/h",ma, ten,tp,vt);
		return he;
		//return "vd [ten=" + ten + ", tp=" + tp + ", vt=" + vt + "]";
	}
	@Override
	public int compareTo(vd o) {
		// TODO Auto-generated method stub
		return Double.compare(o.vt, this.vt);
	}
	
}
/*
3
Tran Vu Minh
Ha Noi
8:30
Vu Ngoc Hoang
Hoa Binh
8:20
Pham Dinh Tan
An Giang
8:45
*/