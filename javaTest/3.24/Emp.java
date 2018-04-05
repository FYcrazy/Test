/*
	��Ա
	�ֶΣ���Ա��ţ�������ְλ�����ʣ�Ӷ���쵼��ţ����ű��
*/
class Emp 
{
	private int empno;		//��Ա���
	private String ename;	//����
	private String job;		//ְλ
	private double sal;		//����
	private double comm;	//Ӷ��
	private Department dept;//��������
	private Emp mgr;		//�쵼

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
		String info =	"Ա����ţ�" + this.empno + "\t" +
						"������" + this.ename + "\t" +
						"ְλ��" + this.job + "\t" +
						"���ʣ�" + this.sal + "\t" +
						"Ӷ��" + this.comm + "\t";
		if(this.getDepartment() != null){
			info += "���ű�ţ�" + this.getDepartment().getDepno() + "\t";
		}else{
			info += "���ű�ţ�����";
		}

		if(this.getMgr() != null){
			info += "�쵼������" + this.getMgr().getEname() + "\t";
		}else{
			info += "�쵼����������";
		}
		info += "\n";
		return info;
	}

}