package J05_array_object;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class J05006 {
	//public static void main(String[] args)throws IOException{
		public static void main(String[] args){
		
		int dem=0;
		ArrayList<nhanvien> ds=new ArrayList<>();
		/*
		String path="C:\\Users\\ADMIN\\eclipse-workspace\\CODETIT\\src\\\\J07_docghiFIle\\SV.in.txt";
        Scanner in = new Scanner(new File(path));
        int n = Integer.parseInt(in.nextLine());
        while(n-->0){
            dem++;
        	String ten = in.nextLine();
			String xec = in.nextLine();
			String ns = in.nextLine();
			String diachi = in.nextLine();
			String mst = in.nextLine();
			String ngay = in.nextLine();
			nhanvien ngu = new nhanvien(dem,ten, xec, ns, diachi, mst, ngay);
            ds.add(ngu);
           
        }
        */
	    Scanner in=new Scanner(System.in);
	    int n=in.nextInt(); 
	    in.nextLine();
        while(n-->0){
            dem++;
           
            System.out.println("ten");
        	String ten = in.nextLine();
        	 System.out.println("gioi tinh");
			String xec = in.nextLine(); 
			System.out.println("ns");
			String ns = in.nextLine(); 
			System.out.println("diachi");
			String diachi = in.nextLine(); 
			System.out.println("mst");
			String mst = in.nextLine(); 
			System.out.println("ngay");
			String ngay = in.nextLine();
			
			nhanvien ngu = new nhanvien(dem,ten, xec, ns, diachi, mst, ngay);
            ds.add(ngu);
           
        }

		for (nhanvien nhanvien : ds) {
			System.out.println(nhanvien);
		}
		
		

	}
}

class nhanvien {
	private String ma,hoten, sex, ns, address, maSothue, dateHopdong;

	public nhanvien(int dem,String hoten, String sex, String ns, String address, String maSothue, String dateHopdong) {
		super();
		if(dem<10) {
			this.ma="0000"+dem;
		}else {
			this.ma="000"+dem;
		}
		this.hoten = hoten;
		this.sex = sex;
		int n = ns.length();
		if (n == 8) {
			this.ns = "0" + ns.substring(0, 2) + "0" + ns.substring(2, 8);
		} else if (n == 9) {
			if (ns.charAt(1) == '/')
				this.ns = "0" + ns.substring(0, 2) + ns.substring(2, 9);
			else
				this.ns = ns.substring(0, 3) + "0" + ns.substring(3, 9);
		} else {
			this.ns = ns;
		}
		this.address = address;
		this.maSothue = maSothue;

		n = dateHopdong.length();
		if (n == 8) {
			this.dateHopdong = "0" + dateHopdong.substring(0, 2) + "0" + dateHopdong.substring(2, 8);
		} else if (n == 9) {
			if (dateHopdong.charAt(1) == '/')
				this.dateHopdong = "0" + dateHopdong.substring(0, 2) + dateHopdong.substring(2, 9);
			else
				this.dateHopdong = dateHopdong.substring(0, 3) + "0" + dateHopdong.substring(3, 9);
		} else {
			this.dateHopdong = dateHopdong;
		}
	}

	public String getHoten() {
		return hoten;
	}

	public void setHoten(String hoten) {
		this.hoten = hoten;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getNs() {
		return ns;
	}

	public void setNs(String ns) {
		this.ns = ns;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMaSothue() {
		return maSothue;
	}

	public void setMaSothue(String maSothue) {
		this.maSothue = maSothue;
	}

	public String getDateHopdong() {
		return dateHopdong;
	}

	public void setDateHopdong(String dateHopdong) {
		this.dateHopdong = dateHopdong;
	}

	@Override
	public String toString() {
		return ma+" " + hoten + " " + sex + " " + ns + " " + address + " " + maSothue + " " + dateHopdong;
	}

}
