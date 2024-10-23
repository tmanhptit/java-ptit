package J07_docghiFIle;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class J07022 {
public static void main(String[] args) {
	 List<String> set = new ArrayList<>();
	String pathFile="C:\\Users\\ADMIN\\eclipse-workspace\\CODETIT\\src\\GhiDocFIle\\SV.in.txt";
	String filePath = "C:\\Users\\ADMIN\\eclipse-workspace\\CODETIT\\src\\GhiDocFIle\\SV.in.txt";
	try (BufferedReader br=new BufferedReader(new FileReader(filePath))){
		String line;
		while((line=br.readLine())!=null) {
			Scanner sc=new Scanner(line);
			while(sc.hasNext()) {
			String word=sc.next();
			if(!isInteger(word)) {
				set.add(word);
			}
			}
		}
	} catch (Exception e) {
		// TODO: handle exception
	}
	//System.out.println(set.size());
	Collections.sort(set);
	for (String string : set) {
		System.out.print(string+" ");
	}
}
private static boolean isInteger(String s) {
    try {
        Integer.parseInt(s);
        return true;
    } catch (NumberFormatException e) {
        return false;
    }
}
}
