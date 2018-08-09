package COM.RandomAlgoAndDs;

public class TwoStacksInArray {

	int []arr;
	int size;
	int top1;
	int top2;
	
	//constructor
	TwoStacksInArray(int n)
	{
		arr=new int[n];
		size=n;
		top1=-1;
		top2=size;
	}
	
	public void push1(int data)
	{
		if(top1<top2)
		{
			top1++;
			arr[top1]=data;
			
		}
		else {
			System.out.println("stack overflow");
		}
	}
	
	public void push2(int data)
	{
		if(top1<top2)
		{
			top2--;
			arr[top2]=data;
			
		}
		else {
			System.out.println("stack overflow");
		}
		
	}
	
	public int pop1()
	{
		if(top1<0)
		{
			System.out.println("empty stack1");
			return -1;
			
		}
		int z=arr[top1];
		top1--;
		return z;
		
	}
	public int pop2()
	{
		if(top2==arr.length)
		{
			System.out.println("empty stack2");
			return -1;
			
		}
		int z=arr[top2];
		top2++;
		return z;
	}
	
	//test client
	public static void  main(String[] args)
	{
		TwoStacksInArray a=new TwoStacksInArray(30);
		a.push1(12);
		a.push1(13);
		a.push1(14);
		a.push1(15);
		a.push1(16);
		a.push1(17);
		a.push1(18);
		a.push1(19);
		
		a.push2(1);
		a.push2(2);
		a.push2(3);
		a.push2(4);
		a.push2(5);
		a.push2(6);
		a.push2(7);
		a.push2(8);
		
		
		System.out.println("stack 1 "+a.pop1());
		System.out.println("stack 2 "+a.pop2());
		System.out.println("stack 1 "+a.pop1());
		System.out.println("stack 2 "+a.pop2());
		System.out.println("stack 1 "+a.pop1());
		System.out.println("stack 2 "+a.pop2());
		System.out.println("stack 1 "+a.pop1());
		System.out.println("stack 2 "+a.pop2());
		System.out.println("stack 1 "+a.pop1());
		System.out.println("stack 2 "+a.pop2());
		System.out.println("stack 1 "+a.pop1());
		System.out.println("stack 2 "+a.pop2());
		System.out.println("stack 1 "+a.pop1());
		System.out.println("stack 2 "+a.pop2());
		System.out.println("stack 1 "+a.pop1());
		System.out.println("stack 2 "+a.pop2());
		System.out.println("stack 1 "+a.pop1());
		System.out.println("stack 2 "+a.pop2());
		
	}
	
}
