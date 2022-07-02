import java.util.*;

class LNode
{
	 int data;
	 LNode next;
	 LNode(int d)
	 {
		data=d;
		next = null;
	 }
	 
}
class StackList
{
	 LNode push(int d,LNode head){  
		
				LNode tmp1 = new LNode(d);
				
				if(head==null)
				   
					head=tmp1;
				
				else
				{
					tmp1.next=head;
					
					head=tmp1;
				}
				return head;
			 }
			 
			 
	 LNode pop(LNode head){
		   
		    if(head==null)
		        System.out.println("underflow");
		   else
				head=head.next;
			return head;
		 }
	

	void display(LNode head){
		
				System.out.println("\n list is : ");
				if(head==null){
					
					System.out.println("no LNodes");
			
					return;
					}
				 
				LNode tmp=head;

				while(tmp!=null){
						
				System.out.print(tmp.data+" ");
					 
				tmp=tmp.next;
					 
					
				}
	       }

   boolean isEmpty(LNode head)
	{
		if(head==null)
			return true;
		else
			return false;
	}
	
	int peek(LNode head)
	{
		if(head==null)
			return -1;
		return head.data;
	}
	
}


public class StackDemoList{
		
		public static void main(String[] args)
		{
		StackList s=new StackList();
		LNode head=null;
		Scanner in=new Scanner(System.in);
		
		 do
			{System.out.println("\n******** MENU *******");
			 System.out.println("\n1.PUSH");
			 System.out.println("\n2.POP");
			 System.out.println("\n3.PEEK");
			 System.out.println("\n4 IS EMPTY"); 
			 System.out.println("\n5 DISPLAY");
			 System.out.println("\n6.EXIT");
			 System.out.println("\n enter ur choice : ");
			 switch(in.nextInt())
				{
				 case 1: 
					 System.out.println("\nenter the value ");
					 head=s.push(in.nextInt(),head);
					 break;
				 case 2: 
					 head=s.pop(head);
					 break;
				 
				case 3: 
				System.out.println("\n top element : "+ s.peek(head));
					 break;
				 case 4: 
System.out.println("\n is empty : "+ s.isEmpty(head));
						 break;
				 case 5: s.display(head); 
						 break;
				 case 6: System.exit(0);
						 break;
				 default: System.out.println("\n Wrong Choice!");
						  break;
				}
			 System.out.println("\n do u want to cont... ");
			}while(in.nextInt()==1);

	}
}