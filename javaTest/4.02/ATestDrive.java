class ATestDrive 
{
	public static void main(String[] args) 
	{
		A a = new B();
		a.fun();
		
		System.out.println(a instanceof A);
		System.out.println(a instanceof B);
	}
}
