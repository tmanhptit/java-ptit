package J04_OBJECT;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class J04033 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	danhsach_time hahaha=new danhsach_time();
	int t=sc.nextInt();
	while(t-->0) {
		int gio=sc.nextInt();
		int phut=sc.nextInt();
		int giay=sc.nextInt();
		timee e=new timee(gio, phut, giay);
		hahaha.themtime(e);
	}
	hahaha.sapxep();
	hahaha.printdanhsach();
	
}
}
class timee{
	private int gio,phut,giay,tong;

	public int getGio() {
		return gio;
	}

	public void setGio(int gio) {
		this.gio = gio;
	}

	public int getPhut() {
		return phut;
	}
	public int getTong() {
		return tong;
	}
	public void setPhut(int phut) {
		this.phut = phut;
	}

	public int getGiay() {
		return giay;
	}

	public void setGiay(int giay) {
		this.giay = giay;
	}

	public timee(int gio, int phut, int giay) {
		//super();
		this.gio = gio;
		this.phut = phut;
		this.giay = giay;
		this.tong = gio*60*60+phut*60+giay;
	}

	@Override
	public String toString() {
		return  gio + " " + phut + " " + giay ;
	}
	
}
class danhsach_time{
	private ArrayList<timee> danhsachtime;

	public ArrayList<timee> getDanhsachtime() {
		return danhsachtime;
	}

	public void setDanhsachtime(ArrayList<timee> danhsachtime) {
		this.danhsachtime = danhsachtime;
	}

	public danhsach_time(ArrayList<timee> danhsachtime) {
		super();
		this.danhsachtime = danhsachtime;
	}
	public danhsach_time() {
		super();
		this.danhsachtime = new ArrayList<timee>();
	}
	public void printdanhsach() {
		for (timee timee : danhsachtime) {
			System.out.println(timee);
		}
	}
	public void themtime(timee e) {
		danhsachtime.add(e);
	}
	public void sapxep() {
		Collections.sort(this.danhsachtime,new Comparator<timee>() {

			@Override
			public int compare(timee o1, timee o2) {
				if(o1.getTong()>o2.getTong()) return 1;
				else if(o1.getTong()<o2.getTong()) return -1;
				else return 0;
			}
		});
	}
	
}
