// American Standard Code for Information Interchange
import java.util.*;
class Ascii 
{
	public static void main(String[] args) 
	{  Scanner s=new Scanner(System.in);
	   System.out.println("Enetr  first string =");
	   String s1=s.nextLine();
	   System.out.println("Enetr  second string =");
	   String s2=s.nextLine();
	   int result=s1.compareTo(s2);
	   System.out.println("Result is = "+result);
	   if(result==0)
		   System.out.println("both strings are same");
	   else if(result>0)
		   System.out.println("s1 come after s2");
	   else
		   System.out.println("s1 come before s2");

	}
}
