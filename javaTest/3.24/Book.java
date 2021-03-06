class Book 
{
	private String name;
	private double price;

	public Book(){}

	public Book(String name, double price){
		this.name = name;
		this.price = price;
	}

	public String getName(){
		return this.name;
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

		if(this.name.equals(b.getName())
			&& this.price == b.getPrice()){
			return true;
		}else{
			return false;
		}
	}
}
