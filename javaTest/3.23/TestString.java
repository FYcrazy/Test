class  TestString
{
	public static void main(String[] args) 
	{
		String stra = "Hello";
		String strb = new String("Hello");
		String strc = strb;

		System.out.println(stra == strb);
		System.out.println(stra == strc);
		System.out.println(strc == strb);
	}
}
