class TestInterClass 
{
	public static void main(String[] args) 
	{
		Outer o = new Outer();
		o.fun();

		Outer.Inter inter = new Outer().new Inter();
		inter.setInMsg("外部实例化Inter对象");
		System.out.println(inter.getInMsg());
	}
}
