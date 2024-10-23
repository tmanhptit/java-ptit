package J07_docghiFIle;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class lay {
public static void main(String[] args)throws IOException,ClassNotFoundException {
	String path="E:\\Code\\Eclip\\eclipse-workspace\\CODETIT\\src\\J07_docghiFIle\\MissYou.txt";
	ObjectInputStream sc = new ObjectInputStream(new FileInputStream(path));
	ArrayList<String> list= (ArrayList<String>) sc.readObject();
		
	for (String string : list) {
			System.out.println(string);
		}
	
}
}
