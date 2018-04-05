class TestDept 
{
	public static void main(String[] args) 
	{
		Department d = new Department(001,"������","�����ر�һ��");
		Emp e1 = new Emp(001,"��","��Ŀ����",15000.0,3000.0);
		Emp e2 = new Emp(002,"Ǯ","����Ա",5000.0,1000.0);
		e2.setMgr(e1);
		Emp e3 = new Emp(003,"��","����Ա",4500.0,1000.0);
		e3.setMgr(e1);
		Emp e4 = new Emp(004,"��","����Ա",4350.0,950.0);
		e4.setMgr(e1);
		Emp[] emps = {e1,e2,e3,e4};
		for(int x = 0; x < emps.length; x++){
			emps[x].setDepartment(d);
		}
		d.setEmps(emps);

		String eInFo = e1.getInFo();
		System.out.println(eInFo);

		System.out.println("**********************************");

		String dInFo = d.getInFo();
		System.out.println(dInFo);

	}
}
