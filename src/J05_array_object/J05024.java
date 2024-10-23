package J05_array_object;

import java.util.ArrayList;
import java.util.Scanner;

public class J05024{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<sv> ds=new ArrayList<>();
		
		int n=sc.nextInt();
		sc.nextLine();
		int dem=0;
		while(n-->0) {
			ds.add(new sv(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine()));
		}
	    n=sc.nextInt();
	    sc.nextLine();
	    while(n-->0) {
	    	String lop=sc.nextLine().toUpperCase();
	    	System.out.println("DANH SACH SINH VIEN NGANH "+lop+":");
	    	for (sv sv : ds) {
				if(sv.getNganh().equals(lop)) System.out.println(sv);
			}
	    }
	}
}
class sv{
	private String ma,ten,lop,email,nganh;

	public sv(String ma, String ten, String lop, String email) {
		super();
		this.ma = ma;
		String tam=ma.substring(3,7).toUpperCase();
		if(tam.equals("DCCN")) {
			if(lop.charAt(0)!='E') this.nganh="CONG NGHE THONG TIN";
			else this.nganh="CLC";
		}
		else if(tam.equals("DCAT")) {
			if(lop.charAt(0)!='E') this.nganh="AN TOAN THONG TIN";
			else this.nganh="CLC";
		}
		else if(tam.equals("DCDT")) this.nganh="DIEN TU";
		else if(tam.equals("DCVT")) this.nganh="VIEN THONG";
		else if(tam.equals("DCKT")) this.nganh="KE TOAN";
		

		this.ten = ten;
		this.lop = lop;
		this.email = email;
	}

	public String getNganh() {
		return nganh;
	}

	public void setNganh(String nganh) {
		this.nganh = nganh;
	}

	@Override
	public String toString() {
		return ma + " " + ten + " " + lop + " " + email ;
	}
}
/*
6
B16DCCN011
Nguyen Trong Duc Anh
D16CNPM1
sv1@stu.ptit.edu.vn
B21DCAT127
TRAN TRONG MANH
E21AT03
SV2@gmail.com
B21DCVT121
NGUYEN NGOC HIEU
E33KSDFD
SV@GAMIL.COM
B15DCCN215
To Ngoc Hieu
D15CNPM3
sv2@stu.ptit.edu.vn
B15DCKT150
Nguyen Ngoc Son
D15CQKT02-B
sv3@stu.ptit.edu.vn
B15DCKT199
Nguyen Trong Tung
D15CQKT02-B
sv4@stu.ptit.edu.vn
*/