package J07_docghiFIle;


import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J07056 {
public static void main(String[] args)throws IOException {
	String p="E:\\Code\\Eclip\\eclipse-workspace\\CODETIT\\src\\J07_docghiFIle\\SV.in.txt";
	Scanner sc =new Scanner(new File(p));
	
	int n=Integer.parseInt(sc.nextLine());
	//System.out.println(n);
    ArrayList<heee> ds=new ArrayList<>();
    int dem=0;
    while(n-->0) {
    	dem++;
    	String ten=sc.nextLine();
    	String hh=sc.nextLine();
    	Scanner doc=new Scanner(hh);
    	String ma=doc.next();
    	int dau=doc.nextInt();
    	int cuoi=doc.nextInt();
    	ds.add(new heee(dem,ten,ma,cuoi-dau));
    }
   
    Collections.sort(ds);
    for (heee heee : ds) {
		System.out.println(heee);
	}
}
}
class heee implements Comparable<heee>{
	private String ma,ten;
	private Double trongdm,vuotdm,tong,thue;
	public heee(int ma, String ten,String loai,int so) {
	    if(ma<10) this.ma = "KH0"+ma;
	    else this.ma="KH"+ma;
	    Scanner doc=new Scanner(ten);
	    String tam="";
	    while(doc.hasNext()) {
	    	String u=doc.next().toLowerCase();
	    	tam+=u.substring(0, 1).toUpperCase()+u.substring(1, u.length())+" ";
	    }
	    this.ten=tam.substring(0, tam.length()-1);
	    int t=0;
	    if(loai.charAt(0)=='A') t=100;
	    else if(loai.charAt(0)=='B') t=500;
	    else t=200;
	    if(so<t) {
	    	this.trongdm=(double)so*450.0;
	    	this.vuotdm=0.0;
	    }
	    else {
	    	this.trongdm=t*450.0;
	        this.vuotdm=(double)(so-t)*1000.0;
	    }
	    this.thue=this.vuotdm*0.05;
		this.tong = this.trongdm+this.vuotdm*1.05;
	}
	@Override
	public String toString() {
		String he=String.format(" %.0f %.0f %.0f %.0f", trongdm,vuotdm,thue,tong);
		return "" + ma + " " + ten + he;
	}
	@Override
	public int compareTo(heee o) {
		// TODO Auto-generated method stub
		return Double.compare(o.tong, this.tong);
	}
	
}
