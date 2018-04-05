interface A
{
	public static final String MSG = "接口A的全局常量";

	public abstract void print();
}

class X implements A
{
	public void print(){
		System.out.println("X的重写的方法");
	}
}