class TestArrayReverse 
{
	public static void main(String[] args) 
	{
		int[] date = new int[]{1,2,3,4,5,6,7,8,9};
		reverse(date);
		print(date);
	}

	public static void reverse(int[] temp){
		int t;
		int y = temp.length - 1;
		for(int x = 0; x < (temp.length /2); x++){
			if(temp[x] < temp[y]){
				t = temp[x];
				temp[x] = temp[y];
				temp[y] = t;
				y--;
			}
		}
	}

	public static void print(int[] temp){
		for(int x = 0; x < temp.length; x++){
			System.out.print(temp[x] + ",");
		}
	}
}
