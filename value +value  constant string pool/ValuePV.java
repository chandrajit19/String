// value + value ---> constant string pool
class ValuePV 
{
	public static void main(String[] args) 
	{
		String s1="naj" + "riya" ;
		String s2="najriya" ;
		if(s1==s2)
		System.out.println(" s1 and s2 pointing same object ");
		else
		System.out.println(" s1 and s2 are not pointing same object ");

	}
}
