class StringApp 
{
	public static void main(String[] args) 
	{
		String s="RajaRamMoahanRoy";
		String c=" is father of bengal ";
		
		System.out.println(s.length());
		System.out.println(s.charAt(6));
		System.out.println(s.indexOf('R'));
		System.out.println(s.lastIndexOf('R'));
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println(s.contains("Ram"));
		System.out.println(s.isEmpty());
		System.out.println(s.concat (c));
	}
}
