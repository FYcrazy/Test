class TestArray 
{
	public static void main(String[] args) 
	{
		int[] date = new int[3];
		date[0] = 10;
		date[1] = 20;
		date[2] = 30;
		int[] temp = date;
		temp[2] = 99;
		for(int x = 0; x<date.length; x++){
			System.out.print(date[x] + "\t");
		}

		int[] d1 = new int[]{1,2,3,4,5,6,7,8,9};
		for(int x = 0; x < d1.length; x++){
			System.out.print(d1[x] + " ");
		}
	}
}
