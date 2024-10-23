package J05_array_object;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J05011 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	ArrayList<ngaygio> ds=new ArrayList<>();
	sc.nextLine();
	while(n-->0) {
		String ma=sc.nextLine();
		String ten=sc.nextLine();
		String vao=sc.nextLine();
		String ra=sc.nextLine();
		ngaygio e=new ngaygio(ma, ten, vao, ra);
		ds.add(e);
	}
	Collections.sort(ds);
	for (ngaygio ngaygio : ds) {
		System.out.println(ngaygio);
	}
}
}
class ngaygio implements Comparable<ngaygio>{
	private String ma,ten,inh,outh;
    private int tong;
    private String hihi;
	public ngaygio(String ma, String ten, String inh, String outh) {
		super();
		this.ma = ma;
		this.ten = ten;
		this.inh = inh;
		this.outh = outh;
        int giovao=Integer.parseInt(inh.substring(0, 2));
        int phutvao=Integer.parseInt(inh.substring(3, 5));
        int giora=Integer.parseInt(outh.substring(0, 2));
        int phutra=Integer.parseInt(outh.substring(3, 5));
        this.tong=giora*60+phutra-giovao*60-phutvao;
        int phut;
        int gio;
        if(phutra<phutvao) {
        	phut=60-phutvao;
        	gio=giora-1-giovao;
        }else {
        	gio=giora-giovao;
        	phut=phutra-phutvao;
        }
        this.hihi=gio+" gio "+phut+" phut";
	}
	@Override
	public String toString() {
		return  ma + " " + ten + " " + hihi ;
	}
	@Override
	public int compareTo(ngaygio o) {
		// TODO Auto-generated method stub
		return Integer.compare(o.tong, this.tong);
	}
	
}
