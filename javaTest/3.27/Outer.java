class  Outer
{
	private String msg = "Hello World";
	class Inter
	{
		private String InMsg = "�ڲ��������";
		public void print(){
			System.out.println(msg);
		}

		public void setInMsg(String InMsg){
			this.InMsg = InMsg;
		}

		public String getInMsg(){
			return this.InMsg;
		}
	}

	public void fun(){
		Inter in = new Inter();
		System.out.println(in.InMsg);

		in.InMsg = "�ⲿ��ֱ�ӷ����Լ��޸��ڲ��������";
		System.out.println(in.InMsg);

	}
}