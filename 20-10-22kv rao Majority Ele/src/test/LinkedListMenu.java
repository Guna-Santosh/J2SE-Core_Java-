package test;
class NaeshLinkelist
{
  int data;
  NaeshLinkelist add;
  NaeshLinkelist root;
  NaeshLinkelist()
  {
	  root=null;
  }
  NaeshLinkelist(int data,NaeshLinkelist add)
  {
	  this.data=data;
	  this.add=add;
  }
  boolean isEmpty() 
  {
	  if(root==null)
		  return true;
	  else return false;
  }
  void insertFirst(int data) 
  {
	  NaeshLinkelist newnode=new NaeshLinkelist(data,null);
	  if(root==null)
	  root=newnode;
	 
	  else 
	  {
		 newnode.add=root;
		 root=newnode;
	  }
	  System.out.println(data+"insterted 1st");
	  
  }//insertfirst
  
  void insertMiddle(int data,int pos) 
  {
	  if(isEmpty()) 
	  {
		  System.out.println("linlist is empty");
	  }
	  else
	  {
		  NaeshLinkelist temp=root;
		  int totnodes=0;
		  while(temp!=null)
			  {
				  totnodes++;
				  temp=temp.add;
			  }
		  if(pos>totnodes) 
		  {
			  System.out.println("invalid position");
		  }
		  else {
		  if((pos>1) &&(pos<totnodes+1))
		  {
			  int i=1;
		  while((i<pos-1) && (temp.add!=null)) 
			{
				i++;
				temp=temp.add;}}
  NaeshLinkelist newnode=new NaeshLinkelist(data,null);
			newnode.add=temp.add;					
				temp.add=newnode;
				System.out.println(data+"add at :"+pos);
		  }
	  }
  }//insertMiddle
  
  
  void insertLast(int data , int pop)
  {
	  if(isEmpty()) 
	  {
		  System.out.println("list is empty");
	  }else 
	  {
		  NaeshLinkelist temp=root;
		  while(temp.add!=null) 
		  {
			  
		  }
			
	  }
  }  
 

void delete() 
{
	
}

public class LinkedListMenu 
{
   static void linkedlistmenu() 
   {
	   System.out.println("--------------");
	   System.out.println();
   }
	public static void main(String[] args) {


	}

}
}
