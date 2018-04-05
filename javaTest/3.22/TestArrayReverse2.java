class TestArrayReverse2 
{
	public static void main(String[] args) 
	{
		int[] date = new int[]{1,2,3,4,5,6,7,8,9};
		int[] d = reverse(date);
		print(d);
	}
	
	public static int[] reverse(int[] date){
		int[] temp = new int[date.length];
		int y = 0;
		for(int x = date.length - 1; x >= 0; x--){
			temp[y] = date[x];
			y++;
		}
		return temp;
	}

	public static void print(int[] temp){
		for(int x = 0; x < temp.length; x++){
			System.out.print(temp[x] + ",");
		}
	}
}
