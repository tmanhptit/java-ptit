package J05_array_object;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Scanner;
import java.util.Vector;

public class J05082 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	ArrayList<nvvv> ds = new ArrayList<>();
    sc.nextLine();
    int dem=0;
	while (n-- > 0) {
		dem++;
		String ten = sc.nextLine();
		String gt = sc.nextLine();
		String ns = sc.nextLine();
		String dc = sc.nextLine();
		ds.add(new nvvv(dem, ten, gt, ns, dc));
		
	}
	Collections.sort(ds);
	for (nvvv nvvv : ds) {
		System.out.println(nvvv);
	}
}
}
class nvvv implements Comparable<nvvv>{
	private String ma,ten,gt,diachi;
	private Date ns;

	public nvvv(int dem,String ten, String gt, String ns, String diachi) {
		super();
		if(dem<10)this.ma="KH00"+dem;
		else this.ma="KH0"+dem;
		Scanner ss=new Scanner(ten);
		Vector<String> v=new Vector<String>();
		while(ss.hasNext()) {
			v.add(ss.next().toLowerCase());
		}
		String tam="";
		for (String string : v) {
			tam+=string.substring(0, 1).toUpperCase()+string.substring(1, string.length())+" ";
		}
		this.ten=tam.substring(0, tam.length()-1);
		
		this.gt = gt;
		SimpleDateFormat ds=new SimpleDateFormat("dd/MM/yyyy");
		try {
			this.ns  =ds.parse(ns);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.diachi = diachi;
	}

	@Override
	public String toString() {
		SimpleDateFormat dfs=new SimpleDateFormat("dd/MM/yyyy");
		return ma+" " + ten + " " + gt + " " + diachi + " " + dfs.format(ns) + "";
	}

	@Override
	public int compareTo(nvvv o) {
		// TODO Auto-generated method stub
		return this.ns.compareTo(o.ns);
	}
	
}
/*
2
nGuyen VAN     nAm
Nam
12/1/1997
Mo Lao-Ha Dong-Ha Noi
TRan    vAn     biNh
Nam
1/1/1995
Phung Khoang-Nam Tu Liem-Ha Noi
*/