class Book
{
	private String title;
	public Book(){
		System.out.println("[A] Book��Ĺ��췽��");
	}

	{
		System.out.println("[B] Book��Ĺ����");
	}

	static{
		System.out.println("[C] Book��ľ�̬�����");
	}
	
}

class TestStaticBlock 
{
	public static void main(String[] args) 
	{
		Book b = new Book();
	}
}