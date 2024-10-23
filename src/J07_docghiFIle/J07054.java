package J07_docghiFIle;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.io.File;
public class J07054 {
public static void main(String[] args)throws IOException {
	String p="E:\\Code\\Eclip\\eclipse-workspace\\CODETIT\\src\\J07_docghiFIle\\MissYou.txt";
	Scanner sc =new Scanner(new File(p));
	
	int n=Integer.parseInt(sc.nextLine());
	//System.out.println(n);
    ArrayList<hi> ds=new ArrayList<>();
    int dem=0;
    while(n-->0) {
    	dem++;
    	String ten=sc.nextLine();
    	int d1=Integer.parseInt(sc.nextLine());
    	int d2=Integer.parseInt(sc.nextLine());
    	int d3=Integer.parseInt(sc.nextLine());
    	ds.add(new hi(dem,ten,d1*0.25+d2*0.35+d3*0.4));
    }
    Collections.sort(ds);
   
    
    for (hi hi : ds) {
		System.out.println(hi);
	}

}
}
class hi implements Comparable<hi>{
	private String ma,ten;
	private double diem;
	private String xh;
	public hi(int ma, String ten, double diem) {
		
		if(ma<10) this.ma = "SV0"+ma;
		else this.ma="SV"+ma;
		Scanner doc=new Scanner(ten);
		String tam="";
		while(doc.hasNext()) {
			String tu=doc.next().toLowerCase();
			tam+=tu.substring(0,1).toUpperCase()+tu.substring(1,tu.length())+" ";
		}
		this.ten=tam.substring(0, tam.length()-1);
		
		this.diem = diem;
		if(diem<5) this.xh="KEM";
		else if(diem<6.5) this.xh="TRUNG BINH";
		else if(diem<8) this.xh="KHA";
		else  this.xh="GIOI";
		
	}
	
	public double getDiem() {
		return diem;
	}
	public void setDiem(double diem) {
		this.diem = diem;
	}
	
	@Override
	public String toString() {
		String heh=String.format("%.2f", diem);
		return "" + ma + " " + ten + " " + heh + " " + xh ;
	}
	@Override
	public int compareTo(hi o) {
		// TODO Auto-generated method stub
		return Double.compare(o.diem, this.diem);
	}
	
	
}
