class Link 
{
	private Node root;
	private int length = 0;
	private int foot;
	private Book[] result;

	private class Node
	{
		private Book date;
		private Node next;

		public Node(Book date){
			this.date = date;
		}

		//��ӡ����
		public void print(){
			System.out.println(this.date.getInFo());
			if(this.next != null){
				this.next.print();
			}
		}

		//��������
		public void add(Book date){
			if(this.next == null){
				this.next = new Node(date);
				Link.this.length++;
			}else{
				this.next.add(date);
			}
		}
		
		//�ж������Ƿ����
		public boolean contains(Book date){
			if(date.compare(this.date)){
				return true;
			}else if(this.next != null){
				return this.next.contains(date);
			}
			return false;
		}

		//��������ȡ������
		public Book get(int index){
			if(index == Link.this.foot++){
				return this.date;
			}else if(this.next != null){
				return this.next.get(index);
			}
			return null;
		}

		//���������滻����
		public void set(int index, Book date){
			if(index == Link.this.foot++){
				this.date = date;
			}else if(this.next != null){
				this.next.set(index, date);
			}
		}

		//��������ɾ������
		public void remove(Node previous, Book date){
			if(date.compare(this.date)){
				previous.next = this.next;
				Link.this.length--;
			}else if(this.next != null){
				this.next.remove(this, date);
			}
		}

		//������ת��������
		public void toArray(){
			Link.this.result[Link.this.foot++] = this.date;
			if(this.next != null){
				this.next.toArray();
			}
		}
	}

	//��ӡ����
	public void print(){
		if(this.root != null){
			this.root.print();
		}
	}

	//void add(Book b) ����������
	public void add(Book date){
		if(this.root == null){
			this.root = new Node(date);
			this.length++;
		}else{
			this.root.add(date);
		}
	}
	//int size() ��������
	public int size(){
		return this.length;
	}
	//boolean isEmpty() �ж��Ƿ�Ϊ��
	public boolean isEmpty(){
		if(this.root == null){
			return true;
		}
		return false;
	}
	//boolean contains(Book b) �ж������Ƿ����
	public boolean contains(Book date){
		if(this.root != null){
			return this.root.contains(date);
		}
		return false;
	}
	//Book get(int index) ��������ȡ������
	public Book get(int index){
		this.foot = 0;
		if(this.root != null){
			return this.root.get(index);
		}
		return null;
	}
	//void set(int index, Book b) ���������滻����
	public void set(int index, Book date){
		this.foot = 0;
		if(this.root != null){
			this.root.set(index, date);
		}
	}
	//void remove(Book b) ��������ɾ������
	public void remove(Book date){
		if(date.compare(this.root.date)){
			this.root = this.root.next;
			this.length--;
		}else{
			this.root.next.remove(root,date);
		}
	}
	//Book[] toArray() ������ת��������
	public Book[] toArray(){
		this.foot = 0;
		this.result = new Book[this.length];
		this.root.toArray();
		return this.result;
	}
	//void clear() �������
	public void clear(){
		this.root = null;
		this.length = 0;
		this.result = null;
	}
}