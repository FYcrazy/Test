class Student extends Person
{
	private String school;

	public Student(){
		System.out.println("子类的无参构造方法");
	}

	public Student(String name, int age, String school){
		super(name,age);
		System.out.println("子类的多参构造方法");
		this.school = school;
	}

	public void setSchool(String school){
		this.school = school;
	}

	public String getSchool(){
		return this.school;
	}

	public void fun(){
		System.out.println("子类的fun方法");
	}
}
