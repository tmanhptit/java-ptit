package J05_array_object;

import java.util.Scanner;

public class J05017 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int dem=0;
	while(n-->0) {
		dem++;
		String ten=sc.nextLine();
		int t1=sc.nextInt();
		int t2=sc.nextInt();
		ngu a=new ngu(dem, ten, t2-t1);
		
	}
}
}
class ngu{
	private String ma,ten;
	private double tien;
	public ngu(int ma, String ten, double tien) {
		super();
		if(ma<10) this.ma="KH0"+ma;
		else this.ma="KH"+ma;
		
		this.ten = ten;
		if(tien<51) this.tien=tien*102;
		else if(tien<101) this.tien=tien*
		this.tien = tien;
	}
	
}
