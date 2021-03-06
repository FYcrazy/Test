/*
	链表类：
	  方法：
	      void add(Object date);			添加数据
		  int size();						链表长度
		  boolean isEmpty();				链表是否为空
		  boolean contains(Object date);	判断某个数据是否存在于链表
		  Object get(int index);			根据索引取得数据
		  void set(int index, Object date);	根据索引替换数据
		  void remove(Object date);			删除指定数据(需要比较数据)
		  Object[] toArray();				将数据以数组的形式返回
		  void clear();						清空链表
*/
class Link 
{
	private class Node{
		private Object date;		//数据
		private Node next;			//下一个节点

		public Node(Object date){
			this.date = date;
		}

		public void addNode(Object date){
			if(this.next == null){
				this.next = new Node(date);
			}else{
				this.next.addNode(date);
			}
		}

		public boolean containsNode(Object date){
			if(date.equals(this.date)){
				return true;
			}else if(this.next != null){
				return this.next.containsNode(date);
			}else{
				return false;
			}
		}
		
		public Object getNode(int index){
			if(index == Link.this.foot++){
				return this.date;
			}else if(this.next != null){
				return this.next.getNode(index);
			}else{
				return null;
			}
		}

		public void setNode(int index, Object date){
			if(index == Link.this.foot++){
				this.date = date;
			}else if(this.next != null){
				this.next.setNode(index, date);
			}
		}

		public void removeNode(Object date, Node previous){
			if(date.equals(this.date)){
				previous.next = this.next;
				Link.this.size--;
			}else if(this.next != null){
				this.next.removeNode(date,this);
			}
		}
		
		public void toArray(){
			Link.this.dates[Link.this.foot++] = this.date;
			if(this.next != null){
				this.next.toArray();
			}
		}
	}

	private Node head;			//头节点
	private int size = 0;		//链表长度
	private int foot;			//角标
	private Object[] dates;		//数组形式的数据
	
	public void add(Object date){
		if(this.head == null){
			this.head = new Node(date);
			this.size++;
		}else{
			this.head.addNode(date);
			this.size++;
		}
	}

	public int size(){
		return this.size();
	}

	public boolean isEmpty(){
		if(this.size == 0){
			return true;
		}else{
			return false;
		}
	}

	public boolean contains(Object date){
		if(this.head != null){
			return this.head.containsNode(date);
		}else{
			return false;
		}
	}

	public Object get(int index){
		this.foot = 0;
		if(this.head != null){
			return this.head.getNode(index);
		}else{
			return null;
		}
	}

	public void set(int index, Object date){
		this.foot = 0;
		if(this.head != null){
			this.head.setNode(index, date);
		}
	}

	public void remove(Object date){
		if(date.equals(this.head.date)){
			this.head = this.head.next;
			this.size--;
		}else{
			this.head.next.removeNode(date,this.head);
		}
	}

	public Object[] toArray(){
		if(this.head != null){
			this.dates = new Object[this.size];
			this.foot = 0;
			this.head.toArray();
			return dates;
		}else{
			return null;
		}
	}

	public void clear(){
		this.size = 0;
		this.head = null;
	}
}
