package J05_array_object;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J05042 {
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<xephang> ds=new ArrayList<>();
        int n=sc.nextInt();
        while(n-->0) {
        	sc.nextLine();
        	ds.add(new xephang(sc.nextLine(),sc.nextLong(),sc.nextLong()));
        }
        Collections.sort(ds);
        for (xephang xephang : ds) {
			System.out.println(xephang);
		}
	}
}

class xephang implements Comparable<xephang> {
	private String ten;
	private long dung, sub;

	public xephang(String ten, long dung, long sub) {
		
		Scanner sc=new Scanner(ten);
		String tam;
		String hihi="";
		while(sc.hasNext()) {
			tam=sc.next();
			hihi+=tam.substring(0,1).toUpperCase()+tam.substring(1,tam.length()).toLowerCase()+" ";
		}
		this.ten=hihi;
		this.dung = dung;
		this.sub = sub;
	}

	@Override
	public String toString() {
		return ten + " " + dung + " " + sub;
	}

	@Override
	public int compareTo(xephang o) {
		if (this.dung != o.dung)
			return Long.compare(o.dung, this.dung);
		else {
			if (this.sub != o.sub)
				return Long.compare(this.sub, o.sub);
			else
				return this.ten.compareTo(o.ten);
		}
	}

}
/*
4
uyen Van Nam
18 600
Tran van Mn
168 700
Tran Thi Ngoc
16 60
Tran van an
168 700
*/
