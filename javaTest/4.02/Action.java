abstract class Action 
{
	public static final int EAT = 1;		//��
	public static final int SLEEP = 5;		//˯
	public static final int WORK = 7;		//����

	public void fun(int flag){
		switch(flag){
			case EAT:
				this.eat();
				break;
			case SLEEP:
				this.sleep();
				break;
			case WORK:
				this.work();
				break;
			case EAT + WORK:
				this.eat();
				this.work();
				break;
		}
	}

	abstract public void eat();
	abstract public void sleep();
	abstract public void work();
}
