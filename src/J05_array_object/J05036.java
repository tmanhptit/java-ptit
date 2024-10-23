package J05_array_object;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

import java.util.Comparator;
import java.util.Scanner;

public class J05036 {
public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int dem=0;
   
      ArrayList<hiha> dss=new ArrayList<>();
      
      
      while(n-->0) {
    	  sc.nextLine();
    	  dem++;
    	  String ten=sc.nextLine();
    	  String donvi=sc.nextLine();
    	  int gia=sc.nextInt();
    	  int sl=sc.nextInt();
    	  
    	  hiha e=new hiha(dem,ten, donvi,gia,sl);
    	  dss.add(e);		  
      }
     
      for (hiha hiha : dss) {
		System.out.println(hiha);
	}
      
}
}
class hiha {
	private String ma,ten,donvi;
	private double phi, thanhtien,giaban;
	public hiha(int ma, String ten, String donvi,int dongianhap,int soluong) {
		super();
		if(ma<10) this.ma="MH0"+ma;
		else this.ma ="MH"+ ma;
		
		this.ten = ten;
		this.donvi = donvi;
		double hehe=(double)(dongianhap*soluong);
		this.phi=hehe*0.05;
		this.thanhtien=hehe*1.05;
		double tam=this.thanhtien*1.02;
		this.giaban=tam;
	}
	@Override
	public String toString() {
		long phii=Math.round(phi);
		long thanht=Math.round(thanhtien);
		long giab=Math.round(giaban);
		return "" + ma + " " + ten + " " + donvi + " " + phii + " " + thanht
				+ " " + giab+ "";
	}
	
	
	
}
