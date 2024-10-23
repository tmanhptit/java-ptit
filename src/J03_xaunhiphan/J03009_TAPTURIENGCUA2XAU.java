package J03_xaunhiphan;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class J03009_TAPTURIENGCUA2XAU {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	sc.nextLine();
	while(t-->0) {
		String s1=sc.nextLine();
	    Set<String> set=new HashSet<>();
	    Scanner ss=new Scanner(s1);
	    while(ss.hasNext()) {
	    	String word=ss.next();
	    	set.add(word);
	    }
	    String s2=sc.nextLine();
	    Scanner cuts=new Scanner(s2);
	    while(cuts.hasNext()) {
	    	String word=cuts.next();
	    	if(set.contains(word)) {
	    		set.remove(word);
	    	}
	    }
	    for (String string : set) {
	    	System.out.print(string+" ");
			
		}
	    System.out.println();
	}
}
}
