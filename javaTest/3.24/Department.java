/*
	����
		�ֶΣ����ű�ţ��������ƣ�����λ�ã�Ա��
*/
class  Department
{
	private int depno;		//���ű��
	private String dname;	//��������
	private String loc;		//����λ��
	private Emp[] emps;		//Ա��

	public Department(){}

	public Department(int depno, String dname, String loc){
		this(depno,dname,loc,null);
	}

	public Department(int depno, String dname, String loc, Emp[] emps){
		this.depno = depno;
		this.dname = dname;
		this.loc = loc;
		this.emps = emps;
	}

	public void setDepno(int depno){
		this.depno = depno;
	}

	public int getDepno(){
		return this.depno;
	}

	public void setDname(String dname){
		this.dname = dname;
	}

	public String getDname(){
		return this.dname;
	}

	public void setLoc(String loc){
		this.loc = loc;
	}

	public String getLoc(){
		return this.loc;
	}

	public void setEmps(Emp[] emps){
		this.emps = emps;
	}

	public Emp[] getEmps(){
		return this.emps;
	}

	public String getInFo(){
		String info =	"���ű�ţ�" + this.depno + "\t" +
						"�������ƣ�" + this.dname + "\t" +
						"����λ�ã�" + this.loc + "\t";
		if(this.emps.length > 0){
			for(int x = 0; x < emps.length; x++){
				info += "\n";
				info += this.emps[x].getInFo();
			}
		}

		return info;

	}
}
