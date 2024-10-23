package J04_OBJECT;

import java.util.Scanner;

public class J04004 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	long a=sc.nextLong();
	long b=sc.nextLong();
	phanso u=new phanso(a, b);
	a=sc.nextLong();
	b=sc.nextLong();
	phanso u2=new phanso(a,b);
	//System.out.println(u2+" "+u);
	//System.out.println();
	phanso u3= new phanso(u, u2);
	System.out.println(u3);
	
}
}

class phanso{
	private long a,b;

	
	public phanso(long a, long b) {
		long x=a,y=b;
		while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
		//super();
		this.a = x/a;
		this.b = y/a;
	}
	

	public long getA() {
		return a;
	}

	public void setA(Long a) {
		this.a = a;
	}

	public long getB() {
		return b;
	}

	public void setB(Long b) {
		this.b = b;
	}
	public phanso(phanso x,phanso y) {
	 this.a= x.a*y.b+x.b*y.a;
	 this.b=x.b*y.b;
	 long a=this.a,b=this.b;
	// long tama=a,long tamb=b;
		while (b != 0) {
         long temp = b;
         b = a % b;
         a = temp;
     }
	 this.a=this.a/a;
	 this.b=this.b/a;
	}
	@Override
	public String toString() {
		return a + "/" + b;
	}
	
	
	
}
