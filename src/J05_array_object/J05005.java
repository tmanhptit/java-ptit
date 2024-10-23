package J05_array_object;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class J05005 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<hihi> ds=new ArrayList<>();
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
			hihi e = new hihi(dem, ten, ml, ns, diem);
			ds.add(e);
			//System.out.println(e.toString());
		}
		Collections.sort(ds);
		for (hihi hihi : ds) {
			System.out.println(hihi);
		}
	}
}
class hihi implements Comparable<hihi>{
	private String msv;
	private String ten, ml, ns;
	private double diem;

	public double getDiem() {
		return diem;
	}

	public void setDiem(double diem) {
		this.diem = diem;
	}

	public hihi(int msv, String ten, String ml, String ns, double diem) {
		super();
		if (msv < 10)
			this.msv = "B20DCCN00" + Integer.toString(msv);
		else {
			this.msv = "B20DCCN0" + Integer.toString(msv);
		}
		
		Scanner ss=new Scanner(ten);
		Vector<String> v=new Vector<>();
		while(ss.hasNext()) {
			v.add(ss.next().toLowerCase());
		}
		String kq="";
		for(int i=0;i<v.size();i++) {
			kq+=v.get(i).substring(0,1).toUpperCase()+v.get(i).substring(1,v.get(i).length())+" ";
		}
		
		
		this.ten = kq;
		
		
		
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

	@Override
	public int compareTo(hihi o) {
		//return Integer.compare(o.tinchi, this.tinchi);
		return Double.compare(o.diem, this.diem);
}

}


