class ReverseArray extends Array 
{
	
	public ReverseArray(int sum){
		super(sum);
	}

	public int[] getDate(){
		int[] date = super.getDate();
		int count = date.length / 2;
		int tail = date.length - 1;
		int temp;
		for(int x = 0; x < count; x++){
			temp = date[x];
			date[x] = date[tail];
			date[tail] = temp;
			tail--;
		}
		return date;
	}
}
