class Dog implements Pet
{
	private String name;
	private int age;

	public Dog(){}

	public Dog(String name, int age){
		this.name = name;
		this.age = age;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return this.name;
	}

	public void setAge(int age){
		this.age = age;
	}

	public int getAge(){
		return  this.age;
	}

	public String toString(){
		return "宠物名字：" + this.name + "\t宠物年龄：" + this.age + "\t种类：狗";
	}

	public boolean equals(Object obj){
		if(obj == null){
			return false;
		}

		if(super.toString() == obj){
			return true;
		}

		if(!(obj instanceof Dog)){
			return false;
		}

		Dog d = (Dog)obj;
		if((d.getName().equals(this.name)) && (d.getAge() == this.age)){
			return true;
		}

		return false;
	}
}
