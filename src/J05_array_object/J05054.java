package J05_array_object;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class J05054 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int tam=n;
		ArrayList<ditcu> ds = new ArrayList<>();
        int dem=0;
        
		while (n-- > 0) {
			dem++;
			sc.nextLine();
			String ten = sc.nextLine();
			double b = sc.nextDouble();
			ds.add(new ditcu(dem,ten, b));
		}
		Collections.sort(ds, new Comparator<ditcu>() {

			@Override
			public int compare(ditcu o1, ditcu o2) {
				// TODO Auto-generated method stub
				return Double.compare(o2.getD(), o1.getD());
			}
		});
		
		ds.get(0).setThuhang(1);
		for(int i=1;i<tam;i++) {
			//System.out.printf("%.1f %.1f %.1f\n",ds.get(i-1).getD(),ds.get(i).getD(),ds.get(i).getD()-ds.get(i-1).getD());
			if(Math.abs(ds.get(i).getD()-ds.get(i-1).getD())<0.01) {
				//System.out.println("dutcu n bang nhau");
				ds.get(i).setThuhang(ds.get(i-1).getThuhang());
			}
			else {
				ds.get(i).setThuhang(i+1);
			}
		}
		
	
		Collections.sort(ds);
		for (ditcu ditcu : ds) {
			System.out.println(ditcu);
		}
		
	}
}
class ditcu implements Comparable<ditcu>{
	private String ma,ten,hocluc;
	private double d;
	private int thuhang;
	public ditcu(int ma, String ten, double d) {
		if(ma<10) this.ma="HS0"+ma;
		else this.ma = "HS"+ma;
		
		this.ten = ten;
		this.d = d;
		if(d<5) this.hocluc="Yeu";
		else if(d<7) this.hocluc="Trung Binh";
		else if(d<9) this.hocluc="Kha";
		else this.hocluc="Gioi";
		this.thuhang=0;
		
	}
	public Double getD() {
		return this.d;
	}
	public void setThuhang(int thuhang) {
		this.thuhang = thuhang;
	}
	public int getThuhang() {
		return this.thuhang;
	}

	@Override
	public String toString() {
		String dd=String.format("%.1f", d);
		return "" + ma + " " + ten +" "+dd+ " " + hocluc +" "+thuhang;
	}

	@Override
	public int compareTo(ditcu o) {
		// TODO Auto-generated method stub
		return this.ma.compareTo(o.ma);
		}
/*
5
Tran Minh Hieu
5,9
Nguyen Bao Trung
8,6
NGuyen Thao
8,6
Hao GNuyen
5,9
Le Hong Ha
9,2	
 */
	
}