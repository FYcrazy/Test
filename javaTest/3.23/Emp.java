class Emp 
{
	private int empno;
	private String ename;
	private double sal;
	private String dept;

	public Emp(){
		this(0,"����",0.0,"δ��");
	}

	public Emp(int empno){
		this(empno,"��ʱ��",800.0);
	}

	public Emp(int empno, String ename){
		this(empno, ename, 2000.0, "������");
	}

	public Emp(int empno, String ename, double sal, String dept){
		this.empno = empno;
		this.ename = ename;
		this.sal = sal;
		this.dept = dept;
	}

	public String getInFo(){
		return	"���:" + this.empno + "\n" +
				"����:" + this.ename + "\n" +
				"����:" + this.sal + "\n" + 
				"����:" + this.dept;
	}
}
