package J02_array;

import java.lang.reflect.Array;
import java.util.Scanner;

public class J02103 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int dem=0;
		while (t-- > 0) {
			dem++;
        int n=sc.nextInt();
        int m=sc.nextInt();
        Integer[][] arr=new Integer[n][m];
        Integer[][]arr1=new Integer[n][n];
        for(int i=0;i<n;i++) {
        	for(int j=0;j<m;j++) {
        		arr[i][j]=sc.nextInt();
        	}
        }
        
        for(int i=0;i<n;i++) {
        	for(int j=0;j<n;j++) {
        		if(j>=i) {
        		int tong=0;
        		//System.out.println("hang ij "+ i+" "+j+" "+tong);
        		
        		for(int x=0;x<m;x++) {
        			
        			tong=tong+(arr[i][x]*arr[j][x]);
        			//System.out.println("x "+x+" tong "+tong);
        		}
        		//System.out.println(" "+tong);
        		
        		arr1[i][j]=tong;
        		arr1[j][i]=tong;
        		}
        	}
        }
        System.out.println("Test "+dem+":");
        for(int i=0;i<n;i++) {
        	for(int j=0;j<n;j++) {
        		System.out.print(arr1[i][j]+" ");
        		
        	}
        	System.out.println();
        }
        
		}
	}
}
