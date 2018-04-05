class Book 
{
	private String title;
	private double price;

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

	public boolean compare(Book b){
		if(b == null){
			return false;
		}

		if(this == b){
			return true;
		}

		if(b.getTitle().equals(this.title)
			&& b.getPrice() == this.price){
			return true;
		}else{
			return false;
		}
		
	}
	
	public String getInFo(){
		return "书名：" + this.title + "\t价格：" + this.price;
	}
}
