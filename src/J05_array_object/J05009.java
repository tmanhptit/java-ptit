package J05_array_object;

import java.util.ArrayList;
import java.util.Scanner;

public class J05009 {
public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int dem=0;
      double max=0;
      ArrayList<hocsinh> ds=new ArrayList<>();
      
      
      while(n-->0) {
    	  sc.nextLine();
    	  dem++;
    	 // System.out.println(dem);
    	 // System.out.println("ten");
    	  String ten=sc.nextLine();
    	  //System.out.println("ns");
    	  String ns=sc.nextLine();
    	  double d1=sc.nextDouble();
    	  double d2=sc.nextDouble();
    	  double d3=sc.nextDouble();
    	  if(d1+d2+d3>max) max=d1+d2+d3;
    	  hocsinh e=new hocsinh(dem,ten, ns, d1, d2, d3);
    	ds.add(e);		  
      }
//      System.out.println(max);
      
      for (hocsinh hocsinh : ds) {
		if(max == hocsinh.getDtb()) {
			System.out.println(hocsinh);
		}
	}
      
}
}
class hocsinh {
	private String ten,ns;
	private double d1,d2,d3,dtb;
	private int dem;
	public hocsinh(int dem,String ten, String ns, double d1, double d2, double d3) {
		super();
		this.ten = ten;
		this.dem=dem;
		int n = ns.length();
		if (n == 8) {
			this.ns = "0" + ns.substring(0, 2) + "0" + ns.substring(2, 8);
		} else if (n == 9) {
			if (ns.charAt(1) == '/')
				this.ns = "0" + ns.substring(0, 2) + ns.substring(2, 9);
			else
				this.ns = ns.substring(0, 3) + "0" + ns.substring(3, 9);
		} else {
			this.ns = ns;
		}
		
		this.d1 = d1;
		this.d2 = d2;
		this.d3 = d3;
		this.dtb=d1+d2+d3;
	}
	@Override
	public String toString() {
		String stringdiem = String.format("%.1f", dtb);
		return dem+" " + ten + " " + ns + " " + stringdiem  ;
	}
	public double getDtb() {
		return dtb;
	}
	public void setDtb(double dtb) {
		this.dtb = dtb;
	}
	
	
	
}
