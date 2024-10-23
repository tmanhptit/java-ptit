package J05_array_object;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J07038 {
	public static String doi(String a) {
		Scanner doc = new Scanner(a);
		String ten = "";
		while (doc.hasNext()) {
			String tam = doc.next().toLowerCase();
			ten += tam.substring(0, 1).toUpperCase() + tam.substring(1, tam.length()) + " ";
		}
		return ten.substring(0, ten.length() - 1);
	}

	public static void main(String[] args) throws FileNotFoundException {
		String psv = "E:\\Code\\Eclip\\eclipse-workspace\\CODETIT\\src\\J05_array_object\\SINHVIEN.in.txt";
		String pdn = "E:\\Code\\Eclip\\eclipse-workspace\\CODETIT\\src\\J05_array_object\\SDN.txt";
		String ptt = "E:\\Code\\Eclip\\eclipse-workspace\\CODETIT\\src\\J05_array_object\\STHUCTAP.in.txt";
		Scanner sv = new Scanner(new File(psv));
		Scanner dnn = new Scanner(new File(pdn));
		Scanner doctt = new Scanner(new File(ptt));
		ArrayList<svi> ds = new ArrayList<svi>();
		ArrayList<dn> dsdn = new ArrayList<>();
		int n = Integer.parseInt(sv.nextLine());
		while (n-- > 0) {
			ds.add(new svi(sv.nextLine(), doi(sv.nextLine()), sv.nextLine(), sv.nextLine()));
		}
		Collections.sort(ds);
        for (svi dn : ds) {
			System.out.println(dn);
		}
		n = Integer.parseInt(dnn.nextLine());
		while (n-- > 0) {
			dsdn.add(new dn(dnn.nextLine(), dnn.nextLine(), Integer.parseInt(dnn.nextLine())));
		}

		n = Integer.parseInt(doctt.nextLine());
		while (n-- > 0) {
			String ma = doctt.next();
			String ttt = doctt.next();
			//System.out.printf("ditcu may ->>> %s %s\n",ma,ttt);
			hee: for (svi svi : ds) {
				if (svi.getMa().equals(ma)) {
					System.out.printf("ditcu may ->>> %s %s\n",ma,ttt);
					svi.setTt(ttt);
					// System.out.println(ma);
					break hee;
				}
			}
		}
		for (svi dn : ds) {
			System.out.println(dn);
		}
		doctt.nextLine();
		n = Integer.parseInt(doctt.nextLine());

		while (n-- > 0) {
			String ma = doctt.nextLine();
			int dem =0;
			hhe: for (dn dn : dsdn) {
				if (dn.getMa().equals(ma)) {
					dem = dn.getSl();
					System.out.printf("DANH SACH THUC TAP TAI %s:\n", dn.getTen());
					break hhe;
				}
			}
			
			for (svi svi : ds) {
				if (svi.getTt().equals(ma)) {
					if (dem-- > 0) {
						System.out.println(svi);
					}
				}
			}
		}
	}
}

class svi implements Comparable<svi> {
	private String ma, ten, lop, email, tt;

	public svi(String ma, String ten, String lop, String email) {
		super();
		this.ma = ma;
		this.ten = ten;
		this.lop = lop;
		this.email = email;
	}

	public String getTt() {
		return tt;
	}

	public void setTt(String tt) {
		this.tt = tt;
	}

	public String getMa() {
		return ma;
	}

	public void setMa(String ma) {
		this.ma = ma;
	}

	@Override
	public String toString() {
		return "" + ma + " " + ten + " " + lop+" "+tt ;
	}

	@Override
	public int compareTo(svi o) {
		// TODO Auto-generated method stub
		return this.ma.compareTo(o.ma);
	}

}

class dn {
	private String ma, ten;
	private int sl;

	public dn(String ma, String ten, int sl) {
		super();
		this.ma = ma;
		this.ten = ten;
		this.sl = sl;
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

	public int getSl() {
		return sl;
	}

	public void setSl(int sl) {
		this.sl = sl;
	}

}