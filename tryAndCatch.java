
public class tryAndCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=2;
		int b=0;
		//checking if we can do it 
		try {
			int c =a/b;
			System.out.println(c);
		}
		//if unable to do it the just do this shit
		catch(Exception e) {
			System.out.println("we failed"+e);
			
		}
		System.out.println("end of program");

	}

}
