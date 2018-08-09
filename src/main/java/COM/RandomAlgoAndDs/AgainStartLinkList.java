package COM.RandomAlgoAndDs;
import java.util.HashSet;

public class AgainStartLinkList {
	Node head1,head2,head;
	
	static class Node
	{
		Node next;
		int data;
		
		Node(int d)
		{
			data=d;
			next=null;
		}
	}
	
////////////////////////////////////////////////    API     /////////////////////////////////////////////

	void PushFront(int key)
	{
		Node temp=new Node(key);
		temp.next=head;
		head=temp;
		
	}
	
	int TopFront()               //return top element
	{
		return head.data;
	}
	
	void PopFront()
	{
		if(head==null)
		{
			System.out.println("empty list");
		}
		else
		{
			head=head.next;
		}
			
	}
	
	void PushBack(int key)
	{
		Node temp=head;
		while(temp.next!=null)
		{
			temp=temp.next;
		}
		Node last=new Node(key);
		temp.next=last;
	}
	
	int TopBack()              //return back item
	{
		Node temp=head;
		while(temp.next!=null)
		{
			temp=temp.next;
		}
		return temp.data;
	}
	
	void PopBack()
	{
		Node temp=head;
		Node prev=null;
		while(temp.next!=null)
		{
			prev=temp;
			temp=temp.next;
		}
		prev.next=null;
		
	}
	
	boolean Find(int key)
	{
		Node temp=head;
		while(temp!=null)
		{
			if(temp.data==key)
			{
				return true;
			}
			temp=temp.next;
		}
		
		
			return false;
	
	}
	void Erase(int key)
	{
		if(head.data==key)
		{
			PopFront();
			return;
		}
		Node temp=head;
		Node prev=null;
		while(temp.data!=key)
		{
			prev=temp;
			temp=temp.next;
		}
		prev.next=temp.next;
	}
	
	boolean Empty()
	{
		if (head==null)
		{
			return true;
		}
		return false;
	}
	
	void AddBefore(Node bef,int key)
	{
		if(head==bef)
		{
			PushFront(key);
			return;
		}
		Node temp=head;
		Node prev=null;
		while(temp!=bef)
		{
			prev=temp;
			temp=temp.next;
			
		}
		Node newnode=new Node(key);
		prev.next=newnode;
		newnode.next=temp;
	}
	
	
	void AddAfter(Node aft,int key)
	{
		if(aft.next==null)
		{
			PushBack(key);
			return;
		}
		
		Node temp=head;
		Node nxt=null;
		while(temp!=aft)
		{
		
			temp=temp.next;
		}
		nxt=temp.next;
		Node newnode=new Node(key);
		temp.next=newnode;
		newnode.next=nxt;
		
	}
	
	void ReplaceNodesWithOutSwapingData(int key1,int key2)
	{
		boolean val1=Find(key1);
		boolean val2=Find(key2);
		if(key1==key2)
		{
			return;
		}
		if(val1==true && val2==true)
		{
			//track of key1
			Node prev1=null;
			Node current1=head;
			while(current1.data!=key1 && current1!=null)
			{
				prev1=current1;
				current1=current1.next;
			}
			//track of key2
			Node prev2=null;
			Node current2=head;
			while(current2.data!=key2 && current2!=null)
			{
				prev2=current2;
				current2=current2.next;
			}
			
			//before part >>>before [node]>>>after>>>[node]
			if(prev1!=null)
			{
				prev1.next=current2;
			}
			else
			{
				head=current2;
			}
			
			if(prev2!=null)
			{
				prev2.next=current1;
			}
			else
			{
				head=current1;
			}
			
		//swap the next part
			Node temp=current1.next;
			current1.next=current2.next;
			current2.next=temp;
			
			
			return;
			
		}
		
		System.out.println("key not present");
		
	}
	
	
	public boolean DetectLoop(Node h)
	{
		HashSet<Node> detect=new HashSet<Node>();
		while(h!=null)
		{
			if(detect.contains(h))
			{
				System.out.println(detect.contains(h));
				return true;
			}
			
			detect.add(h);
			h=h.next;
		}
		return false;
	}
	
	
	public boolean DetectLoop2(Node h)
	{
		Node slow=h;
		Node fast=h;
		while(slow!=null && fast!=null && fast.next!=null)
		{
			slow=slow.next;
			fast=fast.next.next;
			if(slow==fast)
			{
				return true;
			}
		}
		return false;
	}
	
