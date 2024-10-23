package J05_array_object;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class J05067 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<dumee> ds = new ArrayList<>();
		int n = sc.nextInt();
	
		while (n-- > 0) {
		sc.nextLine();
			String ten=sc.next();
			double h=sc.nextDouble();
			ds.add(new dumee(ten,h));
			//System.out.println("nhaop thg moi");
		}
		Collections.sort(ds);
		for (dumee dao : ds) {
			System.out.println(dao);
		}
	}}

class dumee implements Comparable<dumee>{

	private String ma, ten;
	private double dongia, thue, thanhtien,persen;


	public dumee(String ma, double dongia) {
		this.ma = ma;
	
		String he=ma.substring(3, 5);
		if(he.equals("BP")) this.ten="British Petro";
		else if(he.equals("ES")) this.ten="Esso";
		else if(he.equals("CA")) this.ten="Castrol";
		else if(he.equals("MO")) this.ten="Mobil";
		else if(he.equals("SH")) this.ten="Shell";
		else if(he.equals("TN")) this.ten="Trong Nuoc";
	    
		if(ma.charAt(0)=='X') {
			this.dongia=128000;
			this.persen=0.03;
		}else if(ma.charAt(0)=='D') {
			this.dongia=11200;
			this.persen=0.035;
		}else {
			this.dongia=9700;
			this.persen=0.02;
		}
		
		if(ma.substring(3, 5).equals("TN")) this.persen=0;
		
		this.thue=dongia*this.dongia*this.persen;
		this.thanhtien=dongia*this.dongia+this.thue;
		
	}
	


	@Override
	public String toString() {
		String he=String.format(" %.0f %.0f %.0f", dongia,thue,thanhtien);
		return "" + ma + " " + ten+he ;
	}



	@Override
	public int compareTo(dumee o) {
		// TODO Auto-generated method stub
		return Double.compare(o.thanhtien, this.thanhtien);
	}
}
/*
6
X03ES 8588
D00CA 5600
N00MO 2600
D00TN 3500
N89BP 450
X92SH 2600

3
N89BP 4500
D00BP 3500
X92SH 2600
/**/