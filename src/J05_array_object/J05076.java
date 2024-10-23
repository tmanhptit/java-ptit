package J05_array_object;

import java.util.ArrayList;
import java.util.Scanner;

public class J05076 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<don> dsdon=new ArrayList<>();
		ArrayList<hang> dshang=new ArrayList<>();
		int n=sc.nextInt();
		
		sc.nextLine();
		while(n-->0) {
			String ma=sc.nextLine();
			String ten=sc.nextLine();
			String lop=sc.nextLine();
			dshang.add(new hang(ma, ten, lop));
		}
		int m=sc.nextInt();
		while(m-->0) {
			sc.nextLine();
			String ma=sc.next();
            double slnha=sc.nextDouble();
			double donnhap=sc.nextDouble();
			double slxuat=sc.nextDouble();
		
			for (hang hang : dshang) {
				if(ma.equals(hang.getMa())) { 
					String ten=hang.getTen();
					double xuat=slxuat*donnhap*(1+hang.getXl());
					don e=new don(ma, ten, slnha*donnhap, xuat);
					dsdon.add(e);
				}
			}
			
		}
		
		for (don hang : dsdon) {
			System.out.println(hang);
		}
		
	}
}
class hang{
	private String ma,ten;
	private double  xl;
	public hang(String ma, String ten,String e) {

		this.ma = ma;
		this.ten = ten;
		
		if(e.charAt(0)=='A') this.xl=0.08;
		else if(e.charAt(0)=='B') this.xl=0.05;
		else this.xl=0.02;
	}
	
	public String getMa() {
		return ma;
	}

	public void setMa(String ma) {
		this.ma = ma;
	}

	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public double getXl() {
		return xl;
	}
	public void setXl(double xl) {
		this.xl = xl;
	}
	
}
class don{
	private String ma,ten;
	private double nhap,xuat;
	
	public don(String ma, String ten , double tongnhap, double tongxuat) {
		super();
		this.ma = ma;
		this.ten=ten;
		this.nhap=tongnhap;
		this.xuat=tongxuat;
		
	}
	
	@Override
	public String toString() {
		String he=String.format(" %.0f %.0f", nhap,xuat);
		return ma + " " + ten + he;
	}
	
}
/*
2
A001
Tu lanh
A
P002
May giat
B
3
A001 500 100 300
P002 1000 1000 500
A001 333 332 222
*/