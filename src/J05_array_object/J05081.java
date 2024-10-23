package J05_array_object;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class J05081 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        
        danhsach_mathang hsmh=new danhsach_mathang();
        for(int i=1;i<=t;i++) {
        	sc.nextLine();
        	//System.out.println("vui long nhap tiep");
        	String ten=sc.nextLine();
        	String loai=sc.nextLine();
        	//System.out.println("nhap giamua gia ban");
        	int giammua=sc.nextInt();
        	int giaban=sc.nextInt();
        	mat_hang a1=new mat_hang(i, ten, loai, giammua, giaban);
        	hsmh.them_hang(a1);
        }
        hsmh.sapxep();
        hsmh.in();
	}
}

class mat_hang {
	private String ten, donvi;
	private int giamua, giaban, loinhuan, ma;

	public mat_hang(int ma, String ten, String donvi, int giamua, int giaban) {
		super();
		this.ma = ma;
		this.ten = ten;
		this.donvi = donvi;
		this.giamua = giamua;
		this.giaban = giaban;
		this.loinhuan = giaban - giamua;
	}

	@Override
	public String toString() {

		String maa = "";
		if (ma < 10) {
			maa = "MH00" + ma;
		} else {
			maa = "MH0" + ma;
		}
		return maa + " " + ten + " " + donvi + " " + giamua + " " + giaban + " " + loinhuan;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public String getDonvi() {
		return donvi;
	}

	public void setDonvi(String donvi) {
		this.donvi = donvi;
	}

	public int getGiamua() {
		return giamua;
	}

	public void setGiamua(int giamua) {
		this.giamua = giamua;
	}

	public int getGiaban() {
		return giaban;
	}

	public void setGiaban(int giaban) {
		this.giaban = giaban;
	}

	public int getLoinhuan() {
		return loinhuan;
	}

	public void setLoinhuan(int loinhuan) {
		this.loinhuan = loinhuan;
	}

	public int getMa() {
		return ma;
	}

	public void setMa(int ma) {
		this.ma = ma;
	}

}

class danhsach_mathang {
	private ArrayList<mat_hang> dsmh;

	public ArrayList<mat_hang> getDsmh() {
		return dsmh;
	}

	public void setDsmh(ArrayList<mat_hang> dsmh) {
		this.dsmh = dsmh;
	}

	public danhsach_mathang(ArrayList<mat_hang> dsmh) {
		super();
		this.dsmh = dsmh;
	}

	public danhsach_mathang() {
		super();
		this.dsmh = new ArrayList<mat_hang>();
	}

	public void them_hang(mat_hang e) {
		dsmh.add(e);
	}

	public void in() {
		for (mat_hang mat_hang : dsmh) {
			System.out.println(mat_hang);
		}
	}

	public void sapxep() {
		Collections.sort(this.dsmh, new Comparator<mat_hang>() {

			@Override
			public int compare(mat_hang o1, mat_hang o2) {
				if (o1.getLoinhuan() > o2.getLoinhuan())
					return -1;
				else if (o1.getLoinhuan() < o2.getLoinhuan())
					return 1;
				else
					return 0;
			}
		});
	}

}
