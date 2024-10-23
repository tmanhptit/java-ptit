package Execir;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collections;

public class J07029 {
public static void main(String[] args) throws  IOException, ClassNotFoundException {
	ObjectInputStream d1=new ObjectInputStream(new FileInputStream("DATA.in"));
	ArrayList<Integer> ls=(ArrayList<Integer>) d1.readObject();
	Collections.sort(ls);
	ArrayList<Integer> he=new ArrayList<Integer>();
	int n=1000000;
	int[] sang=new int[n];
	sang[0]=sang[1]=1;
	for(int i=2;i<1000;i++) {
		if(sang[i]==0) {
			for(int j=i*i;j<n;j+=i) sang[j]=1;
		}
	}
	int[] xh=new int[n];
	for(int i=ls.size()-1;i>0;i--) {
		if(sang[ls.get(i)]==0) {
			if(xh[ls.get(i)]==0) he.add(ls.get(i));
			xh[ls.get(i)]++;
		}
	}
	int dem=0;
	for (int i : he) {
		dem++;
		System.out.println(i+" "+xh[i]);
		if(dem==10) break;
	}
	
	
}
}
