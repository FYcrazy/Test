class TestBook 
{
	public static void main(String[] args) 
	{
		Book b1 = new Book("1",2.0);
		Book b2 = new Book("1",2.0);
		Book b3 = new Book("Head First java", 42.5);

		System.out.println(b1.compare(b2));
//		System.out.println(b1.getName().equals(b2.getName()) && b1.getPrice() == b2.getPrice());
//		System.out.println((b2 == null));
//		System.out.println(b1 == b2);

		System.out.println(b1.compare(b3));
	}
}
