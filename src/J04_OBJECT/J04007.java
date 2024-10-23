package J04_OBJECT;

import java.util.Scanner;

public class J04007 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	String ten=sc.nextLine();
	String xec=sc.nextLine();
	String ns=sc.nextLine();
	String diachi=sc.nextLine();
	String mst=sc.nextLine();
	String ngay=sc.nextLine();
	nhanvien ngu=new nhanvien(ten, xec,ns, diachi, mst, ngay);
	System.out.println(ngu);
}
}
class nhanvien{
	private String hoten,sex,ns,address,maSothue,dateHopdong;

	public nhanvien(String hoten, String sex, String ns, String address, String maSothue, String dateHopdong) {
		super();
		this.hoten = hoten;
		this.sex = sex;
		int n=ns.length();
		if(n==8) {
			this.ns="0"+ns.substring(0,2)+"0"+ns.substring(2,8);
		}else if(n==9) {
			if(ns.charAt(1)=='/') this.ns="0"+ns.substring(0,2)+ns.substring(2,9);
			else this.ns=ns.substring(0,3)+"0"+ns.substring(3,9);
		}else {
		this.ns=ns;	
		}
		this.address = address;
		this.maSothue = maSothue;
		
		n=dateHopdong.length();
		if(n==8) {
			this.dateHopdong="0"+dateHopdong.substring(0,2)+"0"+dateHopdong.substring(2,8);
		}else if(n==9) {
			if(dateHopdong.charAt(1)=='/') this.dateHopdong="0"+dateHopdong.substring(0,2)+dateHopdong.substring(2,9);
			else this.dateHopdong=dateHopdong.substring(0,3)+"0"+dateHopdong.substring(3,9);
		}else {
		this.dateHopdong=dateHopdong;	
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
		return "00001 " + hoten +" "+sex+ " "+ ns + " " + address + " "
				+ maSothue + " " + dateHopdong ;
	}
	
}
