class Book 
{
	
	private String title = "Thinking in java第二版";

	private double price;

	public Book(){
		System.out.println(this.title);
	}
	
	public Book(String title, double price){
		this.title = title;
		this.price = price;
	}

	public void setTitle(String title){
		this.title = title;
	}

	public String getTitle(){
		return this.title;
	}

	public void setPrice(double price){
		this.price = price;
	}

	public double getPrice(){
		return this.price;
	}

	public String getInFo(){
		return "书名：" + this.title + "\t价格" + this.price;
	}
}
