package J05_array_object;

//import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J05027 {
public static void main(String[] args) {
	Scanner scc=new Scanner(System.in);
	int n=scc.nextInt();
	int dem=0;
	scc.nextLine();
	//System.out.println(n);
	ArrayList<conmemay> ds=new ArrayList<>();
	while(n-->0) {
		dem++;
		String ten=scc.nextLine();
		String nganh=scc.nextLine();
		conmemay e=new conmemay(dem, ten, nganh);
		ds.add(e);
	}
	int q=scc.nextInt();
	scc.nextLine();
	while(q-->0) {
		String key=scc.nextLine();
		System.out.println("DANH SACH GIANG VIEN THEO TU KHOA "+key+":");
		
		for (conmemay conmemay : ds) {
			if(conmemay.getTen().toLowerCase().contains(key.toLowerCase())) System.out.println(conmemay);
		}
	}
}
}
class conmemay implements Comparable<conmemay>{
	private String ma,ten,nganh;
	private String tn;

	public conmemay(int ma, String ten, String nganh) {
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

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	@Override
	public String toString() {
		return  ma + " " + ten + " " + nganh ;
	}

	@Override
	public int compareTo(conmemay o) {
		// TODO Auto-generated method stub
		return tn.compareTo(o.tn);
	}
	
	
	
}

