package J07_FILE;

public class J07004 {

}package J07_docghiFIle;

import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.io.File;

public class J07004 {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("DATA.in"));
		Map<Integer,Integer> map=new HashMap<>();
		
        while(sc.hasNext()) {
        	int value=sc.nextInt();
        	if(map.containsKey(value)) {
        		map.put(value, map.get(value)+1);
        	}else {
        		map.put(value, 1);
        	}
        }
        Map<Integer,Integer> sortmap=new TreeMap<>(map);
        for (Map.Entry<Integer,Integer> entry : sortmap.entrySet()) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
        
	}
}

