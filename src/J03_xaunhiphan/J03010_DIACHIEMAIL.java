package J03_xaunhiphan;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;

public class J03010_DIACHIEMAIL {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		Set<String> set=new TreeSet<>();
		Map<String, Integer> map=new HashMap<>();
		
		//LinkedHashMap<String, Integer> map=new LinkedHashMap<>();
		sc.nextLine();
		while(t-->0) {
			String s=sc.nextLine();
			String rs="";
			Scanner ss=new Scanner(s);
			Vector<String> v=new Vector<>();
			while(ss.hasNext()) {
				v.add(ss.next());
			}
			rs=v.get(v.size()-1).toLowerCase();
			for(int i=0;i<v.size()-1;i++) {
				rs+=v.get(i).substring(0,1).toLowerCase();
			}
			
			//System.out.println(rs+"@ptit.edu.vn");
			if(set.contains(rs)) {
				int stt=map.get(rs)+1;
				map.put(rs, stt);
				System.out.println(rs+stt+"@ptit.edu.vn");
			}
			else {
				System.out.println(rs+"@ptit.edu.vn");
				map.put(rs, 1);
				set.add(rs);
			}
			
			
				
		}
		
	
	}

}
