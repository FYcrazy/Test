class StringLink 
{
	private StringNode root;
	private int length = 0;

	public StringLink(){}

	public StringLink(String date){
		StringNode node = new StringNode(date);
		this.root = node;
		this.length++;
	}

	public void add(String date){
		if(this.root == null){
			StringNode newNode = new StringNode(date);
		}else{
			this.root.add(date);
			this.length++;
		}
	}

	public void print(){
		this.root.printNode();
	}
	
	//int size() ȡ�������б���Ԫ�صĸ���
	public int size(){
		return this.length;
	}
	//boolean isEmpty() �����Ƿ�Ϊ��
	public boolean isEmpty(){
		if(this.root == null){
			return true;
		}else{
			return false;
		}
	}
	//boolean contains(String date) �ж��������Ƿ���ڸ�����
	public boolean contains(String date){
		return this.root.contains(date);
	}
	//String get(int index) ָ������ȡ������
	public String get(int index){
		this.root.get(index);
	}
	//void set(int index, String date) ���������滻����
	//void remove(String date) ��������ɾ��
	//String[] toArray() ������תΪ����
	//void clear() �������

}
