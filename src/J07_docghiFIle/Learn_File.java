package J07_docghiFIle;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
public class Learn_File {

	public static void main(String[] args) throws IOException {
	   String path="C:\\Users\\ADMIN\\eclipse-workspace\\CODETIT\\src\\J07_docghiFIle\\SV.in.txt";
       Scanner in =new Scanner(new File(path));
       ArrayList<hih> ds=new ArrayList<>();
       while(in.hasNext()) {
    	   String dong=in.nextLine();
    	   //System.out.println("Nhanvien "+dong);
    	   //String ma=dong.substring(0,4);
    	   Scanner haha=new Scanner(dong);
    	   while(haha.hasNext()) {
    		   int ma=haha.nextInt();
    		   String ten=haha.next();
    		   double tong=0;
    		   int dem=0;
    		   while(haha.hasNext()) {
    			   double d=haha.nextDouble();
    			   dem++;
    			   tong+=d;
    		   }
    		   double tong1 = Math.round(tong * 10.0) / 10.0;
    		   double tb=Math.round(tong/dem*10.0)/10.0;
    		   hih e=new hih(ma, ten, tong1, tb);
    		   ds.add(e);
    	   }
    	   
		}
       for (hih hih : ds) {
			System.out.println(hih);
       }
    }
}
class hih{
	private String ten;
	private int ma;
	private double gio, trungbinh;
	public hih(int ma, String ten, double gio, double trungbinh) {
		super();
		this.ma = ma;
		this.ten = ten;
		this.gio = gio;
		this.trungbinh = trungbinh;
	}
	@Override
	public String toString() {
		return ten+" (ID#" + ma + ") worked "+gio+" hours ("+trungbinh+" hours/day)";
	}
	
}