package J01_basis;

import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class J01025_hinhvuong {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int dx1=sc.nextInt();
	int dy1=sc.nextInt();
	int tx1=sc.nextInt();
	int ty1=sc.nextInt();
	
	int dx2=sc.nextInt();
	int dy2=sc.nextInt();
	int tx2=sc.nextInt();
	int ty2=sc.nextInt();
	
	int maxtrucx=max(tx1,tx2);
	int maxtrucy=max(ty1,ty2);
	int mintrucx=min(dx1,dx2);
	int mintrucy=min(dy1,dy2);
	int canh=max(maxtrucx-mintrucx,maxtrucy-mintrucy);
	System.out.println(canh*canh);
	
}
public static int max(int a,int b) {
	if(a>b)return a;
	
	return b;
}
public static int min(int a,int b) {
	if(a>b) return b;
	
	return a;
}
}
