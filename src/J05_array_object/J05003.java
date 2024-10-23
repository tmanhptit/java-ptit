package J05_array_object;

import java.util.ArrayList;
import java.util.Scanner;

public class J05003 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ds_SV ds=new ds_SV();
		int dem = 0;
		while (n--> 0) {
			sc.nextLine();
			dem++;
		//	System.out.println("nhap ten");
			String ten = sc.nextLine();
		//	System.out.println("nhap ml");
			String ml = sc.nextLine();
		//	System.out.println("nhap ngay sinh");
			String ns = sc.nextLine();
		//	System.out.println("nhapd diem");
			double diem = sc.nextDouble();
			sinhvien e = new sinhvien(dem, ten, ml, ns, diem);
			ds.themsv(e);
			//System.out.println(e.toString());
		}
		ds.indanhsach();
	}
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
