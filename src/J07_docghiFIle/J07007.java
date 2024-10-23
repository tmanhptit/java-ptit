package J07_docghiFIle;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.io.File;
public class J07007 {
	public static void main(String[] args) throws IOException {
        //WordSet ws = new WordSet("VANBAN.in");
        System.out.println(ws);
    }
}
//class WordSet{
	private Set<String>set;

	

	public WordSet(Set<String> set) {
		//super();
		this.set = set;
	}
	public WordSet(String pathFile) throws FileNotFoundException {
		Scanner sc=new Scanner(new File(pathFile));
		Set<String>set=new TreeSet<>();
		while(sc.hasNext()) {
			String word=sc.next();
			set.add(word.toLowerCase());
		}
		this.set=set;
	}

	@Override
	public String toString() {
	    StringBuilder kq=new StringBuilder();
	    for (String string : set) {
			kq.append(string).append("\n");
			
		}
	    return kq.toString();
	}
	
}
