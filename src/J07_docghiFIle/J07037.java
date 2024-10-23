package J07_docghiFIle;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class J07037 {
public static void main(String[] args) throws IOException {
	ds_doanhnghiep ds=new ds_doanhnghiep();
	String path="C:\\Users\\ADMIN\\eclipse-workspace\\CODETIT\\src\\GhiDocFIle\\SV.in.txt";
	try (BufferedReader br= new BufferedReader(new FileReader(path))){
		br.readLine();
		String line;
		while((line=br.readLine())!=null) 
		{
			//System.out.println(line);
			String ma=line;
			//System.out.println("ma: "+ma);
			String ten=br.readLine();
			//System.out.println("ten: "+ten);
			int tin=Integer.parseInt(br.readLine());
			//System.out.println(tin);
			
		
			//System.out.println("monnn: "+ma+ten+tin);
			doanhnghiep e=new doanhnghiep(ma, ten, tin);
			ds.themmon(e);
		}
		
	} catch (Exception e) {
		// TODO: handle exception
	}
	//System.out.println("danhsach: ");
	ds.sapxep();
	ds.indanhsach();
}
}
class doanhnghiep{
	private static final int NULL = 0;
	private String ma,ten;
	private int tin;
	public doanhnghiep(String ma, String ten, int tin) {
		super();
		this.ma = ma;
		this.ten = ten;
		this.tin=tin;
		
	}
	public String getMa() {
		return ma;
	}
	public void setMa(String ma) {
		this.ma = ma;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public int getTin() {
		return tin;
	}
	public void setTin(int tin) {
		this.tin = tin;
	}
	@Override
	public String toString() {
		return  ma + " " + ten + " " +tin;
	}
	
	
	
}
class ds_doanhnghiep{
	private ArrayList<doanhnghiep> ds;

	public ArrayList<doanhnghiep> getDs() {
		return ds;
	}

	public void setDs(ArrayList<doanhnghiep> ds) {
		this.ds = ds;
	}

	public ds_doanhnghiep(ArrayList<doanhnghiep> ds) {
		super();
		this.ds = ds;
	}
	public ds_doanhnghiep() {
		super();
		this.ds = new ArrayList<>();
	}
	public void themmon(doanhnghiep e) {
		this.ds.add(e);
	}
	public void indanhsach() {
		for (doanhnghiep doanhnghiep : ds) {
			System.out.println(doanhnghiep);
		}
	}
	public void sapxep(){
		Collections.sort(this.ds,new Comparator<doanhnghiep>() {

			@Override
			public int compare(doanhnghiep o1, doanhnghiep o2) {
				if(o1.getMa().charAt(0)>o2.getMa().charAt(0)) return 1;
				else if(o1.getMa().charAt(0)<o2.getMa().charAt(0)) return -1;
				else return 0;
			}
		});
	}
}
