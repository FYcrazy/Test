class Book 
{
	private String title;
	private double price;

	public Book(String title, double price){
		this.title = title;
		this.price = price;
	}

	public void fun(){
		System.out.println(this);
		System.out.println(super.toString());
	}

	public void setTitle(String title){
		this.title = title;
	}

	public String getTitle(){
		return this.title;
	}

	public void setPrice(double price){
		this.title = price;
	}

	public double getPrice(){
		return this.price;
	}

	public boolean equals(Object obj){
		if(obj == null){
			return false;
		}

		if(super.toString == obj){
			return true;
		}
		
		if(!(obj instanceof Book)){
			return false;
		}

		if(Book.getTitle().equals(this.title) && (Book.getPrice() == this.price)){
			return true;
		}

		return false;
		
	}

	public String toString(){
		return "书名：" + this.title + "\t价格：" + this.price;
	}
}
