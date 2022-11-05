import java.util.Scanner;

public class printFirstAndLastCharOfString {
// without recursion
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter your string");
		
Scanner sc= new Scanner(System.in);
String str=sc.nextLine();
//for(int i=0; i <=str.length()+1; i++) {
   char f= str.charAt(0);
   int g= str.length()-1;
   char l = str.charAt(g);
   System.out.println("first character=="+ f);
   System.out.println("last character=="+ l);
	
	
 //                                    }
 }
	   }
