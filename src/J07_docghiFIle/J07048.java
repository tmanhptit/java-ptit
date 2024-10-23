package J07_docghiFIle;

import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.File;


public class J07048 {
	public static void main(String[] args) throws IOException {
		ArrayList<sanpham> ds = new ArrayList<>();
		String path="E:\\Code\\Eclip\\eclipse-workspace\\CODETIT\\src\\J07_docghiFIle\\SV.in.txt";
        Scanner in = new Scanner(new File(path));
        int n = Integer.parseInt(in.nextLine());
        while(n-->0){
            
            String ma=in.nextLine();
            String ten=in.nextLine();
            int rate=Integer.parseInt(in.nextLine());
            int time=Integer.parseInt(in.nextLine());
            sanpham e=new sanpham(ma,ten,rate,time);
            ds.add(e);
        }
        Collections.sort(ds, new Comparator<sanpham>() {
            
			@Override
			public int compare(sanpham o1, sanpham o2) {
				// So sánh theo giá bán
                int giaBanCompare = Integer.compare(o2.getRate(), o1.getRate());
                if (giaBanCompare != 0) {
                    return giaBanCompare;
                }

                // Nếu giá bán bằng nhau, thì so sánh theo mã sản phẩm
                return o1.getMa().compareTo(o2.getMa());
			}
        });
        //Collections.sort(ds);
        for(sanpham tmp : ds){
            System.out.println(tmp);
        }
    }
}
class sanpham implements Comparable<sanpham>{
	private String ma,ten;
	private int rate,time;
	
	public sanpham(String ma, String ten, int rate, int time) {
		//super();
		this.ma = ma;
		this.ten = ten;
		this.rate = rate;
		this.time = time;
	}
	public String getMa() {
		return ma;
	}
	public void setMa(String ma) {
		this.ma = ma;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public int getRate() {
		return rate;
	}
	public void setRate(int rate) {
		this.rate = rate;
	}
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	public sanpham() {
		
	}
	@Override
	public String toString() {
		return  ma + " " + ten + " " + rate + " " + time ;
	}
	@Override
	public int compareTo(sanpham o) {
		// TODO Auto-generated method stub
		return Integer.compare( o.rate,this.rate);
	}
	

}
