class TestPayMethod 
{
	public static void main(String[] args) 
	{
		double money = 6.0;
		double money2 = 12.0;
		Pay(money);
		Pay(money2);
	}

	public static void Pay(double money){
		if(money > 10.0){
			System.out.println("支付成功");
		}
		if(money <10.0){
			System.out.println("支付失败");
		}
	}
}
