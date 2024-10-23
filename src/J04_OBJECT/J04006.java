package J04_OBJECT;

import java.util.Scanner;

public class J04006 {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	
	String hoten=sc.nextLine();
	String masv=sc.nextLine();
	String ns=sc.nextLine();
	float diem=sc.nextFloat();
	sinhvien manhdeptrai=new sinhvien(hoten, masv, ns, diem);
	System.out.printf(manhdeptrai+ " %.2f",manhdeptrai.getDiem());
}
}
class sinhvien {
	private String name,msv,ns;
	private float diem;
	public sinhvien(String name, String msv, String ns, float diem) {
		super();
		this.name = name;
		this.msv = msv;
		int n=ns.length();
		if(n==8) {
			this.ns="0"+ns.substring(0,2)+"0"+ns.substring(2,8);
		}else if(n==9) {
			if(ns.charAt(1)=='/') this.ns="0"+ns.substring(0,2)+ns.substring(2,9);
			else this.ns=ns.substring(0,3)+"0"+ns.substring(3,9);
		}else {
		this.ns=ns;	
		}

		
		this.diem = diem;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMsv() {
		return msv;
	}
	public void setMsv(String msv) {
		this.msv = msv;
	}
	public String getNs() {
		return ns;
	}
	public void setNs(String ns) {
		this.ns = ns;
	}
	public float getDiem() {
		return diem;
	}
	public void setDiem(float diem) {
		this.diem = diem;
	}
	@Override
	public String toString() {
		return  "B20DCCN001 " + name + " " +msv+" "+ ns   ;
	}
	
	
	
	
}
