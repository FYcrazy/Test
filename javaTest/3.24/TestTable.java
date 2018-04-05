class TestTable 
{
	public static void main(String[] args) 
	{
		Peple p = new Peple(001,"小张");
		Peple chi = new Peple(002,"小小张");
		Car c = new Car(001,"五菱荣光s1");
		Car c2 = new Car(002,"别克");
		p.setCar(c);
		p.setChild(chi);
		chi.setCar(c2);
		System.out.println(p.getInFo() + "\n" + p.getCar().getInFo() + "\n" + p.getChild().getInFo() + "\n" + p.getChild().getCar().getInFo());
	}
}
