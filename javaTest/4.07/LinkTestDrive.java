class LinkTestDrive 
{
	public static void main(String[] args) 
	{
		int x = 10;
		String s = "啦啦啦";
		boolean bo = true;
		Book b = new Book("小说", 10.0);

		Link link = new Link();
		link.add(x);
		link.add(s);
		link.add(bo);
		link.add(b);

		Object[] objs = link.toArray();
		print(objs);
		
		System.out.println("---------------------------------------------------");

		link.remove("啦啦啦");
		objs = link.toArray();
		print(objs);

	}

	public static void print(Object[] objs){
		for(int x = 0; x < objs.length; x++){
			System.out.println(objs[x]);
		}
	}
}
