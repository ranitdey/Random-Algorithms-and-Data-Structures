package COM.RandomAlgoAndDs;
import java.util.Stack;

public class ValidSubstring {
	
	Stack<Integer> strr;
	int result;
	
	ValidSubstring ()
	{
		strr=new Stack<Integer>();
		result=0;
		strr.push(-1);
	}
	
	public int SubStringCheck(char[] myarr)
	{
		int val;
		for(int i=0;i<myarr.length;i++)
		{
			if(myarr[i]=='(')
			{
				strr.push(i);
			}
			else
			{
				strr.pop();
				val=strr.peek();
				if(!strr.isEmpty())
				{
					if(i-val>result)
					{
						result=i-val;
					}
				}
				else
					strr.push(i);
				
				
			}
		}
		return result;
	}
	
	
	public static void main(String []args)
	{
		ValidSubstring mylist =new ValidSubstring();
		char [] arr= {'(','(','(',')',')','(',')','(',')',')','('};
		System.out.println(mylist.SubStringCheck(arr));
	}

}
