class TestDoWhile 
{
	public static void main(String[] args) 
	{
		int num = 0;
		int current = 1;
		do{
			num += current;
			current++;
		}while (current <= 100);
		System.out.println(num);
	}
}
