package J02_array;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class J02009 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	ArrayList<heeh> ds=new ArrayList<>();
	int n=sc.nextInt();
	while(n-->0) {
		int a=sc.nextInt();
		int b=sc.nextInt();
		heeh h=new heeh(a,b);
		ds.add(h);
	}
	Collections.sort(ds,new Comparator<heeh>() {

		@Override
		public int compare(heeh o1, heeh o2) {
			if(o1.getTruoc()<o2.getTruoc())return -1;
			else if(o1.getTruoc()>o2.getTruoc())return 1;
			else if(o1.getTruoc()==o2.getTruoc()) {
				if(o1.getSau()<o2.getSau()) return -1;
				else if(o1.getSau()>o2.getSau())return 1;
				else return 0;
			}
			return 0;
		}
	});
	int tong=0;
	for (heeh h : ds) {
		if(h.getTruoc()>tong) { tong=0;
			tong+=h.getSau()+h.getTruoc();
		}
		else {
			tong+=h.getSau();
		}
	}
	System.out.println(tong);
	
}

}
class heeh{
	private int truoc,sau;

	public heeh(int truoc, int sau) {
		super();
		this.truoc = truoc;
		this.sau = sau;
	}

	public int getTruoc() {
		return truoc;
	}

	public void setTruoc(int truoc) {
		this.truoc = truoc;
	}

	public int getSau() {
		return sau;
	}

	public void setSau(int sau) {
		this.sau = sau;
	}

	@Override
	public String toString() {
		return truoc+" "+sau;
	}
	
}
