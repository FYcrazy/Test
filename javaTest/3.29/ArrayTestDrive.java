class  ArrayTestDrive
{
	public static void main(String[] args) 
	{
		Array array = new Array(3);
		array.add(31);
		array.add(25);
		array.add(472);
		int[] date = array.getDate();
		for(int x = 0; x < date.length; x++){
			System.out.print(date[x] + ",");
		}
		System.out.println();
		array.addSize(2);
		array.add(54);
		array.add(132);
		array.add(546);
		date = array.getDate();
		for(int x = 0; x < date.length; x++){
			System.out.print(date[x] + ",");
		}
		System.out.println();
		SortArray sa = new SortArray(5);
		sa.add(7);
		sa.add(25);
		sa.add(84);
		sa.add(54);
		sa.add(2);
		print(sa.getDate());

		ReverseArray ra = new ReverseArray(5);
		ra.add(7);
		ra.add(25);
		ra.add(84);
		ra.add(54);
		ra.add(2);
		print(ra.getDate());
	}

	public static void print(int[] date){
		for(int x = 0; x < date.length; x++){
			System.out.print(date[x] + ",");
		}
		System.out.println();
	}
}
