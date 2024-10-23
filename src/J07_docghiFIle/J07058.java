package J07_docghiFIle;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class J07058 {
	public static void main(String[] args) throws Exception {
	      String path="C:\\Users\\ADMIN\\eclipse-workspace\\CODETIT\\src\\J07_docghiFIle\\SV.in.txt";
	      Scanner in = new Scanner(new File(path));
	      int dem=0;
	      int n = Integer.parseInt(in.nextLine());
	      ArrayList<monhocc> danhsach=new ArrayList<>();
	      while(n-->0) {
	    	  dem++;
	    	  //System.out.println(n);
	    	  String ten=in.nextLine();
	    	  String ma=in.nextLine();
	    	  String put=in.nextLine();
	    	 
	    	  
	    	  monhocc e=new monhocc(ten, ma, put);
	    	  danhsach.add(e);
	      }
	      Collections.sort(danhsach);
	      for (monhocc monhocc : danhsach) {
			System.out.println(monhocc);
		}
	    }

}
class monhocc implements Comparable<monhocc>{
	private String ma,ten,hinhthuc;

	public monhocc(String ma, String ten, String hinhthuc) {
		//super();
		this.ma = ma;
		this.ten = ten;
		this.hinhthuc = hinhthuc;
	}
	public monhocc() {
	
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

	public String getHinhthuc() {
		return hinhthuc;
	}

	public void setHinhthuc(String hinhthuc) {
		this.hinhthuc = hinhthuc;
	}

	@Override
	public String toString() {
		return ma + " " + ten + " " + hinhthuc;
	}

	

	@Override
	public int compareTo(monhocc o) {
		// TODO Auto-generated method stub
		return this.getMa().compareTo(o.getMa());
	}
	
}