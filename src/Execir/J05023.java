package Execir;

import java.util.ArrayList;
import java.util.Scanner;

public class J05023 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	ArrayList<vs> ds=new ArrayList<vs>();
	sc.nextLine();
	while(n-->0) {
		ds.add(new vs(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
	}
	int q=sc.nextInt();
	sc.nextLine();
	while(q-->0) {
		String nam=sc.nextLine();
		System.out.println("DANH SACH SINH VIEN KHOA "+nam+":");
		for (vs vs : ds) {
			if(vs.getLop().equals(nam.substring(2,4))) {
				System.out.println(vs);
			}
		}
	}
}
}
class vs{
	private String ma,ten,lop,email;

	public vs(String ma, String ten, String lop, String email) {
		super();
		this.ma = ma;
		this.ten = ten;
		this.lop = lop;
		this.email = email;
	}
    
	public String getLop() {
		return lop.substring(1, 3);
	}

	public void setLop(String lop) {
		this.lop = lop;
	}

	@Override
	public String toString() {
		return String.format("%s %s %s %s", ma,ten,lop,email);
	}
}
