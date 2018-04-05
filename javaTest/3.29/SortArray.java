class SortArray extends Array 
{
	
	public SortArray(int sum){
		super(sum);
	}

	public int[] getDate(){
		java.util.Arrays.sort(super.getDate());
		return super.getDate();
	}
}
