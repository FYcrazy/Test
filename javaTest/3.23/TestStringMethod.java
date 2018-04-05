class TestStringMethod 
{
	public static void main(String[] args) 
	{
		//charAt方法
		String s = "Hello";
		char c = s.charAt(1);
		System.out.println(c);

		System.out.println("***********************");

		//toCharArray
		String s1 = "thinking in java";
		char[] c1 = s1.toCharArray();
		for(int x = 0; x < c1.length; x++){
			System.out.print(c1[x]);
		}
		System.out.println("***********************");

		//字符串转换大写
		for(int x = 0; x < c1.length; x++){
			c1[x] -= 32;
		}
		System.out.println("\n" + new String(c1));
		System.out.println(new String(c1, 3 , 13));
		System.out.println("***********************");

		//给定一个字符串，判断其是否由字符串组成
		String number = "4328797234";
		String s2 = "1234777f23h123h1";
		System.out.println(number + " : " + isNumber(number));
		System.out.println(s2 + " : " + isNumber(s2));
		System.out.println("***********************");

		//字符串转换字节数组
		byte[] b = s1.getBytes();
		for(int x = 0; x < b.length; x++){
			b[x] -= 32;
		}
		System.out.println(new String(b));
		System.out.println(new String(b, 3, 7));
		System.out.println("***********************");

		//字符串比较，equals、equalsIgnoreCase
		String str1 = "hello world ";
		String str2 = "HELLO WOR1D ";

		System.out.println(str1.equals(str2));
		System.out.println(str1.equalsIgnoreCase(str2));

		System.out.println(str1.compareTo(str2));
		System.out.println(str1.compareTo(str2) > 0);
		System.out.println("***********************");

		//字符串查找
		System.out.println(str1.indexOf("world"));
		System.out.println(str1.indexOf("world", 3));
		System.out.println(str1.lastIndexOf("hello"));

		if(str1.contains("world")){
			System.out.println("存在");
		}else{
			System.out.println("不存在");
		}

		System.out.println(str1.startsWith("h"));
		System.out.println(str1.startsWith("x"));
		System.out.println(str1.endsWith("d"));

		System.out.println("***********************");

		//字符串的替换
		String resultA = s1.replaceAll("i", "_");
		String resultB = str1.replaceFirst("l", "_");
		System.out.println(resultA);
		System.out.println(resultB);

		System.out.println("***********************");

		//字符串截取
		String sub = s1.substring(0,9);
		String sub1 = s1.substring(9);
		System.out.println(sub);
		System.out.println(sub1);

		System.out.println("***********************");

		//字符串的切割
		String[] sDate = s1.split(" ");
		for(int x = 0; x < sDate.length; x++){
			System.out.println(sDate[x]);
		}
		
		//其他字符串操作
		String lowString = str2.toLowerCase();
		String upString = str1.toUpperCase();
		System.out.println(lowString);
		System.out.println(upString);

		String tString = s1.trim();
		System.out.println(tString);
		
	}

	public static boolean isNumber(String temp){
		char[] date = temp.toCharArray();
		for(int x = 0; x < date.length ; x++){
			if(date[x] < '0' || date[x] > '9'){
				return false;
			}
		}
		return true;
	}
}
