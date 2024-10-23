package J05_array_object;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class J05010 {
public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int dem=0;
      float max=0;
      ArrayList<packet> dss=new ArrayList<>();
      
      
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
    	  
    	  packet e=new packet(dem,ten, ns,d1,d2);
    	dss.add(e);		  
      }
      Collections.sort(dss, new Comparator<packet>() {

		@Override
		public int compare(packet o1, packet o2) {
			// TODO Auto-generated method stub
			if(o1.getDtb()>o2.getDtb()) return -1;
			else if(o1.getDtb()<o2.getDtb()) return 1;
			else return 0;
		}
	});  
      for (packet packet : dss) {
		System.out.println(packet);
	}
      
}
}
class packet {
	private String ten,ns;
	private double d1,d2,dtb;
	private int dem;
	public packet(int dem,String ten, String ns,double d1,double d2) {
		super();
		this.ten = ten;
		this.dem=dem;
		this.ns=ns;
		
		this.d1 = d1;
		this.d2 = d2;
		
		this.dtb=d2-d1;
	}
	
	public double getDtb() {
		return dtb;
	}

	public void setDtb(int dtb) {
		this.dtb = dtb;
	}

	@Override
	public String toString() {
		String fom=String.format("%.2f",dtb);
		return dem+" " + ten + " " + ns + " " + fom  ;
	}

	
}
