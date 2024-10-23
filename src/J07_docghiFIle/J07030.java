package J07_docghiFIle;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class J07030 {
	public static boolean check(String s) {
		int n=s.length();
		if(n%2==0 ||n<2) return false;
		
		for(int i=0;i<n/2+1;i++) {
			if(s.charAt(i)!=s.charAt(n-1-i) || (int) s.charAt(i)%2==0) return false;
		}
		
		return true;
	}
public static void main(String[] args)throws IOException, ClassNotFoundException {
	ObjectInputStream d1=new ObjectInputStream(new FileInputStream("DATA1.in"));
	ObjectInputStream d2=new ObjectInputStream(new FileInputStream("DATA2.in"));
	ArrayList<Integer> ds1=(ArrayList<Integer>) d1.readObject();
	ArrayList<Integer> ds2=(ArrayList<Integer>) d2.readObject();
    Set<Integer> set=new TreeSet<>();
    for (Integer i : ds1) {
		if(check(i+"")&&ds2.contains(i)) set.add(i);
	}
    int dem=0;
    for (Integer i : set) {
		dem++;
		System.out.println(i+" "+nan(ds1,i)+nan(ds2,i));
		if(dem==10) break;
	}
    
	
}
private static int nan(ArrayList<Integer> ds, int u) {
	 int count = 0;
     for (int i : ds) {
         if (i == u) {
             count++;
         }
     }
     return count;
}
}
