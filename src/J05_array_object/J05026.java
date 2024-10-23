package J05_array_object;

//import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J05026 {
public static void main(String[] args) {
	Scanner scc=new Scanner(System.in);
	int n=scc.nextInt();
	int dem=0;
	scc.nextLine();
	//System.out.println(n);
	ArrayList<dumamay> ds=new ArrayList<>();
	while(n-->0) {
		dem++;
		String ten=scc.nextLine();
		String nganh=scc.nextLine();
		dumamay e=new dumamay(dem, ten, nganh);
		ds.add(e);
	}
	int q=scc.nextInt();
	scc.nextLine();
	while(q-->0) {
		String nganh=scc.nextLine();
		
		Scanner nn=new Scanner(nganh);
		String tamm="";
		while(nn.hasNext()) {
			tamm+=nn.next().substring(0,1).toUpperCase();
			//System.out.println(tamm);
		}
		System.out.println("DANH SACH GIANG VIEN BO MON "+tamm+":");
		for (dumamay dumamay : ds) {
			if(tamm.equals(dumamay.getNganh())) 	System.out.println(dumamay);
		}
	}
}
}
class dumamay implements Comparable<dumamay>{
	private String ma,ten,nganh;
	private String tn;

	public dumamay(int ma, String ten, String nganh) {
		super();
		if(ma<10) {
		this.ma ="GV0"+ma;
		}else {
			this.ma="GV"+ma;
		}
		this.ten = ten;
		
		Scanner nn=new Scanner(nganh);
		String tamm="";
		while(nn.hasNext()) {
			tamm+=nn.next().substring(0,1).toUpperCase();
		}
		this.nganh=tamm;
		Scanner sc=new Scanner(ten);
		while(sc.hasNext()) {
			this.tn=sc.next();
		}
	}

	public String getNganh() {
		return nganh;
	}

	public void setNganh(String nganh) {
		this.nganh = nganh;
	}

	@Override
	public String toString() {
		return  ma + " " + ten + " " + nganh ;
	}

	@Override
	public int compareTo(dumamay o) {
		// TODO Auto-generated method stub
		return tn.compareTo(o.tn);
	}
	
	
	
}
