package J05_array_object;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class J05018 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<hoccsinh> ds = new ArrayList<>();
		int dem = 0;
		while (n-- > 0) {
			sc.nextLine();
			dem++;
			String ten = sc.nextLine();
			double tong = 0;
			for (int i = 0; i < 10; i++) {
				if(i<2) {
				double x = sc.nextDouble();
				tong+=x*2;
				}else {
					double x=sc.nextDouble();
					tong+=x;
				}
			}
			tong/=12;
			
            
	        // Làm tròn số thập phân về một số cụ thể của chữ số sau dấu phẩy
	        double roundedNumber = Math.round(tong * 10.0) / 10.0;
			//System.out.println(tong+" "+roundedNumber);
            hoccsinh e=new hoccsinh(dem, ten, roundedNumber);
            ds.add(e);
		}
		Collections.sort(ds, new Comparator<hoccsinh>() {

			@Override
			public int compare(hoccsinh o1, hoccsinh o2) {
				if(o1.getDiemtrungbinh()<o2.getDiemtrungbinh()) return 1;
				else if(o1.getDiemtrungbinh()>o2.getDiemtrungbinh()) return -1;
				else {
					return o1.getMasinhvien().compareTo(o2.getMasinhvien());
				}
			}
		});
		
		for (hoccsinh hs : ds) {
			System.out.printf(hs+" %.1f "+hs.getXeploai(),hs.getDiemtrungbinh());
			System.out.println();
		}
		
	}
	
}

class hoccsinh implements Comparable<hoccsinh> {
	private String masinhvien, tensinhvien;
	private double diemtrungbinh;
	private String xeploai;

	public hoccsinh(int dem, String tensinhvien, double diem) {
		super();
		this.tensinhvien = tensinhvien;
		if (dem < 10) {
			this.masinhvien = "HS0" + dem;
		} else {
			this.masinhvien = "HS" + dem;
		}
		this.diemtrungbinh = diem;
		if (diemtrungbinh < 5)
			this.xeploai = "YEU";
		else if (diemtrungbinh < 7)
			this.xeploai = "TB";
		else if (diemtrungbinh < 8)
			this.xeploai = "KHA";
		else if (diemtrungbinh < 9)
			this.xeploai = "GIOI";
		else
			this.xeploai = "XUAT SAC";
	}
    
	public String getMasinhvien() {
		return masinhvien;
	}

	public void setMasinhvien(String masinhvien) {
		this.masinhvien = masinhvien;
	}

	public String getTensinhvien() {
		return tensinhvien;
	}

	public void setTensinhvien(String tensinhvien) {
		this.tensinhvien = tensinhvien;
	}

	public double getDiemtrungbinh() {
		return diemtrungbinh;
	}

	public void setDiemtrungbinh(double diemtrungbinh) {
		this.diemtrungbinh = diemtrungbinh;
	}

	public String getXeploai() {
		return xeploai;
	}

	public void setXeploai(String xeploai) {
		this.xeploai = xeploai;
	}

	@Override
	public String toString() {
		String diem=String.format("%.1f", diemtrungbinh);
		return masinhvien + " " + tensinhvien ;
	}

	@Override
	public int compareTo(hoccsinh o) {
		// TODO Auto-generated method stub
		return Double.compare(o.diemtrungbinh, this.diemtrungbinh);
	}

}
