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

		//打印数据
		public void print(){
			System.out.println(this.date.getInFo());
			if(this.next != null){
				this.next.print();
			}
		}

		//添加数据
		public void add(Book date){
			if(this.next == null){
				this.next = new Node(date);
				Link.this.length++;
			}else{
				this.next.add(date);
			}
		}
		
		//判断数据是否存在
		public boolean contains(Book date){
			if(date.compare(this.date)){
				return true;
			}else if(this.next != null){
				return this.next.contains(date);
			}
			return false;
		}

		//根据索引取出数据
		public Book get(int index){
			if(index == Link.this.foot++){
				return this.date;
			}else if(this.next != null){
				return this.next.get(index);
			}
			return null;
		}

		//根据索引替换内容
		public void set(int index, Book date){
			if(index == Link.this.foot++){
				this.date = date;
			}else if(this.next != null){
				this.next.set(index, date);
			}
		}

		//根据内容删除数据
		public void remove(Node previous, Book date){
			if(date.compare(this.date)){
				previous.next = this.next;
				Link.this.length--;
			}else if(this.next != null){
				this.next.remove(this, date);
			}
		}

		//将数据转换成数组
		public void toArray(){
			Link.this.result[Link.this.foot++] = this.date;
			if(this.next != null){
				this.next.toArray();
			}
		}
	}

	//打印数据
	public void print(){
		if(this.root != null){
			this.root.print();
		}
	}

	//void add(Book b) 添加新数据
	public void add(Book date){
		if(this.root == null){
			this.root = new Node(date);
			this.length++;
		}else{
			this.root.add(date);
		}
	}
	//int size() 链表长度
	public int size(){
		return this.length;
	}
	//boolean isEmpty() 判断是否为空
	public boolean isEmpty(){
		if(this.root == null){
			return true;
		}
		return false;
	}
	//boolean contains(Book b) 判断数据是否存在
	public boolean contains(Book date){
		if(this.root != null){
			return this.root.contains(date);
		}
		return false;
	}
	//Book get(int index) 根据索引取出数据
	public Book get(int index){
		this.foot = 0;
		if(this.root != null){
			return this.root.get(index);
		}
		return null;
	}
	//void set(int index, Book b) 根据索引替换内容
	public void set(int index, Book date){
		this.foot = 0;
		if(this.root != null){
			this.root.set(index, date);
		}
	}
	//void remove(Book b) 根据内容删除数据
	public void remove(Book date){
		if(date.compare(this.root.date)){
			this.root = this.root.next;
			this.length--;
		}else{
			this.root.next.remove(root,date);
		}
	}
	//Book[] toArray() 将数据转换成数组
	public Book[] toArray(){
		this.foot = 0;
		this.result = new Book[this.length];
		this.root.toArray();
		return this.result;
	}
	//void clear() 清空数据
	public void clear(){
		this.root = null;
		this.length = 0;
		this.result = null;
	}
}
