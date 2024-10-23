package J01_basis;

import java.util.Scanner;

public class J01001_hinhchunhat {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        if(cv(x,y)==0) System.out.println("0");
        else System.out.println(cv(x,y) + " " + dt(x,y));
    }
    
    public static int cv(int a,int b) {
        if(a<=0 || b<=0){
            return 0;
        }
        else{
            return((a+b)*2);
        }
    }
    
    public static int dt(int a,int b) {
        if(a<=0 || b<=0){
            return 0;
        }
        else{
            return(a*b);
        }
    }
}
