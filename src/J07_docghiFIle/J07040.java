package J07_docghiFIle;


import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class J07040 {
	public static void main(String[] args)throws IOException,ClassNotFoundException {
        String path2="E:\\Code\\Eclip\\eclipse-workspace\\CODETIT\\src\\thuchanh\\vanban.in.txt";
        Scanner scc=new Scanner(new File(path2));
        String duongDanFile = "E:\\Code\\Eclip\\eclipse-workspace\\CODETIT\\src\\J07_docghiFIle\\MissYou.txt";
        ObjectInputStream sc=new ObjectInputStream(new FileInputStream(duongDanFile));
        ArrayList<String> list= (ArrayList<String>)sc.readObject();
        
 
        Set<String> s1 = new LinkedHashSet<String>();
        Set<String> s2 = new LinkedHashSet<String>();

        while(scc.hasNext()){
            s1.add(scc.next().toLowerCase());
        }

        for (String i : list) {
        	Scanner doc=new Scanner(i);
        	while(doc.hasNext()) {
        		s2.add(doc.next().toLowerCase());
        	}
        }
        for (String string : s1) {
			if(s2.contains(string)) System.out.println(string);
		}
	}
}