class Test2
{
	public static void main(String[] args) 
	{
		int x = 1;
		int temp;
		while(x <= 1000){
			temp = Test357.determine(x);
			if(temp != 0){
				System.out.print(temp + "\t");
			}
			x++;
		}
	}
}
