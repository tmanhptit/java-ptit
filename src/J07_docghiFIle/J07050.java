package J07_docghiFIle;

import java.io.IOException;
import java.io.StringReader;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.File;


public class J07050 {
	public static void main(String[] args) throws IOException {
		ArrayList<mathang> ds = new ArrayList<>();
		String path="C:\\Users\\ADMIN\\eclipse-workspace\\CODETIT\\src\\GhiDocFIle\\SV.in.txt";
        Scanner in = new Scanner(new File(path));
        int n = Integer.parseInt(in.nextLine());
        int dem=0;
        
        while(n-->0){
        	dem++;
            String ten=in.nextLine();
            String loai=in.nextLine();
            float giamua=Float.parseFloat(in.nextLine());
            float giaban=Float.parseFloat(in.nextLine());
          //  int time=Integer.parseInt(in.nextLine());
           mathang e=new mathang(dem, ten, loai, (giaban-giamua));
            ds.add(e);
        }
        Collections.sort(ds);
        for(mathang tmp : ds){
            System.out.println(tmp);
        }
    }
}
class  mathang implements Comparable<mathang>{
	private String ma,ten,loai;
	private float tinchi;
	
	public mathang(int ma, String ten,String loai, float tinchi) {
		//super();
		if(ma<10) this.ma="MH0"+ma;
		else this.ma="MH"+ma;
		
		this.ten = ten;
		this.loai=loai;
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
	public String getLoai() {
		return loai;
	}
	public void setLoai(String loai) {
		this.loai = loai;
	}
	public float getTinchi() {
		return tinchi;
	}
	public void setTinchi(float tinchi) {
		this.tinchi=tinchi;
	}
	
	public mathang() {
		
	}
	@Override
	public String toString() {
		String hehe=String.format("%.2f", tinchi);
		return  ma + " " + ten +" "+loai+ " " + hehe ;
	}
	@Override
	public int compareTo(mathang o) {
			//return Integer.compare(o.tinchi, this.tinchi);
			return Float.compare(o.tinchi, this.tinchi);
	}
	

}
