class TestWhile 
{
	public static void main(String[] args) 
	{
		int num = 0;
		int current = 1;
		while(current <= 100){
			num += current;
			current++;
		}
		System.out.println(num);
	}
}
