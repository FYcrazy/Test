interface A
{
	public static final String MSG = "�ӿ�A��ȫ�ֳ���";

	public abstract void print();
}

class X implements A
{
	public void print(){
		System.out.println("X����д�ķ���");
	}
}