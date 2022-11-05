import java.util.Scanner;

public class ReverseVIARecursion {
	public static void reverse(String str, int indxx) {
		if(indxx==0) {
			System.out.print(str.charAt(indxx));
			return;
		}
		System.out.print(str.charAt(indxx));
		reverse(str,indxx-1);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter string");
Scanner sc= new Scanner(System.in);
String str=sc.nextLine();
reverse(str, str.length()-1);


	}

}
