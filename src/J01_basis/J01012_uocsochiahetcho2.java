import java.util.Scanner;

public class code15 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	while(t-->0) {
		long n=sc.nextLong();
		int dem=0;
	    for(int i=1;i<Math.sqrt(n);i++) {
	    	if(n%i==0) {
	    		if(i%2==0)dem++;
	    		if((n/i)%2==0)dem++;
	    	}
	    }
	    if(Math.pow((int)Math.sqrt(n), 2)==n&&(int)Math.sqrt(n)%2==0)dem++;
	    System.out.println(dem);
	}
}
}
package J01_basis;

public class J01012_uocsochiahetcho2 {

}
