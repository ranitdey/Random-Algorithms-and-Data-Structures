package COM.RandomAlgoAndDs;
import java.util.Stack;

public class ParenthesisMatching {
	
	Stack<Character> strr;
	
	ParenthesisMatching()
	{
		strr=new Stack<Character>();
	}
	
	public boolean MatchCheck(char in1,char in2)
	{
		if(in1=='(' && in2==')')
			return true;
		else if(in1=='{' && in2=='}')
			return true;
		else if(in1=='[' && in2==']')
			return true;
		return false;
		
	}
	
	public boolean ParenthesisCheckk(char[] myarray)
	{
		for(int i=0;i<myarray.length;i++)
		{
			if(myarray[i]=='(' || myarray[i]=='{' || myarray[i]=='[')
			{
				strr.push(myarray[i]);
			}
			if(myarray[i]==')' || myarray[i]=='}' || myarray[i]==']')
			{
				if(!MatchCheck(strr.pop(),myarray[i]))
				{
					System.out.println("ei");
					return false;
					
				}
				
			}
			System.out.println("l");
			
		}
		if(strr.isEmpty())
		{
			return true;
		}
		return false;
	}
	
	public static void main(String []args)
	{
		ParenthesisMatching mylist=new ParenthesisMatching();
		char[] myinputcode= {'(','[','{','}',']',')'};
		System.out.println(mylist.ParenthesisCheckk(myinputcode));
		System.out.println(mylist.strr);
	}

}
