package COM.RandomAlgoAndDs;
import java.util.LinkedList;
import java.util.Queue;

public class StackByyQueue {
	
	Queue <Integer> q1,q2;
	
	int curr_size;
	
	StackByyQueue()
	{
		curr_size=0;
		q1=new LinkedList();
		q2=new LinkedList();
		
	}
	
	void push(int data)
	{
		q1.add(data);
		curr_size++;
	}
	
	int pop()
	
	
	{
		if(q1.isEmpty() && q2.isEmpty())
		{
			System.out.println("empty stack");
			return 0;
		}
		int z;
		while(q1.size()>1)
		{
			z=q1.remove();
			q2.add(z);
		}
		curr_size++;
		Queue<Integer> q;
		q=q1;
		q1=q2;
		q2=q;
		return q2.remove();
		
	}
	
	
////////Testing Agent
public static void main(String[] args)
{
StackByyQueue mylist=new StackByyQueue();

mylist.push(23);
mylist.push(25);
mylist.push(73);
mylist.push(233);




System.out.println(mylist.pop());
System.out.println(mylist.pop());
System.out.println(mylist.pop());
System.out.println(mylist.pop());
System.out.println(mylist.pop());
System.out.println(mylist.pop());
}

	
	
	

}
