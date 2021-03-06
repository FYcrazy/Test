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
		//打印数据
		public void printDate(){
			System.out.println(this.date);
			if(this.next != null){
				this.next.printDate();
			}
		}
		//添加数据
		public void addDate(String date){
			if(this.next == null){
				this.next = new Node(date);
			}else{
				this.next.addDate(date);
			}
		}
		//查询
		public boolean contains(String date){
			if(date.equals(this.date)){
				return true;
			}else if(this.next != null){
				return this.next.contains(date);
			}	
			return false;
		}
		//根据索引取出数据
		public String indexOf(int index){
			if(Link.this.foot == index){
				return this.date;
			}else if(this.next != null){
				Link.this.foot++;
				return this.next.indexOf(index);
			}
			return null;
		}
		//根据索引替换数据
		public void replaceOf(int index, String date){
			if(Link.this.foot == index){
				this.date = date;
			}else if(this.next != null){
				Link.this.foot++;
				this.next.replaceOf(index, date);
			}
		}
		//根据内容删除数据
		public void remove(Node previousNode, String date){
			if(date.equals(this.date)){
				previousNode.next = this.next;
				Link.this.length--;
			}else if(this.next != null){
				this.next.remove(this, date);
			}
		}
		//转数组
		public void toArray(){
			Link.this.result[Link.this.foot++] = this.date;
			if(this.next != null){
				this.next.toArray();
			}
		}
	}
	
	//void add() 添加数据
	public void add(String date){
		if(this.root == null){
			this.root = new Node(date);
		}else{
			this.root.addDate(date);
		}
		this.length++;
	}
	//void print() 打印数据
	public void print(){
		if(this.root != null){
			this.root.printDate();
		}
	}
	//int size() 取得链表中保存元素的个数
	public int size(){
		return this.length;
	}
	//boolean isEmpty() 链表是否为空
	public boolean isEmpty(){
		if(this.root == null){
			return true;
		}
		return false;
	}
	//boolean contains(String date) 判断链表中是否存在该数据
	public boolean contains(String date){
		if(this.root != null){
			return this.root.contains(date);
		}
		return false;
	}
	//String get(int index) 指定索引取出数据
	public String get(int index){
		foot = 0;
		return this.root.indexOf(index);
	}
	//void set(int index, String date) 根据索引替换数据
	public void set(int index, String date){
		foot = 0;
		this.root.replaceOf(index, date);
	}
	//void remove(String date) 根据数据删除
	public void remove(String date){
		if(date.equals(this.root.date)){
			this.root = this.root.next;
			this.length--;
		}else{
			this.root.next.remove(this.root, date);
		}
	}
	//String[] toArray() 将数据转为数组
	public String[] toArray(){
		if(this.root == null){
			return null;
		}
		
		this.foot = 0;
		this.result = new String[this.length];
		this.root.toArray();
		return result;
	
	}
	//void clear() 清空链表
	public void clear(){
		this.length = 0;
		this.foot = 0;
		this.root = null;
		this.result = null;
	}
}
