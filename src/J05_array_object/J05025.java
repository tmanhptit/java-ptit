package J05_array_object;

//import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J05025 {
public static void main(String[] args) {
	Scanner scc=new Scanner(System.in);
	int n=scc.nextInt();
	int dem=0;
	scc.nextLine();
	//System.out.println(n);
	ArrayList<gvvv> ds=new ArrayList<>();
	while(n-->0) {
		dem++;
		String ten=scc.nextLine();
		String nganh=scc.nextLine();
		gvvv e=new gvvv(dem, ten, nganh);
		ds.add(e);
	}
	//System.out.println(ds.size());
	Collections.sort(ds);
	for (gvvv gvvv : ds) {
		System.out.println(gvvv);
	}
}
}
class gvvv implements Comparable<gvvv>{
	private String ma,ten,nganh;
	private String tn;

	public gvvv(int ma, String ten, String nganh) {
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

	@Override
	public String toString() {
		return  ma + " " + ten + " " + nganh ;
	}

	@Override
	public int compareTo(gvvv o) {
		// TODO Auto-generated method stub
		return tn.compareTo(o.tn);
	}
	
	
	
}
