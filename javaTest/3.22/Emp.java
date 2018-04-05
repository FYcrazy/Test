class Emp
{
	private int empno;			//雇员编号
	private String ename;		//雇员姓名
	private String job;			//雇员职位
	private double sal;			//基本工资
	private double comm;		//佣金
	
	public Emp(){}

	public Emp(int empno, String ename, String job, double sal, double comm){
		this.empno = empno;
		this.ename = ename;
		this.job = job;
		this.sal = sal;
		this.comm = comm;
	}

	public void setEmpno(int empno){
		this.empno = empno;
	}

	public int getEmpno(){
		return this.empno;
	}

	public void setEname(String ename){
		this.ename = ename;
	}

	public String getEname(){
		return this.ename;
	}

	public void setJob(String job){
		this.job = job;
	}

	public String getJob(){
		return this.job;
	}

	public void setSal(double sal){
		this.sal = sal;
	}

	public double getSal(){
		return this.sal;
	}

	public void setComm(double comm){
		this.comm = comm;
	}

	public double getComm(){
		return this.comm;
	}

	public String getInFo(){
		return  "雇员编号：" + this.empno + "\n" + 
				"雇员姓名：" + this.ename + "\n" + 
				"雇员职位：" + this.job + "\n" + 
				"工资：" + this.sal + "\n" + 
				"佣金：" + this.comm;
	}
	
}
