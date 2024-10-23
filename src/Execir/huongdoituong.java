package Execir;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class huongdoituong {
	public static int phut(String den,String di) {
		int gioden=Integer.parseInt(den.substring(0, 2));
		int phut=Integer.parseInt(den.substring(3,5));
		int giodi=Integer.parseInt(di.substring(0, 2));
		int phutdi=Integer.parseInt(di.substring(3,5));
		return (giodi-gioden)*60+phutdi-phut;
	}
	public static int chuan(double b) {
		double a=b/(double)3;
		if(a*10%10>0) {
			return (int)a*10/10+1;
		}else return (int)a;
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	ArrayList<tinh> dstinh=new ArrayList<tinh>();
	ArrayList<cuocgoi>dsc =new ArrayList<cuocgoi>();
	sc.nextLine();
	
	while(n-->0) {
		dstinh.add(new tinh(  Integer.parseInt(sc.nextLine()) ,sc.nextLine(), Integer.parseInt(sc.nextLine())   )    );
	}
	
	n=sc.nextInt();
	sc.nextLine();
	while(n-->0) {
		String he=sc.nextLine();
		String[] y=he.split(" ");
		int p=phut(y[1],y[2]);
		if(y[0].charAt(0)=='0') {
			int ma=Integer.parseInt(y[0].substring(1,3));
			for (tinh s : dstinh) {
				if(s.getMa()==ma) {
					int cuoc=s.getCuoc();
					String ten=s.getTen();
					double tien=(double) cuoc*p;
					dsc.add(new cuocgoi(y[0], ten, p, tien));
				}
			}
		}else {
		    int h=chuan(p);
			dsc.add(new cuocgoi(y[0], "Noi mang", h, h*800));
		}
		        
	}
	Collections.sort(dsc);
	for (cuocgoi cuocgoi : dsc) {
		System.out.println(cuocgoi);
	}
}
}
class tinh{
	private int ma,cuoc;
	private String ten;
	public tinh(int ma, String ten, int cuoc) {
		this.ma = ma;
		this.cuoc = cuoc;
		this.ten = ten;
	}
	@Override
	public String toString() {
		return "tinh [ma=" + ma + ", cuoc=" + cuoc + ", ten=" + ten + "]";
	}
	public int getMa() {
		return ma;
	}
	public void setMa(int ma) {
		this.ma = ma;
	}
	public int getCuoc() {
		return cuoc;
	}
	public void setCuoc(int cuoc) {
		this.cuoc = cuoc;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	
	
}

class cuocgoi implements Comparable<cuocgoi>{
	private String sdt,ten;
	private int phut;
	private double tien;
	public cuocgoi(String sdt,String ten, int phut, double tien) {
		super();
		this.ten=ten;
		this.sdt = sdt;
		this.phut = phut;
		this.tien=tien;
	}
	@Override
	public String toString() {
		return String.format("%s %s %d %.0f", sdt,ten,phut,tien);

	}
	@Override
	public int compareTo(cuocgoi o) {
		// TODO Auto-generated method stub
		return Double.compare(o.tien, this.tien);
	}
	
}
/*
2
53
Da Nang
3000
64
Vung Tau
1000
3
064-824531 11:20 11:22
8293567 09:07 09:15
053-823532 12:00 12:05
*/