class FactoryTestDrive 
{
	public static void main(String[] args) 
	{
		Factory f = new Factory();
		Fruit apple = f.getInstance("apple");
		Fruit orange = f.getInstance("orange");
		apple.eat();
		orange.eat();
	}

}
