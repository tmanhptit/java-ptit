package J04_OBJECT;

import java.util.Scanner;

public class J04008 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	while(t-->0) {
		float x1=sc.nextFloat();
		float y1=sc.nextFloat();
		float x2=sc.nextFloat();
		float y2=sc.nextFloat();
		float x3=sc.nextFloat();
		float y3=sc.nextFloat();
		Diem a1=new Diem(x1,y1);
		Diem a2=new Diem(x2,y2);
		Diem a3=new Diem(x3,y3);
		if(a1.check(a1, a2, a3)==0)System.out.println("INVALID");
		else System.out.printf("%.3f\n",a1.check(a1, a2, a3));
	}
}
}
class Diem{
	private double x,y;

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public Diem(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}
	public Diem(Diem p) {
		//super();
		this.x = p.x;
		this.y = p.y;
	}
	public Diem() {
		
	}
	
	@Override
	public String toString() {
		return "Diem [x=" + x + ", y=" + y + "]";
	}

	public double distance(Diem p1) {
		return Math.sqrt( (p1.x-this.x)*(p1.x-this.x)+(p1.y-this.y)*(p1.y-this.y) );
	}
	public double distance(Diem p1,Diem p2) {
		return Math.sqrt( (p1.x-p2.x)*(p1.x-p2.x)+(p1.y-p2.y)*(p1.y-p2.y) );
	}
	public double check(Diem p1,Diem p2,Diem p3) {
		double a1=p1.distance(p2);
		double a2=p1.distance(p3);
		double a3=p2.distance(p3);
		if(a1*a2*a3<=0) return 0;
		
		if(a1+a2<=a3) return 0;
		if(a1+a3<=a2)return 0;
		if(a2+a3<=a1)return 0;
		
		return a1+a2+a3;
		}
	
}

