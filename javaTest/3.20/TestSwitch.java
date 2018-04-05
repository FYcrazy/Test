class TestSwitch 
{
	public static void main(String[] args) 
	{
		int num = 1;
		switch(num){
			case 2:{
				System.out.println("内容为2");
				break;
			}
			case 1:{
				System.out.println("内容为1");
				break;
			}
			case 3:{
				System.out.println("内容为3");
				break;
			}
			default:{
				System.out.println("内容不匹配");
				break;
			}
		}
	}
}
