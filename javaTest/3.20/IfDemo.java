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
			return "不及格";
		}else if(f >= 60 & f < 70){
			return "及格";
		}else if(f >= 70 & f <80){
			return "中等";
		}else if(f >= 80 & f <90){
			return "良好";
		}else if(f >= 90 & f <100){
			return "优秀";
		}else{
			return "满分";
		}
	}
}
