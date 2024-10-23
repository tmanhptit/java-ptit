package J05_array_object;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class J05077 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<nvd> dsnv=new ArrayList<>();
		
		int[][] h=new int[4][4];
	    h[0]=new int[]{10,12,14,20};
		h[1]=new int[]{10,11,13,16};
		h[2]=new int[]{9,10,12,14};
		h[3]=new int[]{8,9,11,13};
	
		HashMap<String,String> map=new HashMap<String, String>();
		int n=sc.nextInt();
		
		sc.nextLine();
		while(n-->0) {
			String ma=sc.next();
			String ten=sc.nextLine();
			map.put(ma, ten);
		}
		
		int m=sc.nextInt();
		while(m-->0) {
			sc.nextLine();
			String ma=sc.nextLine();
			String ten=sc.nextLine();
			
            double luong=sc.nextDouble();
            double sl=sc.nextDouble();
            int i;
            int j;
		    if(ma.charAt(0)=='A') i=0;
		    else if(ma.charAt(0)=='B') i=1;
		    else if(ma.charAt(0)=='C') i=2;
		    else i=3;
		    
		    int nam=Integer.parseInt(ma.substring(1,3));
		    if(nam<4) j=0;
		    else if(nam<9) j=1;
		    else if(nam<16) j=2;
		    else j=3;
		    
		    String phong=map.get(ma.substring(3,5));
		    nvd e=new nvd(ma,ten,phong,luong*sl*h[i][j]);
		    dsnv.add(e);
			
		}
		sc.nextLine();
		String me=sc.next();
		System.out.printf("Bang luong phong%s:\n",map.get(me));
		for (nvd is : dsnv) {
			if(is.getMa().equals(me)) System.out.println(is);
		}
	}
}

class nvd {
	private String ma, ten, phong;
	private double luong;
	public nvd(String ma, String ten, String phong, double luong) {
		super();
		this.ma = ma;
		this.ten = ten;
		this.phong = phong;
		this.luong = luong;
	}
	@Override
	
	public String toString() {
		String p=String.format(" %.0f",luong*1000);
		return "" + ma + " " + ten + p;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public String getMa() {
		return ma.substring(3, 5);
	}
	public void setMa(String ma) {
		this.ma = ma;
	}
    
}
/*
2
HC Hanh chinh
KH Ke hoach Dau tu
2
C06HC
Tran Binh Minh
65
25
D03KH
Le Hoa Binh
59
24
*/