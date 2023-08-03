class NonConstantStringPool 
{
	public static void main(String[] args) 
	{
		String s1=new String ("uma");      // here we are  using "new" keyword so memory will be allocated in "non constant string pool"
		String s2=new String ("uma");      // and in non constatnt string pool duplicates are  allowed
		String s3=new String ("chand");    // so here both uma have defferent references like- s1=100 and s2= 200

		if(s1==s2)   // but s1.equals(s2) it compares content not references so if i use this it'll be correct because uma and uma are same
		{
			System.out.println("both references are pointing same object");
		}
		else
			System.out.println("both references are not pointing same object");
	}
}
