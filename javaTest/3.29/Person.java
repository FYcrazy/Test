class Person 
{
	private String name;
	private int age;

	public Person(){
		System.out.println("������޲ι��췽��");
	}

	public Person(String name, int age){
		System.out.println("����Ķ�ι��췽��");
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
		System.out.println("�����fun����");
	}

	public void Method(Person p){
		p.name = "�޸�";
	}

	public String getInFo(){
		return "������" + this.name + "\t���䣺" + this.age;
	}
}
