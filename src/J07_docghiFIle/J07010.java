package J07_docghiFIle;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class J07010 {
	public static void main(String[] args) throws IOException {

		ds_SV danhSachSinhVien = new ds_SV();
        String filePath="\"C:\\Users\\ADMIN\\eclipse-workspace\\CODETIT\\src\\GhiDocFIle\\SV.in.txt\"";
		try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
			br.readLine();
			int dem = 0;
			String line;
			while ((line = br.readLine()) != null) {
				dem++;
				String ten = line;
				String ml = br.readLine();
				String ns = br.readLine();
				double diem = Double.parseDouble(br.readLine());
				sinhvien e = new sinhvien(dem, ten, ml, ns, diem);
				danhSachSinhVien.themsv(e);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		danhSachSinhVien.indanhsach();
	}
	/*
	 * ds_SV ds=new ds_SV(); for(int i=1;i<88;i++) { sinhvien e=new sinhvien(i,
	 * "Tran Trong Manh", "B21DCAT00"+Integer.toString(i), "19/1/2003", 3.5);
	 * ds.themsv(e); } ds.indanhsach(); }
	 */
}

class sinhvien {
	private String msv;
	private String ten, ml, ns;
	private double diem;

	public sinhvien(int msv, String ten, String ml, String ns, double diem) {
		super();
		if (msv < 10)
			this.msv = "B20DCCN00" + Integer.toString(msv);
		else {
			this.msv = "B20DCCN0" + Integer.toString(msv);
		}
		this.ten = ten;
		this.ml = ml;
		int n = ns.length();
		if (n == 8) {
			this.ns = "0" + ns.substring(0, 2) + "0" + ns.substring(2, n);
		} else if (n == 9) {
			if (ns.charAt(1) != '/') {
				this.ns = ns.substring(0, 3) + "0" + ns.substring(3, n);
			} else {
				this.ns = "0" + ns;
			}
		} else {
			this.ns = ns;
		}

		this.diem = diem;
	}

	@Override
	public String toString() {
		String stringdiem = String.format("%.2f", diem);
		return msv + " " + ten + " " + ml + " " + ns + " " + stringdiem;
	}

}

class ds_SV {
	private ArrayList<sinhvien> ds;

	public ArrayList<sinhvien> getDs() {
		return ds;
	}

	public void setDs(ArrayList<sinhvien> ds) {
		this.ds = ds;
	}

	public ds_SV(ArrayList<sinhvien> ds) {
		super();
		this.ds = ds;
	}

	public ds_SV() {
		super();
		this.ds = new ArrayList<>();
	}

	public void themsv(sinhvien e) {
		ds.add(e);
	}

	public void indanhsach() {
		for (sinhvien sinhvien : ds) {
			System.out.println(sinhvien);
		}
	}

}
