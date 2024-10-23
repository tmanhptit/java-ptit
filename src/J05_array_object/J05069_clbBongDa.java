package J05_array_object;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class J05069_clbBongDa {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
	   ArrayList<clb_BongDa> ds_clb=new ArrayList<>();
	   dstrandau dstd=new dstrandau();
	 
		while (t-- > 0) {
			sc.nextLine();
			String id = sc.nextLine();
			String ten = sc.nextLine();
			int sotran = sc.nextInt();
			clb_BongDa e = new clb_BongDa(id, ten, sotran);
		    ds_clb.add(e);
		}
		t=sc.nextInt();
		while(t-->0) {
			String id=sc.next();
			int gia=sc.nextInt();
			String ma=id.substring(1,3);
			for (clb_BongDa clb : ds_clb) {
				if(clb.getCLB_id().equals(ma)) {
					trandau e=new trandau(id, clb.getCLB_name(), gia*clb.getSotran());
					dstd.themtran(e);
				}
			}
		}
		dstd.sapxep();
		dstd.in();
		
	}
}
class dstrandau{
	private ArrayList<trandau> dstran;

	public ArrayList<trandau> getDstran() {
		return dstran;
	}

	public void setDstran(ArrayList<trandau> dstran) {
		this.dstran = dstran;
	}
    
	public dstrandau(ArrayList<trandau> dstran) {
		super();
		this.dstran = dstran;
	}
	
	public dstrandau() {
		
		this.dstran =new ArrayList<trandau>();
	}
	public void themtran(trandau e) {
		dstran.add(e);
	}
	public void sapxep() {
		Collections.sort(dstran);
	}
	public void in() {
	for (trandau trandau : dstran) {
		System.out.println(trandau);
	}
	}
	
	
}
class trandau implements Comparable<trandau>{
	private String matran, TenCLB;
	private int giaban;
	
	public trandau(String matran, String tenCLB, int giaban) {
		
		this.matran = matran;
		this.TenCLB = tenCLB;
		this.giaban = giaban;
	}
	
	@Override
	public String toString() {
		return "" + matran + " " + TenCLB + " " + giaban ;
	}

	public String getMatran() {
		return matran;
	}
	public void setMatran(String matran) {
		this.matran = matran;
	}
	public String getTenCLB() {
		return TenCLB;
	}
	public void setTenCLB(String tenCLB) {
		TenCLB = tenCLB;
	}
	public int getGiaban() {
		return giaban;
	}
	public void setGiaban(int giaban) {
		this.giaban = giaban;
	}

	@Override
	public int compareTo(trandau o) {
		// TODO Auto-generated method stub
		return Double.compare(o.giaban, this.giaban);
	}
	
}

class clb_BongDa {
	private String CLB_id, CLB_name;
	private int sotran;
	
	public clb_BongDa(String cLB_id, String cLB_name, int sotran) {
		//super();
		this.CLB_id = cLB_id;
		this.CLB_name = cLB_name;
		this.sotran = sotran;
	}
	
	public String getCLB_id() {
		return CLB_id;
	}
	public void setCLB_id(String cLB_id) {
		CLB_id = cLB_id;
	}
	public String getCLB_name() {
		return CLB_name;
	}
	public void setCLB_name(String cLB_name) {
		CLB_name = cLB_name;
	}
	public int getSotran() {
		return sotran;
	}
	public void setSotran(int sotran) {
		this.sotran = sotran;
	}
	

	
}
/*
2
AC
AC Milan
12
MU
Manchester United
10
2
IAC1 80000
EMU2 60000
*/