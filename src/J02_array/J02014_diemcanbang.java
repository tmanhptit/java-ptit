import java.util.Scanner;

public class code35_DiemCanBang {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-->0) {
			int n = sc.nextInt();
			int[] arr = new int[n+3];
			int sumsau = 0,sumtruoc=0,k=-1;
			for (int i = 0; i <n; i++) {
				arr[i] = sc.nextInt();
				sumsau += arr[i];
			}
			
			for(int i=0;i<n;i++) {
				if(sumtruoc*2+arr[i]==sumsau) {
			        k=i+1;
					break;
				}
				sumtruoc+=arr[i];
			}
			System.out.println(k);
		}
	}
}package J02_array;

public class J02014_diemcanbang {

}
