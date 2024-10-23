package Mang;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class code29 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	int t=sc.nextInt();
	int dem=1;
	while(t-->0) {
		Map<Integer, Integer> map=new LinkedHashMap<>();
		
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			int x=sc.nextInt();
			if(map.containsKey(x)) {
				map.put(x, map.get(x)+1);
			}else map.put(x, 1);
		}
		System.out.println("Test "+dem+":");
		dem++;
		for(Integer key: map.keySet()) {
			
			System.out.printf("%d xuat hien %d lan\n",key,map.get(key));
		}
	}
}
}
