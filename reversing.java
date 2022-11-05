import java.util.Scanner;

public class reversing {
//revesing a string
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter ");
		Scanner sc= new Scanner(System.in);
		String str=sc.next();
		//System.out.println(str);
		//reading all the words 
		for(int i =0; i <=str.length(); i ++) {
			//if we have 4 words then
			//4-->0; 3-->1; 2-->2;1-->3;4-->0
			//it means 
		  int d = str.length()-i-1;
		 char g = str.charAt(d);
		 System.out.print(g);
		}
System.out.println();
	}
}