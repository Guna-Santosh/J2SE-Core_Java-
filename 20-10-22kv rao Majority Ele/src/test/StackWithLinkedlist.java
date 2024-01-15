package test;
class NareshStackLinkedList
{
	int data;
	NareshStackLinkedList add;
	NareshStackLinkedList top;
	NareshStackLinkedList()
	{
		top =null;
	}
	NareshStackLinkedList(int data,NareshStackLinkedList add)
	{
		this.data=data;
		this.add=add;
	}
	
	
	
	boolean isEmpty() 
	{
		if(top==null)return true;
		else return false;
	}
	void push(int data) 
	{
		NareshStackLinkedList newnode=new NareshStackLinkedList(data,null);
		if(top==null)
			top=newnode;
		else 
		{
			newnode.add=top;
			top=newnode;
		}
				
	}
	void disp() 
	{ 
		if(isEmpty()) 
		System.out.println("stack is empty");
		else
		{System.out.println("------------");
		NareshStackLinkedList temp=top;
	    while(temp!=null) 
	    {   
	    	//System.out.println(temp);
	    	//System.out.print(temp.hashCode()+":");
	    	System.out.print(temp.data+"->");
	    	temp=temp.add;
	    	
	    }
	    System.out.println("null");
		}
		
	}
	void pop() 
	{
		if(isEmpty()) 
		
			System.out.println("");
			else
			{
				int data=top.data;
			    System.out.println(data);
			}
		
	}
	
}
public class StackWithLinkedlist {

	public static void main(String[] args) 
	{
		NareshStackLinkedList nl=new NareshStackLinkedList();
		//System.out.println(nl.top);
		
		System.out.println("initial status of stack = "+nl.isEmpty());
		//NareshStackLinkedList newnode=new NareshStackLinkedList();
		   nl.pop();
		   System.out.println("---------------------------");
		   nl.push(10);
	    System.out.println("later status of stack"+nl.isEmpty());
	     nl.push(20);
		 nl.push(30);
		 nl.push(40);
		 nl.disp();
		 nl.pop();
		 nl.disp();
		 nl.pop();
		 nl.disp();
		 nl.pop();
		 nl.disp();
		 nl.pop();
		 nl.disp();
		 
		 
	}

}
