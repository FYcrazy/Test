class StudentTestDrive 
{
	public static void main(String[] args) 
	{
		Student student = new Student("����", 25, "XX��ѧ");
		Person p = new Person("����",25);
		p.fun();
		student.fun();

		Person p1 = new Person("����",30);
		p.Method(p);
		System.out.println(p.getInFo());
	}
}