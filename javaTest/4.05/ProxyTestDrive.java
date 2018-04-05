class ProxyTestDrive 
{
	public static void main(String[] args) 
	{
		Network real = new Real();
		Proxy proxy = new Proxy(real);
		proxy.connection();

	}
}
