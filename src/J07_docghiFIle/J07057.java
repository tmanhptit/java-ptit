package J07_docghiFIle;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J07057 {
	public static void main(String[] args) throws IOException {

		String path = "E:\\Code\\Eclip\\eclipse-workspace\\CODETIT\\src\\J07_docghiFIle\\SV.in.txt";
		Scanner sc = new Scanner(new File(path));
		int n = Integer.parseInt(sc.nextLine());
		ArrayList<cailonmemay> ds = new ArrayList<>();
		int dem = 0;
		while (n-- > 0) {
			dem++;
			String ten = sc.nextLine();
			double diem = Double.parseDouble(sc.nextLine());
			String dt = sc.nextLine();
			int kv = Integer.parseInt(sc.nextLine());
			//System.out.println(String.format("%s %.1f %s %d", ten, diem, dt, kv));
			cailonmemay e=new cailonmemay(dem, ten, diem, dt, kv);
			ds.add(e);
		}
		Collections.sort(ds);
		for (cailonmemay cailonmemay : ds) {
			System.out.println(cailonmemay);
		}
	}
}
class cailonmemay implements Comparable<cailonmemay>{
	private String ma, ten, tt;
	private double diem;
	
	public cailonmemay(int ma, String ten,double d, String dt, int kv) {
		this.ma = String.format("TS%02d", ma);
		Scanner sc = new Scanner(ten);
		String tam = "";
		while (sc.hasNext()) {
			String tu = sc.next().toLowerCase();
			tam += tu.substring(0, 1).toUpperCase() + tu.substring(1, tu.length()) + " ";
		}
		this.ten = tam.substring(0, tam.length() - 1);
		
	    double uutien=0.0;
	    if (!dt.equals("Kinh")) uutien = 1.5;
	    
	    if (kv == 1) uutien += 1.5;
		else if (kv == 2) uutien += 1.0;
		
	    this.diem=d+uutien;
	    
	    if(this.diem<20.5) this.tt="Truot";
	    else this.tt="Do";
	    
	}
    
	@Override
	public String toString() {
		return String.format("%s %s %.1f %s", ma,ten,diem,tt);
	}

	@Override
	public int compareTo(cailonmemay o) {
		// TODO Auto-generated method stub
		return Double.compare(o.diem, this.diem);
	}
}
