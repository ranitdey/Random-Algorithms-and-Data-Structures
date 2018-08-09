package COM.RandomAlgoAndDs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;


public class LevelOrder {

	Node root;
	static class Node
	{
		int key;
		Node left,right;
		Node(int d)
		{
			key=d;
			left=null;
			right=null;
		}
	
	}
	
	LevelOrder()
	{
		root=null;
	}
	
	public void LorederTraversal(Node n)
	{
		Queue<Node> myq=new LinkedList();
		myq.add(n);
		myq.add(null);
		while(!myq.isEmpty())
		{
			Node temp=myq.poll();
			if(temp==null)
			{
				if(!myq.isEmpty())
				{
					System.out.println();
					myq.add(null);
				}
				
			}
			else
			{
				if(temp.left!=null)
				{
					myq.add(temp.left);
				}
				if(temp.right!=null)
				{
					myq.add(temp.right);
				}
				System.out.print(temp.key+" ");
			}
			
		}
	}
	
	public void InOrder(Node n)
	{
		if(n==null)
			return;
		
		InOrder(n.left);
		System.out.print(n.key+" ");
		InOrder(n.right);
	}
	
	
	public void InOrderWithStack(Node n)
	{
		Stack<Node> mys=new Stack();
		Node curr=n;
		
		while(curr!=null)
		{
			mys.push(curr);
			curr=curr.left;
		}
		
		while(mys.size()>0)
		{
			curr=mys.pop();
			System.out.println(curr.key+" ");
			
			
			while(curr.right!=null)
			{
				
				mys.push(curr.right);
				curr=curr.right;
			}
			
		}
		
		
	}
	public void ReverseLevelOrder(Node n)
	{
		Queue<Node> q=new LinkedList();
		Stack<Node> s=new Stack();
		q.add(n);
		while(!q.isEmpty())
		{
			Node temp=q.poll();
			s.push(temp);
			if(temp.right!=null)
			{
				q.add(temp.right);
			}
			if(temp.left!=null)
			{
				q.add(temp.left);
			}
		}
		while(!s.isEmpty())
		{
			System.out.println(s.pop().key);
		}
	}
	
	
	
	
	public static void main(String []args)
	{
		LevelOrder mytree=new LevelOrder();
		mytree.root=new Node(1);
		mytree.root.left=new Node(2);
		mytree.root.right=new Node(3);
		mytree.root.left.left=new Node(4);
		mytree.root.left.right=new Node(5);
		
		mytree.LorederTraversal(mytree.root);
		mytree.ReverseLevelOrder(mytree.root);
	}
	
}
