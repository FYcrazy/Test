class TestTable 
{
	public static void main(String[] args) 
	{
		Peple p = new Peple(001,"С��");
		Peple chi = new Peple(002,"СС��");
		Car c = new Car(001,"�����ٹ�s1");
		Car c2 = new Car(002,"���");
		p.setCar(c);
		p.setChild(chi);
		chi.setCar(c2);
		System.out.println(p.getInFo() + "\n" + p.getCar().getInFo() + "\n" + p.getChild().getInFo() + "\n" + p.getChild().getCar().getInFo());
	}
}
