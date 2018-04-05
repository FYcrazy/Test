class Person 
{
	private String name;
	private int age;

	public Person(){
		System.out.println("父类的无参构造方法");
	}

	public Person(String name, int age){
		System.out.println("父类的多参构造方法");
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
		return this.age;
	}

	public void fun(){
		System.out.println("父类的fun方法");
	}

	public void Method(Person p){
		p.name = "修改";
	}

	public String getInFo(){
		return "姓名：" + this.name + "\t年龄：" + this.age;
	}
}
