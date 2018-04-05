class Car 
{
	private int mid;
	private String pname;
	private Peple peple;

	public Car(){}

	public Car(int mid, String pname){
		this(mid,pname,null);
	}

	public Car(int mid, String pname, Peple peple){
		this.mid = mid;
		this.pname = pname;
		this.peple = peple;
	}

	public void setMid(int mid){
		this.mid = mid;
	}

	public int getMid(){
		return this.mid;
	}

	public void setName(String name){
		this.pname = pname;
	}

	public String getString(){
		return this.pname;
	}

	public void setMember(Peple peple){
		this.peple = peple;
	}

	public Peple getMember(){
		return this.peple;
	}

	public String getInFo(){
		return "������" + this.pname;
	}
}
