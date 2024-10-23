package J05_array_object;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class J05055 {
	public static String doi(long a) {
		long gio=a/3600;
		a%=3600;
		long phut=a/60;
		long giay=a%60;
		return String.format("%02d:%02d:%02d", gio,phut,giay);
	}
	public static int ll(String HH) {
		String[] ee=HH.split(":");
		return Integer.parseInt(ee[0])*3600+Integer.parseInt(ee[1])*60+Integer.parseInt(ee[2]);
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<md> ds=new ArrayList<>();
		int n=sc.nextInt();
		sc.nextLine();
		int dem=0;
		while(n-->0) {
			dem++;
			String ten=sc.nextLine();
			String nam=sc.nextLine().trim();
			String vao=sc.nextLine().trim();
			String ra=sc.nextLine().trim();
			int tuoi=2021-Integer.parseInt(nam.substring(6,10));
			String thanhtich=doi(ll(ra)-ll(vao));
			int uu=0;
			if(tuoi<18) {
				uu=0;
			}else if(tuoi<25) {
				uu=1;
			}else if(tuoi<33) {
				uu=2;
			}else {
				uu=3;
			}
			
			md e=new md(dem, ten, thanhtich, doi(uu), doi(ll(thanhtich)-uu),ll(doi(ll(thanhtich)-uu)));
			ds.add(e);
		}
		Collections.sort(ds, new Comparator<md>() {

			@Override
			public int compare(md o1, md o2) {
				// TODO Auto-generated method stub
				return Integer.compare(o1.getXephang(), o2.getXephang());
			}
		});
		ds.get(0).setDitcu(1);
		for(int i=1;i<ds.size();i++) {
			if(ds.get(i).getXephang()==ds.get(i-1).getXephang()) {
				ds.get(i).setDitcu(ds.get(i-1).getDitcu());
			}else ds.get(i).setDitcu(i+1);
		}
		//Collections.sort(ds);
		for (md md : ds) {
			System.out.println(md);
		}
		
		
	}
}
class md implements Comparable<md>{
	private String ma,ten,ttthucte,uu,thanhtich;
	private int xephang,ditcu;
	public md(int ma, String ten, String ttthucte, String uu, String thanhtich,int tong) {
		super();
		this.ma = String.format("VDV%02d",ma);
		this.ten = ten;
		this.ttthucte = ttthucte;
		this.uu = uu;
		this.thanhtich = thanhtich;
		this.xephang = (int)tong;
	}
	
	public int getXephang() {
		return xephang;
	}

	public int getDitcu() {
		return ditcu;
	}

	public void setDitcu(int ditcu) {
		this.ditcu = ditcu;
	}

	public void setXephang(int xephang) {
		this.xephang = xephang;
	}

	@Override
	public String toString() {
		return "" + ma + " " + ten + " " + ttthucte + " " + uu + " " + thanhtich
				+ " " + ditcu + "";
	}

	@Override
	public int compareTo(md o) {
		// TODO Auto-generated method stub
		return this.ma.compareTo(o.ma);
	}
	
}
/*
3
Nguyen Van Thanh
20/03/1990
07:00:00
07:10:01
Nguyen Hoa Binh
01/10/1993
07:02:00
07:11:20
Le Thanh Van
15/03/1998
07:05:00
07:15:30
*/