class Peple 
{
	private int mid;		//人员编号
	private String name;	//人员姓名
	private Car car;		//拥有的汽车
	private Peple child;	//孩子

	public Peple(){}

	public Peple(int mid, String name){
		this(mid,name,null);
	}

	public Peple(int mid, String name, Car car){
		this.mid = mid;
		this.name = name;
		this.car = car;
	}

	public void setMid(int mid){
		this.mid = mid;
	}

	public int getMid(){
		return this.mid;
	}
	
	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return this.name;
	}

	public void setCar(Car car){
		this.car = car;
	}

	public Car getCar(){
		return this.car;
	}

	public void setChild(Peple child){
		this.child = child;
	}

	public Peple getChild(){
		return this.child;
	}

	public String getInFo(){
		return	"编号：" + this.mid + "\t" +
				"姓名：" + this.name + "\t";
	}
}
