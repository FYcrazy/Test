class StudentTestDrive 
{
	public static void main(String[] args) 
	{
		Student student = new Student("张三", 25, "XX大学");
		Person p = new Person("李四",25);
		p.fun();
		student.fun();

		Person p1 = new Person("王五",30);
		p.Method(p);
		System.out.println(p.getInFo());
	}
}
