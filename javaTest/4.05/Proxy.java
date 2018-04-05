class Real implements Network 
{

	public Real(){}

	public void connection(){
		System.out.println("用户上网具体业务");
	}
}

class Proxy implements Network
{
	Network network;
	
	public Proxy(Network network){
		this.network = network;
	}

	public void connection(){
		System.out.println("处理相关业务");
		this.network.connection();
	}
}
