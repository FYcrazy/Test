/*
	雇员
	字段：雇员编号，姓名，职位，工资，佣金，领导编号，部门编号
*/
class Emp 
{
	private int empno;		//雇员编号
	private String ename;	//姓名
	private String job;		//职位
	private double sal;		//工资
	private double comm;	//佣金
	private Department dept;//所属部门
	private Emp mgr;		//领导

	public Emp(){}

	public Emp(int empno, String name, String job, double sal, double comm){
		this(empno,name,job,sal,comm,null,null);
	}

	public Emp(int empno, String ename, String job, double sal, double comm, Department dept, Emp mgr){
		this.empno = empno;
		this.ename = ename;
		this.job = job;
		this.sal = sal;
		this.comm = comm;
		this.dept = dept;
		this.mgr = mgr;
	}

	public void setEmpno(){
		this.empno = empno;
	}

	public int getEmpno(){
		return empno;
	}

	public void setEname(){
		this.ename = ename;
	}

	public String getEname(){
		return this.ename;
	}

	public void setJob(){
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

	public void setDepartment(Department dept){
		this.dept = dept;
	}

	public Department getDepartment(){
		return this.dept;
	}

	public void setMgr(Emp mgr){
		this.mgr = mgr;
	}

	public Emp getMgr(){
		return this.mgr;
	}

	public String getInFo(){
		String info =	"员工编号：" + this.empno + "\t" +
						"姓名：" + this.ename + "\t" +
						"职位：" + this.job + "\t" +
						"工资：" + this.sal + "\t" +
						"佣金：" + this.comm + "\t";
		if(this.getDepartment() != null){
			info += "部门编号：" + this.getDepartment().getDepno() + "\t";
		}else{
			info += "部门编号：暂无";
		}

		if(this.getMgr() != null){
			info += "领导姓名：" + this.getMgr().getEname() + "\t";
		}else{
			info += "领导姓名：暂无";
		}
		info += "\n";
		return info;
	}

}
