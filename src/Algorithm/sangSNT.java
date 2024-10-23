package Algorithm;

public class sangSNT {
	public static boolean check(String s) {
		int n=s.length();
		if(n%2==0 ||n<2) return false;
		
		for(int i=0;i<n/2+1;i++) {
			if(s.charAt(i)!=s.charAt(n-1-i) || (int) s.charAt(i)%2==0) return false;
		}
		
		return true;
	}
    public static void main(String[] args) {
     int a=979;
     int b=23232;
     System.out.println(check(a+""));
     int n=1000000 ; 
     int[] sang=new int[n];
     for(int i=2;i<1000;i++) {
    	 if(sang[i]==0) {
    		 for(int j=i*i;j<n;j+=i) {
    			 sang[j]=1;
    		 }
    	 }
     }
     int dem=0;
     for(int i=2;i<n;i++) {
    	 if(sang[i]==0) dem++;
     }
     System.out.println(dem);
    }
}