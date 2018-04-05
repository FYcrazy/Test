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
	
	//int size() 取得链表中保存元素的个数
	public int size(){
		return this.length;
	}
	//boolean isEmpty() 链表是否为空
	public boolean isEmpty(){
		if(this.root == null){
			return true;
		}else{
			return false;
		}
	}
	//boolean contains(String date) 判断链表中是否存在该数据
	public boolean contains(String date){
		return this.root.contains(date);
	}
	//String get(int index) 指定索引取出数据
	public String get(int index){
		this.root.get(index);
	}
	//void set(int index, String date) 根据索引替换数据
	//void remove(String date) 根据数据删除
	//String[] toArray() 将数据转为数组
	//void clear() 清空链表

}
