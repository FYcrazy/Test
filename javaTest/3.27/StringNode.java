class StringNode 
{
	private String date;
	private StringNode nextNode;

	public StringNode(String date){
		this.date = date;
	}

	public void setDate(String date){
		this.date = date;
	}

	public String getDate(){
		return this.date;
	}

	public void setNextNode(StringNode nextNode){
		this.nextNode = nextNode;
	}

	public StringNode getNextNode(){
		return this.nextNode;
	}
	
	//���ӽڵ�
	public void add(String date){
		if(this.nextNode == null){
			nextNode = new StringNode(date);
		}else{
			this.nextNode.add(date);
		}
	}
	
	//��ӡ����
	public void printNode(){
		System.out.println(this.date);
		if(this.nextNode != null){
			this.nextNode.printNode();
		}
	}
	
	//��ѯ
	public boolean contains(String date){
		if(this.nextNode != null){
			if(this.date.equals(date)){
				return true;
			}else{
				return this.nextNode.contains(date);
			}
		}
		return false;
	}

	public String get(int index){
		if(this.length == index){
			return this.date;
		}else{
			if(this.nextNode == null){
				return null;
			}else{
				this.nextNode.get(index);
			}
		}
	}
}