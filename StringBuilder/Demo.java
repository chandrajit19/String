class Demo 
{
	public static void main(String[] args) 
	{
        StringBuilder s=new StringBuilder();
		s.append("sachin");
		s.append(" is a great batman ");
		s.insert(2, "good");
		s.delete(0, 7);// deleted 0 to 7 charecter from the string
        System.out.println("capacity of charecter occupied = "+s.capacity());
		System.out.println("length of charecters = "+s.length());
		System.out.println(s.toString()); // it will print " sachin is a great batman"
	}
}
