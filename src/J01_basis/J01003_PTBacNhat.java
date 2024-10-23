package J01_basis;

public class J01003_PTBacNhat {
	Scanner sc=new Scanner(System.in);
	float a=sc.nextFloat();
	float b=sc.nextFloat();
	ptbac1(a, b);
	

}
public static void ptbac1(float a,float b) {
	if(a==0) {
		if(b==0) {
			System.out.println("VSN");
		}else System.out.println("VN");
	}else {
		float x=-b/a;
		String formattedX = String.format("%.2f", x);
		System.out.println(formattedX);
	}
}
}
