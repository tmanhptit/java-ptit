package J05_array_object;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J05079 {
public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	ArrayList<hss> ds = new ArrayList<>();
    sc.nextLine();
	while (n-- > 0) {
		
		String ma = sc.nextLine();
		String ten = sc.nextLine();
		String lop = sc.nextLine();
		String gv = sc.nextLine();
		ds.add(new hss(ma, ten, lop, gv));
	}
	int q=sc.nextInt();
	sc.nextLine();
	Collections.sort(ds);
	while(q-->0) {
		String ma=sc.nextLine();
		boolean chek=true;
		for (hss hss : ds) {
			if(chek) {
				if(hss.getTengv().equals(ma)) {
					chek=false;
					System.out.printf("Danh sach cho giang vien %s:\n",hss.getTengv());
				}
			}
			if(hss.getTengv().equals(ma)) {
			System.out.println(hss);
			}
		}
	}
}
}
class hss implements Comparable<hss>{
	private String mamon,tenmon,malop,tengv,tong;

	public hss(String mamon, String tenmon, String malop, String tengv) {
		super();
		this.mamon = mamon;
		this.tenmon = tenmon;
		this.malop = malop;
		this.tengv = tengv;
		this.tong=mamon+malop;
	}

	public String getMamon() {
		return mamon;
	}

	public void setMamon(String mamon) {
		this.mamon = mamon;
	}

	public String getTenmon() {
		return tenmon;
	}

	public void setTenmon(String tenmon) {
		this.tenmon = tenmon;
	}

	public String getMalop() {
		return malop;
	}

	public void setMalop(String malop) {
		this.malop = malop;
	}

	@Override
	public String toString() {
		return mamon+" " + tenmon + " " + malop + "";
	}
	

	public String getTengv() {
		return tengv;
	}

	public void setTengv(String tengv) {
		this.tengv = tengv;
	}

	@Override
	public int compareTo(hss o) {
		// TODO Auto-generated method stub
		return this.tong.compareTo(o.tong);
	}
	
}
/*
4
THCS2D20
Tin hoc co so 2 - D20
03
Nguyen Binh An
CPPD20
Ngon ngu lap trinh C++ - D20
01
Le Van Cong
THCS2D20
Tin hoc co so 2 - D20
02
Nguyen Trung Binh
LTHDTD19
Lap trinh huong doi tuong - D19
01
Nguyen Binh An
1
THCS2D20
*/