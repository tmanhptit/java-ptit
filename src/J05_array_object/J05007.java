package J05_array_object;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.*;

public class J05007 {
	/*
	public static void main(String[] args)throws IOException{
		//public static void main(String[] args){
		
		int dem=0;
		ArrayList<occho> ds=new ArrayList<>();
		
		String path="C:\\Users\\ADMIN\\eclipse-workspace\\CODETIT\\src\\\\J07_docghiFIle\\SV.in.txt";
        Scanner in = new Scanner(new File(path));
        int n = Integer.parseInt(in.nextLine());
        while(n-->0){
            dem++;
        	String ten = in.nextLine();
			String xec = in.nextLine();
			String ns = in.nextLine();
			String diachi = in.nextLine();
			String mst = in.nextLine();
			String ngay = in.nextLine();
			occho ngu = new occho(dem,ten, xec, ns, diachi, mst, ngay);
            ds.add(ngu);
           
        }
        */
	public static void main(String[] args) {
		
		int dem=0;
		ArrayList<occho> ds=new ArrayList<>();
        
	    Scanner in=new Scanner(System.in);
	    int n=in.nextInt();in.nextLine();
        while(n-->0){
            dem++;
            
        	String ten = in.nextLine();
			String xec = in.nextLine();
			String ns = in.nextLine();
			String diachi = in.nextLine();
			String mst = in.nextLine();
			String ngay = in.nextLine();
			occho ngu = new occho(dem,ten, xec, ns, diachi, mst, ngay);
            ds.add(ngu);
           
        }
     
       Collections.sort(ds,new Comparator<occho>() {

		@Override
		public int compare(occho o1, occho o2) {
			if(o1.getLon().isAfter(o2.getLon())) return 1;
			else if(o2.getLon().isAfter(o1.getLon())) return -1;
			else return 0;
		}
	});
		for (occho nhanvien : ds) {
			System.out.println(nhanvien);
		}
		
		

	}
}

class occho{
	private String ma,hoten, sex, ns, address, maSothue, dateHopdong;
	private LocalDate lon;
	public occho(int dem,String hoten, String sex, String ns, String address, String maSothue, String dateHopdong) {
		//super();
		if(dem<10) {
			this.ma="0000"+dem;
		}else {
			this.ma="000"+dem;
		}
		this.hoten = hoten;
		this.sex = sex;
		
		// ----------------------------------------------------------------	
		int n = ns.length();
		if (n == 8) {
			this.ns = "0" + ns.substring(0, 2) + "0" + ns.substring(2, 8);
		} else if (n == 9) {
			if (ns.charAt(1) == '/')
				this.ns = "0" + ns.substring(0, 2) + ns.substring(2, 9);
			else
				this.ns = ns.substring(0, 3) + "0" + ns.substring(3, 9);
		} else {
			this.ns = ns;
		}
		//-------------------------------------------------------------------------------------
		String tam =this.ns;
		this.lon=LocalDate.of(Integer.parseInt(tam.substring(6, 10)), Integer.parseInt(tam.substring(3, 5)), Integer.parseInt(tam.substring(0, 2)));
		//----------------------------------------------------------------------
		
		
		this.address = address;
		this.maSothue = maSothue;
//------------------------------------------------------------------
		n = dateHopdong.length();
		if (n == 8) {
			this.dateHopdong = "0" + dateHopdong.substring(0, 2) + "0" + dateHopdong.substring(2, 8);
		} else if (n == 9) {
			if (dateHopdong.charAt(1) == '/')
				this.dateHopdong = "0" + dateHopdong.substring(0, 2) + dateHopdong.substring(2, 9);
			else
				this.dateHopdong = dateHopdong.substring(0, 3) + "0" + dateHopdong.substring(3, 9);
		} else {
			this.dateHopdong = dateHopdong;
		}
	}
	
	public LocalDate getLon() {
		return lon;
	}

	public void setLon(LocalDate lon) {
		this.lon = lon;
	}

	@Override
	public String toString() {
		return ma + " " + hoten + " " + sex + " " + ns + " " + address
				+ " " + maSothue + " " + dateHopdong ;
	}

	
	
	
}
