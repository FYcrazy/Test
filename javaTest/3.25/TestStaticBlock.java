class Book
{
	private String title;
	public Book(){
		System.out.println("[A] Book类的构造方法");
	}

	{
		System.out.println("[B] Book类的构造块");
	}

	static{
		System.out.println("[C] Book类的静态代码块");
	}
	
}

class TestStaticBlock 
{
	public static void main(String[] args) 
	{
		Book b = new Book();
	}
}
