class IfDemo
{
	public static void main(String[] args) 
	{
		float score1 = 59.0f;
		float score2 = 65.5f;
		float score3 = 85.0f;
		float score4 = 95.0f;
		System.out.println(Score(score1));
		System.out.println(Score(score2));
		System.out.println(Score(score3));
		System.out.println(Score(score4));
	}

	public static String Score(float f){
		if(f < 60){
			return "������";
		}else if(f >= 60 & f < 70){
			return "����";
		}else if(f >= 70 & f <80){
			return "�е�";
		}else if(f >= 80 & f <90){
			return "����";
		}else if(f >= 90 & f <100){
			return "����";
		}else{
			return "����";
		}
	}
}
