class LinkTestDrive 
{
	public static void main(String[] args) 
	{
		Book b1 = new Book("�鼮1", 30.0);
		Book b2 = new Book("�鼮2", 35.0);
		Book b3 = new Book("�鼮3", 34.0);
		Book b4 = new Book("�鼮4", 50.0);
		
		Link link = new Link();
		link.add(b1);
		link.add(b2);
		link.add(b3);
		link.add(b4);

		link.print();
		System.out.println(link.size());
		System.out.println(link.get(3).getInFo());
		
		System.out.println("link�Ƿ�Ϊ�գ�" + link.isEmpty());
		Link l = new Link();
		System.out.println("l�Ƿ�Ϊ�գ�" + l.isEmpty());
	
		Book b5 = new Book("�鼮8", 30.0);
		Book b6 = new Book("�鼮3", 34.0);
		System.out.println("b5�Ƿ���ڣ�" + link.contains(b5));
		System.out.println("b6�Ƿ���ڣ�" + link.contains(b6));
		
		System.out.println("******************************************");
		link.set(1,b5);
		link.print();
		
		System.out.println("******************************************");
		Book b7 = new Book("�鼮1", 30.0);
		Book b8 = new Book("�鼮3", 34.0);
		b2 = new Book("�鼮2", 35.0);
		link.remove(b7);
		link.remove(b8);
		link.remove(b2);
		
		link.print();
		System.out.println(link.size());
		
		System.out.println("******************************************");
		link.add(b1);
		link.add(b2);
		link.add(b3);

		Book[] books = link.toArray();
		for(int y = 0; y < books.length; y++){
			System.out.println(books[y].getInFo());
		}
		System.out.println(link.size());

		link.clear();
		System.out.println(link.isEmpty());
		System.out.println(link.size());
	}
}
