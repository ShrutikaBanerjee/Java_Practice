
public class FibonnaciSeries {
// a,b,b+c.......
	public static int fibseries(int a, int b , int i) {
		if(i==a) {
			return 1;
		}
		int c= a+b;
		System.out.println(c);
		//adding up then changing the values 
		return fibseries(b, c ,i);
	   }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
int a = 2;
int b = 3;
int i = 7;
fibseries(a,  b ,  i-2);

	}

}
