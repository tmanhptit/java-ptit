package J04_OBJECT;


import java.util.Scanner;

public class J04018 {
  public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      while(n-->0) {
    	 
    	  //System.out.println(n);
    	  int a=sc.nextInt();
    	  int b=sc.nextInt();
    	  int c=sc.nextInt();
    	  int d=sc.nextInt();
    	  sophuc A=new sophuc(a, b);
    	  sophuc B=new sophuc(c, d);
    	  sophuc z=new sophuc();
    	  sophuc tongg=new sophuc();
    	  tongg.tong(A, B);
    	  z.nhan(tongg, A);
    	  System.out.print(z+", ");
    	  
    	  z.nhan(tongg, tongg);
    	  System.out.println(z);
    	  
      }
      
      
    	 
  }
}
class sophuc{
	private int a,b;

	public sophuc(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}
	public sophuc() {
		
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	@Override
	public String toString() {
		return a+" + "+b+"i";
	}
	public sophuc tong(sophuc x,sophuc y) {
		
		this.a=x.a+y.a;
		this.b=x.b+y.b;
		sophuc z=new sophuc(this.a,this.b);
		return z;
	}
	public sophuc nhan(sophuc x,sophuc y) {
		
		this.a=x.a*y.a-x.b*y.b;
		this.b=x.a*y.b+x.b*y.a;
		sophuc z=new sophuc(this.a,this.b);
		
		return z;
	}
	
}
