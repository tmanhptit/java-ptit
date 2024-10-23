package J07_FILE;

public class J07003 {

}
package J07_docghiFIle;

import java.io.FileNotFoundException;
import java.math.BigInteger;
//import java.security.DomainCombiner;
import java.util.Scanner;
import java.io.File;

public class code79_tachdoitinhtong {

public static void main(String[] args)throws FileNotFoundException  {
	Scanner sc=new Scanner(new File("DATA.in"));
	BigInteger n=sc.nextBigInteger();
	while(true) {
		String s=n.toString();
		int size=s.length();
		if(size==1) break;
		
		BigInteger s1=new BigInteger(s.substring(0,size/2));
		BigInteger s2=new BigInteger(s.substring(size/2));
		n=s1.add(s2);
		System.out.println(n);
	}
			
}
}