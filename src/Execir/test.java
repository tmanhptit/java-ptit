package Execir;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class test {
	 public static String chenh(String vao,String ra) {
	    	int gio=Integer.parseInt(vao.substring(0,2));
	    	int phut=Integer.parseInt(vao.substring(3,5));
	    	int giora=Integer.parseInt(ra.substring(0,2));
	    	int phutra=Integer.parseInt(ra.substring(3,5));
	        
	    	int ch=(giora-gio)*60+phutra-phut;
	        
	    	int g=ch/60;
	    	int p=ch%60;
	    	return String.format("%d gio %d phut", g,p);
	    }
	 public static int enh(String vao,String ra) {
	    	int gio=Integer.parseInt(vao.substring(0,2));
	    	int phut=Integer.parseInt(vao.substring(3,5));
	    	int giora=Integer.parseInt(ra.substring(0,2));
	    	int phutra=Integer.parseInt(ra.substring(3,5));
	        
	    	int ch=(giora-gio)*60+phutra-phut;
	        
	        return ch;
	    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	
		String a="15:30";
		String b="18:00";
		System.out.println(chenh(a,b)+ " "+ enh(a,b));
	
	}
}

	

/*

*/