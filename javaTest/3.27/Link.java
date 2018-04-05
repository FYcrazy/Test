class Link 
{
	private Node root;
	private int length = 0;
	private int foot;
	private String[] result;
	
	public Link(){}

	public Link(String date){
		if(this.root == null){
			this.root = new Node(date);
			length++;
		}
	}

	private class Node{
		private String date;
		private Node next;

		public Node(String date){
			this.date = date;
		}
		//��ӡ����
		public void printDate(){
			System.out.println(this.date);
			if(this.next != null){
				this.next.printDate();
			}
		}
		//��������
		public void addDate(String date){
			if(this.next == null){
				this.next = new Node(date);
			}else{
				this.next.addDate(date);
			}
		}
		//��ѯ
		public boolean contains(String date){
			if(date.equals(this.date)){
				return true;
			}else if(this.next != null){
				return this.next.contains(date);
			}	
			return false;
		}
		//��������ȡ������
		public String indexOf(int index){
			if(Link.this.foot == index){
				return this.date;
			}else if(this.next != null){
				Link.this.foot++;
				return this.next.indexOf(index);
			}
			return null;
		}
		//���������滻����
		public void replaceOf(int index, String date){
			if(Link.this.foot == index){
				this.date = date;
			}else if(this.next != null){
				Link.this.foot++;
				this.next.replaceOf(index, date);
			}
		}
		//��������ɾ������
		public void remove(Node previousNode, String date){
			if(date.equals(this.date)){
				previousNode.next = this.next;
				Link.this.length--;
			}else if(this.next != null){
				this.next.remove(this, date);
			}
		}
		//ת����
		public void toArray(){
			Link.this.result[Link.this.foot++] = this.date;
			if(this.next != null){
				this.next.toArray();
			}
		}
	}
	
	//void add() ��������
	public void add(String date){
		if(this.root == null){
			this.root = new Node(date);
		}else{
			this.root.addDate(date);
		}
		this.length++;
	}
	//void print() ��ӡ����
	public void print(){
		if(this.root != null){
			this.root.printDate();
		}
	}
	//int size() ȡ�������б���Ԫ�صĸ���
	public int size(){
		return this.length;
	}
	//boolean isEmpty() �����Ƿ�Ϊ��
	public boolean isEmpty(){
		if(this.root == null){
			return true;
		}
		return false;
	}
	//boolean contains(String date) �ж��������Ƿ���ڸ�����
	public boolean contains(String date){
		if(this.root != null){
			return this.root.contains(date);
		}
		return false;
	}
	//String get(int index) ָ������ȡ������
	public String get(int index){
		foot = 0;
		return this.root.indexOf(index);
	}
	//void set(int index, String date) ���������滻����
	public void set(int index, String date){
		foot = 0;
		this.root.replaceOf(index, date);
	}
	//void remove(String date) ��������ɾ��
	public void remove(String date){
		if(date.equals(this.root.date)){
			this.root = this.root.next;
			this.length--;
		}else{
			this.root.next.remove(this.root, date);
		}
	}
	//String[] toArray() ������תΪ����
	public String[] toArray(){
		if(this.root == null){
			return null;
		}
		
		this.foot = 0;
		this.result = new String[this.length];
		this.root.toArray();
		return result;
	
	}
	//void clear() �������
	public void clear(){
		this.length = 0;
		this.foot = 0;
		this.root = null;
		this.result = null;
	}
}