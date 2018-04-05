class TestAddMethod 
{
	public static void main(String[] args) 
	{
		int num1 = 7;
		int num2 = 8;
		int num3 = add(num1,num2);
		System.out.println(num3);
	}

	public static int add(int num1, int num2){
		return num1 + num2;
	}
}
