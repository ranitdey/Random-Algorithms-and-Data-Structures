package COM.RandomAlgoAndDs;

import java.util.Scanner;
import java.util.Stack;

public class ReverseLinkedList {
	Node head;
	
	static class Node
	{
		int key;
		Node next;
		Node(int d)
		{
			key=d;
		}
	}
	
	public Node reverse(Node n)
	{
		Node curr=n;
		Node prev=null;
		Node next=null;
		while(curr!=null)
		{
			next=curr.next;
			curr.next=prev;
			prev=curr;
			curr=next;
		}
		
		return prev;
		
	}
	
	
	public static void main(String args[] )
	{
		
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		
		while(n--!=0)
		{
			Stack<Integer> strr=new Stack();
			int numofpass=s.nextInt();
			int first=s.nextInt();
			strr.push(first);
			
			while(numofpass--!=0)
				
			{
				int curr,prev,id=0;
				char PorB=s.next().charAt(0);
				
				if(PorB=='P')
				{
					id=s.nextInt();
					
				}
				;
				
				
				if(PorB=='P')
				{
					strr.push(id);
				}
				if(PorB=='B')
				{
					curr=strr.pop();
					prev=strr.pop();
					strr.push(curr);
					strr.push(prev);
					
				}
				
			
				
			}
			
			System.out.println("Player "+strr.peek());
			
		}
		
		
		
	}

}
