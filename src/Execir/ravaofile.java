package Execir;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class ravaofile {
public static void main(String[] args) throws  IOException, ClassNotFoundException {
	ObjectInputStream sc=new ObjectInputStream(new FileInputStream("DATA1.in"));
	ObjectInputStream sc1=new ObjectInputStream(new FileInputStream("DATA2.in"));
	ArrayList<Integer> ds1=(ArrayList<Integer>) sc.readObject();
	ArrayList<Integer> ds2=(ArrayList<Integer>) sc1.readObject();
	
	int n=10000;
	int[] sang=new int[n];
	sang[1]=sang[0]=1;
	
	for(int i=2;i<1000;i++) {
		if(sang[i]==0) {
			for(int j=i*i;j<n;j+=i) {
				sang[j]=1;
			}
		}
	}
	
	int[] xh=new int[n];
	int[] xh2=new int [n];
	for(int i: ds1) {
		if(sang[i]==0&&ds2.contains(i)) {
			xh[i]++;
		}
	}
	for(int i:ds2) {
		if(xh[i]>0) {
			xh2[i]++;
		}
	}
	for(int i=1;i<10000;i++) {
		if(xh[i]>0) System.out.println(i+" "+xh[i]+" "+xh2[i]);
	}
}
}
