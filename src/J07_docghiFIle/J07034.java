package J07_docghiFIle;

import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.File;


public class J07034 {
	public static void main(String[] args) throws IOException {
		ArrayList<monhoc> ds = new ArrayList<>();
		String path="C:\\Users\\ADMIN\\eclipse-workspace\\CODETIT\\src\\GhiDocFIle\\SV.in.txt";
        Scanner in = new Scanner(new File(path));
        int n = Integer.parseInt(in.nextLine());
        while(n-->0){
            String ma=in.nextLine();
            String ten=in.nextLine();
            int tinchi=Integer.parseInt(in.nextLine());
          //  int time=Integer.parseInt(in.nextLine());
            monhoc e=new monhoc(ma,ten,tinchi);
            ds.add(e);
        }
        Collections.sort(ds);
        for(monhoc tmp : ds){
            System.out.println(tmp);
        }
    }
}
class  monhoc implements Comparable<monhoc>{
	private String ma,ten;
	private int tinchi;
	
	public monhoc(String ma, String ten, int tinchi) {
		//super();
		this.ma = ma;
		this.ten = ten;
		this.tinchi=tinchi;
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
	public int getTinchi() {
		return tinchi;
	}
	public void setTinchi(int tinchi) {
		this.tinchi=tinchi;
	}
	
	public monhoc() {
		
	}
	@Override
	public String toString() {
		return  ma + " " + ten + " " + tinchi ;
	}
	@Override
	public int compareTo(monhoc o) {
			//return Integer.compare(o.tinchi, this.tinchi);
			return this.ten.compareTo(o.getTen());
	}
	

}
