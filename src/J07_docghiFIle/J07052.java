package J07_docghiFIle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class J07052 {

	public static void main(String[] args) throws IOException {

		String path = "E:\\Code\\Eclip\\eclipse-workspace\\CODETIT\\src\\J07_docghiFIle\\SV.in.txt";
		Scanner sc = new Scanner(new File(path));
		int n = Integer.parseInt(sc.nextLine());
		ArrayList<khh> ds = new ArrayList<khh>();
		int dem = 0;
		while (n-- > 0) {
			dem++;
			String ma = sc.nextLine();
			String ten = sc.nextLine();
			double d1 = Double.parseDouble(sc.nextLine());
			double d2 = Double.parseDouble(sc.nextLine());
			double d3 = Double.parseDouble(sc.nextLine());

			ds.add(new khh(dem, ma, ten, d1 + d1 + d2 + d3));

		}
		Collections.sort(ds);
		int sl = sc.nextInt();
		for (int i = 0; i < ds.size(); i++) {
			if (i < sl) {
				ds.get(i).setTrangthai("TRUNG TUYEN");
			} else {
				if (ds.get(sl - 1).getDiem() == ds.get(i).getDiem()) {
					ds.get(i).setTrangthai("TRUNG TUYEN");
				} else {
					ds.get(i).setTrangthai("TRUOT");
				}
			}
		}
		double hh=ds.get(sl-1).getDiem();
		String heh=String.format("%.1f", hh);
		System.out.println(heh);
		for (khh khh : ds) {
			System.out.println(khh);
		}
	}
}

class khh implements Comparable<khh> {
	private String ma, ten, trangthai;
	private int stt;
	private double uutien;
	private double diem;

	public khh(int dem, String ma, String ten, double d) {
		this.ma = ma;
		this.stt = dem;
		Scanner doc = new Scanner(ten);
		String rong = "";
		while (doc.hasNext()) {
			String tu = doc.next().toLowerCase();
			rong += tu.substring(0, 1).toUpperCase() + tu.substring(1, tu.length()) + " ";
		}
		this.ten = rong.substring(0, rong.length() - 1);
		if (ma.charAt(2) == '1')
			this.uutien = 0.5;
		else if (ma.charAt(2) == '2')
			this.uutien = 1;
		else
			this.uutien = 2.5;

		this.diem = this.uutien + d;

	}

	public String getTrangthai() {
		return trangthai;
	}

	public void setTrangthai(String trangthai) {
		this.trangthai = trangthai;
	}

	public double getDiem() {
		return diem;
	}

	public void setDiem(double diem) {
		this.diem = diem;
	}

	@Override
	public String toString() {
		return "" + ma + " " + ten + " " + du(uutien) + " " + du(diem) + " " + trangthai;
	}

	public int compareTo(khh o) {
		// TODO Auto-generated method stub
		if(o.diem!=this.diem) return Double.compare(o.diem, this.diem);
		else {
			return this.ma.compareTo(o.ma);
		}
	}

	public static String du(double e) {
		if (e * 10 % 10 > 0) {
			return String.format("%.1f", e);
		} else
			return "" + Math.round(e);
	}
}
