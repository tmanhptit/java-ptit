package J07_docghiFIle;

import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.File;


public class J07045 {
	public static void main(String[] args) throws IOException {
		ArrayList<LoaiPhong> ds = new ArrayList<>();
		String path="C:\\Users\\ADMIN\\eclipse-workspace\\CODETIT\\src\\GhiDocFIle\\SV.in.txt";
        Scanner in = new Scanner(new File(path));
        int n = Integer.parseInt(in.nextLine());
        while(n-->0){
            ds.add(new LoaiPhong(in.nextLine()));
        }
        Collections.sort(ds);
        for(LoaiPhong tmp : ds){
            System.out.println(tmp);
        }
    }
}
class LoaiPhong implements Comparable<LoaiPhong>{
	private char kyhieu;
	private String ten;
	private int rate;
	private Double phi;
	public char getKyhieu() {
		return kyhieu;
	}
	public void setKyhieu(char kyhieu) {
		this.kyhieu = kyhieu;
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
	public Double getPhi() {
		return phi;
	}
	public void setPhi(Double phi) {
		this.phi = phi;
	}
	public LoaiPhong(String t) {
		super();
		Scanner sc=new Scanner(t);
		while(sc.hasNext()) {
			this.kyhieu=sc.next().charAt(0);
			this.ten=sc.next();
			this.rate=Integer.parseInt(sc.next());
			this.phi=Double.parseDouble(sc.next());
		}
	}
	@Override
	public String toString() {
		return  kyhieu + " " + ten + " " + rate + " " + phi ;
	}
	@Override
	public int compareTo(LoaiPhong o) {
		// TODO Auto-generated method stub
		return Integer.compare( this.ten.charAt(0),o.ten.charAt(0));
	}

}
