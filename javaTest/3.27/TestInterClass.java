class TestInterClass 
{
	public static void main(String[] args) 
	{
		Outer o = new Outer();
		o.fun();

		Outer.Inter inter = new Outer().new Inter();
		inter.setInMsg("�ⲿʵ����Inter����");
		System.out.println(inter.getInMsg());
	}
}
