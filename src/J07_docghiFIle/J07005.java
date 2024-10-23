import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class J07005 {
	public static void main(String[] args) throws IOException {
		DataInputStream sc = new DataInputStream(new FileInputStream("DATA.IN"));

		Map<Integer, Integer> map = new HashMap<>();

		try {
			int value = sc.readInt();
			if (map.containsKey(value)) {
				map.put(value, map.get(value) + 1);
			} else {
				map.put(value, 1);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		Map<Integer, Integer> sortmap = new TreeMap<>(map);
		for (Map.Entry<Integer, Integer> entry : sortmap.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}
}
