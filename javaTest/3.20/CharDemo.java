/*
    需求：查看char类型从1到127所对应的字符。
*/
class CharDemo{
    public static void main(String[] args){
		char C = (byte)0;
		int row = 128 / 8;
		for(int x = 0; x < row; x++){
		  for(int y = 0; y < 8 ; y++){
			System.out.print(C++ + " ");
		  }
		 System.out.println();
		}
    }
}