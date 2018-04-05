class Emp 
{
	private int empno;
	private String ename;
	private double sal;
	private String dept;

	public Emp(){
		this(0,"无名",0.0,"未定");
	}

	public Emp(int empno){
		this(empno,"临时工",800.0);
	}

	public Emp(int empno, String ename){
		this(empno, ename, 2000.0, "技术部");
	}

	public Emp(int empno, String ename, double sal, String dept){
		this.empno = empno;
		this.ename = ename;
		this.sal = sal;
		this.dept = dept;
	}

	public String getInFo(){
		return	"编号:" + this.empno + "\n" +
				"姓名:" + this.ename + "\n" +
				"工资:" + this.sal + "\n" + 
				"部门:" + this.dept;
	}
}
