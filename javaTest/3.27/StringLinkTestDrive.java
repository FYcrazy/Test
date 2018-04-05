class StringLinkTestDrive 
{
	public static void main(String[] args) 
	{
		Link sl = new Link("火车头");
		int x = 0;
		while(x < 5){
			sl.add("车厢" + (x + 1));
			x++;
		}
		sl.print();
		
		System.out.println(sl.size());

		System.out.println("数据中是否有车厢3：" + sl.contains("车厢3"));
		System.out.println("数据中是否有车厢8：" + sl.contains("车厢8"));


		System.out.println("3索引的数据为：" + sl.get(3));
		System.out.println("7索引的数据为：" + sl.get(7));
		System.out.println("************************************");
		sl.set(2,"替换后的车厢2");
		sl.set(3,"替换后的车厢3");
		sl.print();
		System.out.println("************************************");
		sl.remove("车厢4");
		sl.print();
		System.out.println("************************************");
		sl.remove("火车头");
		sl.print();
		System.out.println("************************************");
		String[] s = sl.toArray();
		for(int y = 0; y < s.length; y++){
			System.out.println(s[y]);
		}
		sl.clear();
		sl.print();
	}
}
