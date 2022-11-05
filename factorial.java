
public class factorial {
//factorial
	//using recursion
	public static int factorial(int n) {
		if(n==0||n==1) {
			return 1;
			}
		int f=factorial(n-1);
		int a=f*n;
		return a;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5 ;
		int ans =	factorial(n);
		System.out.println(ans);
	}
	
}
		
	
		
		
		
		
