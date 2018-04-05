class TestReturnMethod 
{
	public static void main(String[] args) 
	{
		set(20);
		set(5);
		set(3);
		set(75);
	}

	public static void set(int x){
		if(x == 3){
			return;
		}
		System.out.println("x = " + x);
	}
}
