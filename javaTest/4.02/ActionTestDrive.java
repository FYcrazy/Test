class ActionTestDrive 
{
	public static void main(String[] args) 
	{
		Action human = new Human();
		Action robot = new Robot();
		Action pig = new Pig();
		print(human);
		print(robot);
		print(pig);
	}

	public static void print(Action a){
		a.fun(Action.EAT);
		a.fun(Action.SLEEP);
		a.fun(Action.WORK);
	}
}
