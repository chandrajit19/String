import java.util.*;
class Demo
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enetr first string = " );
		String s1=s.next();
		System.out.print("Enter second string = ");
		String s2=s.next();

		if(s1.equalsIgnoreCase(s2))
		{
			System.out.println("both strins are equal");
		}
		else
		{
			System.out.println("both strins are not equal");
		}


	}
}