	public Node ReverseLinkedList(Node h)
	{
		Node prev=null;
		Node curr=h;
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
	
	public Node MergeTwoLinklist(Node fir,Node sec)
	
	{
		Node s=null;
		Node newhead=null;
		if(fir==null)
		{
			return sec;
		}
		if(sec==null)
		{
			return fir;
		}
		
		if(fir.data<sec.data)
		{
			s=fir;
			fir=fir.next;
			newhead=s;
		}
		else
		{
			s=sec;
			sec=sec.next;
			newhead=s;
		}
		
		while(fir==null || sec==null)
		{
			if(fir.data<sec.data)
			{
				s.next=fir;
				s=fir;
				fir=fir.next;
			}
			else
			{
				s.next=sec;
				s=sec;
				sec=sec.next;
			}
		}
		
		if(fir==null)
		{
			s.next=sec;
		}
		if(sec==null)
		{
			s.next=fir;
		}
		return newhead;
		
		
		
	}
	
	
	public Node LinkIintersection(Node h1,Node h2)
	{
		int len1=0;
		int len2=0;
		int diff=0;
		
		Node temp1=h1;
		Node temp2=h2;
		while(temp1.next!=null)
		{
			temp1=temp1.next;
			len1++;
		}
		while(temp2.next!=null)
		{
			temp2=temp2.next;
			len2++;
		}
		if(temp1!=temp2)
		{
			return null;
		}
		
		if(len1>len2)
		{
			diff=len1-len2;
			temp1=h1;
			temp2=h2;
		}
		else
		{
			diff=len2-len1;
			temp1=h2;
			temp2=h1;
		}
		
		while(diff-->0)
		{
			temp1=temp1.next;
		}
		while(temp1!=temp2)
		{
			temp1=temp1.next;
			temp2=temp2.next;
		}
		return temp1;
		
		
	}
	
	
	public void MergeSorted(int[] arr1,int[] arr2)
	{
		int n1=0;
		int n2=0;
		int [] arr3=new int[arr1.length+arr2.length];
		int n3=0;
		while(n1<arr1.length && n2<arr2.length)
		{
			if(arr1[n1]<arr2[n2])
			{
				arr3[n3++]=arr1[n1++];
			}
			else
			{
				arr3[n3++]=arr2[n2++];
			}
		}
		if(n1<arr1.length)
		{
			arr3[n3++]=arr1[n1++];
		}
		if(n2<arr2.length)
		{
			arr3[n3++]=arr2[n2++];
		}
		for(int i=0;i<arr3.length;i++)
		{
			System.out.println(arr3[i]);
		}
		
	}
	
	
	public int FixedPoint(int []arr,int start,int end)
	{
		if(end>=start)
		{
			int mid=start+end/2;
			if(mid==arr[mid])
			{
				return mid;
			}
			if(arr[mid]<mid)
			{
				return FixedPoint(arr,mid+1,end);
			}
			else
				return FixedPoint(arr,start,mid-1);
			
			
		}
		
		return -1;
		
	}
	
	public int CountSumPair(int[] arr,int sum)
	{
		
		int count=0;
		HashSet<Integer> se=new HashSet();
		for(int i=0;i<arr.length;i++)
		{
			if(se.contains(sum-arr[i]))
			{
				count++;
			}
			else
			{
				se.add(arr[i]);
			}
		}
		return count;
	}
	
	public int NumberReverse(int num)
	{
		int rev=0;
		while(num!=0)
		{
			rev=rev*10+num%10;
			num=num/10;
		}
		return rev;
	}
	
	public void WordsInStringReverse(String strr)
	{
		String[] str1=strr.split(" ");
		String str2=str1[str1.length-1];
		for(int i=str1.length-2;i>=0;i--)
		{
			
			str2=str2+" "+str1[i];
		}
		
		System.out.println(str2);
		
	}
	public boolean isAnagram(String s1, String s2) {
	    if (s1.length() != s2.length()) return false;
	 
	    s1 = s1.toLowerCase();
	    s2 = s2.toLowerCase();
	 
	    int[] letters = new int[1<<8];
	 
	    for (char c : s1.toCharArray()) {
	       System.out.println(letters[c]++);
	    }
	 
	    for (char c: s2.toCharArray()) {
	        letters[c]--;
	    }
	 
	    for (int i : letters) {
	        if (i != 0) return false;
	    }
	 
	    return true;
	}
	
	
//////////////////////////////////////////////// API END     ////////////////////////////////////////////	
	public void printval(Node mynode)
	{
		Node temp=mynode;
		while(temp!=null)
		{
			System.out.println(temp.data);
			temp=temp.next;
		}
		
		
		
	}
	
	////////Testing Agent
	public static void main(String[] args)
	{
		AgainStartLinkList mylist=new AgainStartLinkList();
		Node first= new Node(12);
		Node second=new Node(30);
		
		mylist.head1=first;
		first.next=second;
		
		//fourth.next=mylist.head;
		Node fifth= new Node(20);
		Node sisxth=new Node(40);
		Node seven=new Node(90);
		Node eight=new Node(100);
		mylist.head2=fifth;
		fifth.next=sisxth;
		sisxth.next=seven;
		seven.next=eight;
		second.next=seven;
		int [] aarr1= {1,5,7,-1,5};
		int [] aarr2= {3,6,8,10};
		
		//mylist.MergeSorted(aarr1, aarr2);
		
	//Node x=mylist.LinkIintersection(mylist.head1, mylist.head2);
		
		//mylist.printval(x);
	System.out.println(mylist.isAnagram("aaedf", "faaed"));
		//Node neww=mylist.ReverseLinkedList(mylist.head);
	//	mylist.printval(neww);
		//System.out.println(mylist.DetectLoop2(mylist.head));
		//System.err.println(mylist.FixedPoint(aarr1, 0, 3));
		
	}
	

}
