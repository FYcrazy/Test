class NodeTestDrive 
{
	public static void main(String[] args) 
	{
		Node n1 = new Node("����1");
		Node n2 = new Node("����2");
		Node n3 = new Node("����3");
		Node n4 = new Node("����4");

		n1.setNode(n2);
		n2.setNode(n3);
		n3.setNode(n4);
		
		/*
		Node currentNode = n1;
		while(currentNode != null){
			System.out.println(currentNode.getDate());
			currentNode = currentNode.getNode();
		}
		*/

		fun(n1);
	}

	public static void fun(Node currentNode){
		if(currentNode == null){
			return ;
		}
		System.out.println(currentNode.getDate());
		fun(currentNode.getNode());

	}
}