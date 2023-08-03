// string program 1
class StringDemo 
{
	public static void main(String[] args) 
	{
		String s1="riya";
		String s2="riya";
		String s3="chand";
		if(s1.equals(s2)) // or if(s1==s2)  here strings are pointing to same refrence
		{
			System.out.println("both strings are same");
		}
		else
		{
			System.out.println("both strings are not same");
		}
	}
}
