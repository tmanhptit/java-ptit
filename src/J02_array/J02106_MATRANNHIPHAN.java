package Mang;

import java.util.Scanner;

public class code44__MaTranNhiPhan {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int dem=0;
	for(int i=0;i<n;i++) {
		int demh=0;
		for(int j=0;j<3;j++) {
			int x=sc.nextInt();
			if(x==1) demh++;
			else {
				demh--;
			}
		}
		if(demh>0)dem++;
	}
	System.out.println(dem);
}
}
package J02_array;

public class J02106_MATRANNHIPHAN {

}
