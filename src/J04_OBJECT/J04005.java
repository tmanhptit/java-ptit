package J04_OBJECT;

import java.util.Scanner;

public class J04005 {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	
	String hoten=sc.nextLine();
	String ns=sc.nextLine();
	float d1=sc.nextFloat();
	float d2=sc.nextFloat();
	float d3=sc.nextFloat();
	thisinh manhdeptrai=new thisinh(hoten, ns, d1, d2, d3);
	System.out.printf(manhdeptrai+ " %.1f",manhdeptrai.diemtrungbinh());
}
}
class thisinh {
	private String name,ns;
	private float d1,d2,d3;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNs() {
		return ns;
	}
	public void setNs(String ns) {
		this.ns = ns;
	}
	public float getD1() {
		return d1;
	}
	public void setD1(float d1) {
		this.d1 = d1;
	}
	public float getD2() {
		return d2;
	}
	public void setD2(float d2) {
		this.d2 = d2;
	}
	public float getD3() {
		return d3;
	}
	public void setD3(float d3) {
		this.d3 = d3;
	}
	public thisinh(String name, String ns, float d1, float d2, float d3) {
		//super();
		this.name = name;
		this.ns = ns;
		this.d1 = d1;
		this.d2 = d2;
		this.d3 = d3;
	}
	@Override
	public String toString() {
		return name + " " + ns;
	}
	public float diemtrungbinh() {
		return (this.d1+this.d2+this.d3);
	}
	
	
	
}
