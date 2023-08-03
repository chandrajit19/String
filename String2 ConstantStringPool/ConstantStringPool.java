class ConstantStringPool 
{
	public static void main(String[] args) 
	{
		String s1="uma";      // here we are not using "new" keyword so memory will be allocated in constant string pool
		String s2="uma";      // and in constatnt string pool duplicates are not allowed
		String s3="chand";

		if(s1==s2)
		{
			System.out.println("both references are pointing same object"); // it means there is only one "uma" allocated in constant string pool
		}
		else
			System.out.println("both references are not pointing same object");
	}
}
