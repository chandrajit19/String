import java.util.*;
class StringIO 
{
	public static void main(String[] args) 
	{   Scanner s= new Scanner(System.in);
		System.out.println("Enter your name = ");
		String s1=s.nextLine();
		System.out.println("Enter any other or same name = ");
		String s2=s.nextLine();
		System.out.println("First name is = " +s1);
		System.out.println("second name is = " +s2);
		if(s1.equalsIgnoreCase(s2))
	    System.out.println("both contents are same");
		else
		System.out.println("both contents are not same");


	}
}
