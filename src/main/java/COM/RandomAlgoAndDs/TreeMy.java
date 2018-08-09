package COM.RandomAlgoAndDs;

public class TreeMy {

	static class Node
	{
		int key;
		Node left,right;
		
		Node(int data)
		{
			key=data;
			left=null;
			right=null;
		}
		
	}
	
	Node root;
	
	TreeMy(int item)
	{
		root=new Node(item);
	}
	
	TreeMy()
	{
		root=null;
	}
	
	
	public static void main(String[] args)
	{
		TreeMy tree=new TreeMy();
		tree.root=new Node(23);
		tree.root.left=new Node(233);
		tree.root.right=new Node(54);
		
	}
	
	
}
