class StringLinkTestDrive 
{
	public static void main(String[] args) 
	{
		Link sl = new Link("��ͷ");
		int x = 0;
		while(x < 5){
			sl.add("����" + (x + 1));
			x++;
		}
		sl.print();
		
		System.out.println(sl.size());

		System.out.println("�������Ƿ��г���3��" + sl.contains("����3"));
		System.out.println("�������Ƿ��г���8��" + sl.contains("����8"));


		System.out.println("3����������Ϊ��" + sl.get(3));
		System.out.println("7����������Ϊ��" + sl.get(7));
		System.out.println("************************************");
		sl.set(2,"�滻��ĳ���2");
		sl.set(3,"�滻��ĳ���3");
		sl.print();
		System.out.println("************************************");
		sl.remove("����4");
		sl.print();
		System.out.println("************************************");
		sl.remove("��ͷ");
		sl.print();
		System.out.println("************************************");
		String[] s = sl.toArray();
		for(int y = 0; y < s.length; y++){
			System.out.println(s[y]);
		}
		sl.clear();
		sl.print();
	}
}
