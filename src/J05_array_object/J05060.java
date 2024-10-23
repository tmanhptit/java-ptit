package J05_array_object;


import java.util.ArrayList;

import java.util.Collections;
import java.util.Scanner;

public class J05060 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int dem=0;
		
		ArrayList<ditcumaynhe> sd=new ArrayList<ditcumaynhe>();
		while(n-->0) {
			dem++;
			sc.nextLine();
			String ten=sc.nextLine();
			String ns=sc.nextLine();
			double a=sc.nextDouble();
			double b=sc.nextDouble();
			long d=Math.round(ch(a,b));
			if(d>10) d=10;
			//System.out.printf("%s\n%s\n%d\n",ten,ns,d)
			ditcumaynhe e=new ditcumaynhe(dem, ten, ns, d);
			sd.add(e);
		}
		Collections.sort(sd);
		for (ditcumaynhe ditcumaynhe : sd) {
			System.out.println(ditcumaynhe);
		}
	}
	public static double ch(double a, double b) {
		if (a >= 8 && b >= 8)
			return (a + b) / 2 + 1;
		else if (a >= 7.5 && b >= 7.5)
			return (a + b) / 2 + 0.5;
		else
			return (a + b) / 2;
	}
}

class ditcumaynhe implements Comparable<ditcumaynhe>{
	private String ma, ten, hocluc;
	private int tuoi;
	private long diem;

	public ditcumaynhe(int ma, String ten, String ns, long diem) {
		super();
		if (ma < 10)
			this.ma = "PH0" + ma;
		else
			this.ma = "PH" + ma;

		this.ten = ten;
		this.tuoi = 2021 - Integer.parseInt(ns.substring(6, 10));
		this.diem = diem;
        //this.tuoi=20;
		if (diem < 5)
			this.hocluc = "Truot";
		else if (diem < 7)
			this.hocluc = "Trung binh";
		else if (diem < 8)
			this.hocluc = "Kha";
		else if (diem < 9)
			this.hocluc = "Gioi";
		else
			this.hocluc = "Xuat sac";

	}

	@Override
	public String toString() {
		return "" + ma + " " + ten + " " + tuoi + " " + diem + " " + hocluc;
	}

	@Override
	public int compareTo(ditcumaynhe o) {
		// TODO Auto-generated method stub
		return Integer.compare((int)o.diem, (int)this.diem);
	}
	
}
/*
3
Doan Thi Kim
13/03/1982
8
9,5
Dinh Thi Ngoc Ha
03/09/1996
6,5
8
Tran Thanh Mai
12/09/2004
8
9
*/
