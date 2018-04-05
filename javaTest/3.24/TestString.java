class TestString 
{
	public static void main(String[] args) 
	{
		String s1 = "Hello";
		String s2 = new String("Hello");

		fun(s1);
		fun(s2);
		System.out.println(s1);
		System.out.println(s2);
	}

	public static void fun(String temp){
		temp = new String("World");
	}
}
