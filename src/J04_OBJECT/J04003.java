package J04_OBJECT;

import java.util.Scanner;

public class J04003 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	long a=sc.nextLong();
	long b=sc.nextLong();
	ps u=new ps(a, b);
	
	System.out.println(u.getA()/u.uc(a, b)+"/"+u.getB()/u.uc(a, b)
			);
}
}

class ps{
	private Long a,b;

	
	public ps(Long a, Long b) {
		//super();
		this.a = a;
		this.b = b;
	}
	public ps() {
		super();
	}

	public Long getA() {
		return a;
	}

	public void setA(Long a) {
		this.a = a;
	}

	public Long getB() {
		return b;
	}

	public void setB(Long b) {
		this.b = b;
	}
	public Long ucnn() {
		while(true) {
			if(this.a>this.b) this.a-=b;
			else this.b-=this.a;
			if(this.a==this.b)return this.a;
		}
		
	}
	public String hhee() {
	return (this.a/uc(this.a,this.b))+"/"+(this.b/uc(this.a,this.b));
	}
	public long uc(long a,long b) {
		while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
	}
	
}
