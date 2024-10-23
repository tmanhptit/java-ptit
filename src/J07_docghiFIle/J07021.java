package J07_docghiFIle;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class J07021 {
	public static void main(String[] args) throws FileNotFoundException {
	    String filePath = "C:\\Users\\ADMIN\\eclipse-workspace\\CODETIT\\src\\J07_docghiFIle\\SV.in.txt";
	    try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
	        String line;
	        while ((line = br.readLine()) != null&&!line.equals("END")) {
	            Scanner sc=new Scanner(line);
	            while(sc.hasNext()) {
	            	String word=sc.next().toLowerCase();
	            	
	            	System.out.print(word.substring(0,1).toUpperCase()+word.substring(1,word.length())+" ");
	            }
	            System.out.println();
	        }
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	}
	
}
