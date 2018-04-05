class Emp
{
	private int empno;			//��Ա���
	private String ename;		//��Ա����
	private String job;			//��Աְλ
	private double sal;			//��������
	private double comm;		//Ӷ��
	
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
		return  "��Ա��ţ�" + this.empno + "\n" + 
				"��Ա������" + this.ename + "\n" + 
				"��Աְλ��" + this.job + "\n" + 
				"���ʣ�" + this.sal + "\n" + 
				"Ӷ��" + this.comm;
	}
	
}
