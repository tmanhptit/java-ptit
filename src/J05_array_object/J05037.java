package J05_array_object;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J05037 {
public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int dem=0; 
      ArrayList<mgu> dsss=new ArrayList<>();  
      while(n-->0) {
    	  sc.nextLine();
    	  dem++;
    	  String ten=sc.nextLine();
    	  String donvi=sc.nextLine();
    	  int gia=sc.nextInt();
    	  int sl=sc.nextInt();  	  
    	  mgu e=new mgu(dem,ten, donvi,gia,sl);
    	  dsss.add(e);		  
      }
     Collections.sort(dsss);
      for (mgu mgu : dsss) {
		System.out.println(mgu);
	}
      
}
}
class mgu implements Comparable<mgu>{
	private String ma,ten,donvi;
	private double phi, thanhtien,giaban;
	public mgu(int ma, String ten, String donvi,int dongianhap,int soluong) {
		super();
		if(ma<10) this.ma="MH0"+ma;
		else this.ma ="MH"+ ma;
		
		this.ten = ten;
		this.donvi = donvi;
		double hehe=(double)(dongianhap*soluong);
		this.phi=hehe*0.05;
		this.thanhtien=hehe*1.05;
		double tam=this.thanhtien*1.02;
		this.giaban=tam/(double)soluong;
	}
	@Override
	public String toString() {
		long phii=Math.round(phi);
		long thanht=Math.round(thanhtien);
		
		long hehe=Math.round(giaban);
		long du=hehe%100;
		if(du>0) { hehe=hehe+(100-du);
		}
		
		
		return "" + ma + " " + ten + " " + donvi + " " + phii + " " + thanht
				+ " " + hehe+ "";
		
	}
	@Override
	public int compareTo(mgu o) {
		// TODO Auto-generated method stub
		return Double.compare(o.giaban, this.giaban);
	}
	
	
	
}
