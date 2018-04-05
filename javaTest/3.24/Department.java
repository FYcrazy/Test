/*
	部门
		字段：部门编号，部门名称，部门位置，员工
*/
class  Department
{
	private int depno;		//部门编号
	private String dname;	//部门名称
	private String loc;		//部门位置
	private Emp[] emps;		//员工

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
		String info =	"部门编号：" + this.depno + "\t" +
						"部门名称：" + this.dname + "\t" +
						"部门位置：" + this.loc + "\t";
		if(this.emps.length > 0){
			for(int x = 0; x < emps.length; x++){
				info += "\n";
				info += this.emps[x].getInFo();
			}
		}

		return info;

	}
}
