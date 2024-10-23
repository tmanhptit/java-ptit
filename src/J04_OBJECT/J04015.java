package J04_OBJECT;

import java.util.Scanner;

public class J04015 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	String man=sc.nextLine();
	String ten=sc.nextLine();
	int luon=sc.nextInt();
	giaovien a=new giaovien(man, ten, luon);
	System.out.println(a+" "+a.phucap()+" "+a.Luongcoban());
}
}
class giaovien{
	private String mangach,ten;
	private int luong,pc;
	public giaovien(String mangach, String ten, int luong) {
		
		this.mangach = mangach;
		this.ten = ten;
		this.pc = Integer.parseInt(mangach.substring(2,4));
		this.luong = luong;
	}
	public String getMangach() {
		return mangach;
	}
	public void setMangach(String mangach) {
		this.mangach = mangach;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public int getLuong() {
		return luong;
	}
	public void setLuong(int luong) {
		this.luong = luong;
	}
	public int getPc() {
		return pc;
	}
	public void setPc(int pc) {
		this.pc = pc;
	}
	@Override
	public String toString() {
		return   mangach + " " + ten + " " + pc;
	}
	public int phucap() {
		if(this.mangach.substring(0,2).equals("HT")) return 2000000;
		else if(this.mangach.substring(0,2).equals("HP")) return 900000;
		else return 500000;
	}
	public int Luongcoban() {
		return this.pc*this.luong+ phucap();
	}
	
	
	
	
	
	
}
