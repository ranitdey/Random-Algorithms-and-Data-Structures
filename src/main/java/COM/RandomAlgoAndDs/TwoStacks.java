package COM.RandomAlgoAndDs;

public class TwoStacks {
	
	int []a;
	int size;
	int top1;
	int top2;
	
	TwoStacks( int n)
	{
		a=new int[n];
		size=n;
		top1=-1;
		top2=size;
	}
	
	void push1(int d)
	{
		if(top1<top2-1)
		{
			top1++;
			a[top1]=d;
		}
		else
		{
			System.out.println("stack overflow");
		}
	}
	void push2(int d)
	{
		if(top1<top2-1)
		{
			
			top2--;
			a[top2]=d;
		}
		else
		{
			System.out.println("stack overflow");
		}
	}
	
	int pop1()
	{
		if(top1==-1)
		{
			System.out.println("stack underflow");
			return 0;
		}
		int x=a[top1];
		top1--;
		return x;
		
	}
	int pop2()
	{
		if(top2==size)
		{
			System.out.println("stack underflow");
			return 0;
		}
		
		int z=a[top2];
		top2++;
		return z;
		
	}
	
////////Testing Agent
public static void main(String[] args)
{
TwoStacks mylist=new TwoStacks(18);
mylist.push1(123);
mylist.push1(34);
mylist.push1(12);
mylist.push1(15);
mylist.push1(18);
mylist.push2(34);
mylist.push2(95);
mylist.push2(57);
mylist.push2(88);
mylist.push2(3104);





System.out.println(mylist.pop1());
System.out.println(mylist.pop1());

System.out.println(mylist.pop2());
System.out.println(mylist.pop2());
}
	

}
