package COM.RandomAlgoAndDs;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;


public class TestTt {
	

	Node root;
	static class Node
	{
		int key;
		Node left;
		Node right;
		
		Node(int d)
		{
			key=d;
			left=null;
			right=null;
		}
	}
	
	void levelOrderTR(Node n)
	{
		Queue<Node> myq=new LinkedList();
		myq.add(n);
		while(!myq.isEmpty())
		{
			Node temp=myq.poll();
			
			if(temp.left!=null)
			{
				myq.add(temp.left);
			}
			if(temp.right!=null)
			{
				myq.add(temp.right);
			}
			System.out.println(temp.key);
		}
		
	}
	
	
	
	
	
	
	
	
	void mirror()
	{
		root=Mirror(root);
	}
	
	Node Mirror(Node n)
	{
		if(n==null)
			return n;
		Node left=Mirror(n.left);
		Node right=Mirror(n.right);
		
		n.right=left;
		n.left=right;
		return n;
		
	}
	
	boolean Unique(char[]arr)
	{
		HashSet<Character> set=new HashSet();
		for(int i=0;i<arr.length;i++)
		{
			if(set.contains(arr[i]))
			{
				return false;
			}
			else
				set.add(arr[i]);
		}
		return true;
	}
	
	public Node SortedArrayToBST(int[] arr, int start,int end)
	{
		if(start>end)
		{
			return null;
		}
		int mid=arr[start+end/2];
		Node node=new Node(arr[mid]);
		node.left=SortedArrayToBST(arr,start,mid-1);
		node.right=SortedArrayToBST(arr,mid+1,end);
		
		return node;
	}
	
	
		
public static void main(String[] args)
{
	TestTt mytree=new TestTt();
	//char[] myar= {'3','2','5','7','9'};
	//System.out.println(mylist.Unique(myar));
	mytree.root=new Node(1);
	mytree.root.left=new Node(2);
	mytree.root.right=new Node(3);
	mytree.root.left.left=new Node(4);
	mytree.root.left.right=new Node(5);
	mytree.levelOrderTR(mytree.root);
	
}
	
	
	
	
}
