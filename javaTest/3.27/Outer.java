class  Outer
{
	private String msg = "Hello World";
	class Inter
	{
		private String InMsg = "内部类的属性";
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

		in.InMsg = "外部类直接访问以及修改内部类的属性";
		System.out.println(in.InMsg);

	}
}