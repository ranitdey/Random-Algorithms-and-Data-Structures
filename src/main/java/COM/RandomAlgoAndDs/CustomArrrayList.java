package COM.RandomAlgoAndDs;

import java.util.ArrayList;

public class CustomArrrayList {
	int n=3;
	ArrayList<Data> mylist=new ArrayList();
	class Data
	{
		String name;
		int roll;
		long number;
		
		Data(String name,int roll,long number)
		{
			this.name=name;
			this.roll=roll;
			this.number=number;
		}
		
	}
	
	public void addtolist(String nam,int rol,long num)
	{
		
		mylist.add(new Data(nam,rol,num));
		
	}
	
	public void printlist()
	{
		for(int i=0;i<mylist.size();i++)
		{
			Data temp=mylist.get(i);
			System.out.print(temp.name+" "+temp.roll+" "+temp.number);
			System.out.println();
		}
		
	}
	
	public static void main(String []args)
	{
		CustomArrrayList myarr=new CustomArrrayList();
		myarr.addtolist("ranit", 12, 98043563);
		myarr.addtolist("ranajit", 20, 12321332);
		myarr.printlist();
		
	}

}
