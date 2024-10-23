package J07_docghiFIle;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collections;

public class J07015 {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		ObjectInputStream sc = new ObjectInputStream(new FileInputStream("SONGUYEN.in"));
		ArrayList<Integer> ds = (ArrayList<Integer>) sc.readObject();
		ArrayList<Integer> list = new ArrayList<Integer>();
		int n = 1000000;
		int[] sang = new int[n];
		for (int i = 2; i < 1000; i++) {
			if (sang[i] == 0) {
				for (int j = i * i; j < n; j += i) {
					sang[j] = 1;
				}
			}
		}

		int[] xh = new int[n];
		for (int i : ds) {
			if (sang[i] == 0) {
				if (xh[i] == 0)
					list.add(i);

				xh[i]++;
			}
		}
		Collections.sort(list, Collections.reverseOrder());
		for (int i = 0; i < 10; i++) {
			System.out.println(list.get(i) + " " + xh[list.get(i)]);
		}

	}
}
