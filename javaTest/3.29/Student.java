class Student extends Person
{
	private String school;

	public Student(){
		System.out.println("������޲ι��췽��");
	}

	public Student(String name, int age, String school){
		super(name,age);
		System.out.println("����Ķ�ι��췽��");
		this.school = school;
	}

	public void setSchool(String school){
		this.school = school;
	}

	public String getSchool(){
		return this.school;
	}

	public void fun(){
		System.out.println("�����fun����");
	}
}