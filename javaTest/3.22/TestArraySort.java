class TestArraySort 
{
	public static void main(String[] args) 
	{
		int[] date = new int[]{4,3,6,2,8,5,9,7,1};
		change(date);
		print(date);

	}

	public static void change(int[] temp){
		int t;
		for(int x = 0;x < temp.length - 1; x++){
			for(int y = x + 1; y < temp.length; y++ ){
					t = temp[x];
					temp[x] = temp[y];
					temp[y] = t;
			}
		}
	}

	public static void print(int[] temp){
		for(int x = 0; x < temp.length; x++){
			System.out.print(temp[x] + ",");
		}
	}
}
