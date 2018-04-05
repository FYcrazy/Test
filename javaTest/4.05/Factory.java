class Factory 
{
	public Fruit getInstance(String className){
		if(className.equals("apple")){
			return new Apple();
		}else if(className.equals("orange")){
			return new Orange();
		}else{
			return null;
		}
	}
}
