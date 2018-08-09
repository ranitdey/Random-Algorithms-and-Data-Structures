package COM.RandomAlgoAndDs;

public class BinaryToDLL {
	Node root;
	
	static class Node
	{
		int key;
		Node left;
		Node right;
		
		
		Node(int data)
		{
			key=data;
		}
		
	}
	
	BinaryToDLL(int d)
	{
		root=new Node(d);
	}
	//using inorder traversal
	public void conversionToDLL(Node n)
	{
		Node head;
		if(n==null)
		{
			return;
		}
		conversionToDLL(n.right);
		head=n.right;
		
		
		
	}
	
	
	

}
