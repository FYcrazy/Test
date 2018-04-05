class Peple 
{
	private int mid;		//��Ա���
	private String name;	//��Ա����
	private Car car;		//ӵ�е�����
	private Peple child;	//����

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
		return	"��ţ�" + this.mid + "\t" +
				"������" + this.name + "\t";
	}
}