class LNode1{
	
	int data;
	LNode1 next;

	LNode1(int d)
	{
		data=d;
		next = null ; 
	}
}
class Queuem{

	LNode1 enqueue(LNode1 head,int a)
	{
		LNode1 tmp=new LNode1(a);
		if(head==null)
			head=tmp;
		else
		 { 
			LNode1 tmp1=head;
			while(tmp1.next!=null)
				tmp1=tmp1.next;
			
			tmp1.next=tmp;
		}
		return head;
	}
	
	
	LNode1 dequeue(LNode1 head)
	{
		if(head==null)
		        System.out.println("underflow");
		   else
				head=head.next;
			return head;
	}
	
	void display(LNode1 head)
	{
		
				System.out.println("\n list is : ");
				if(head==null){
					
					System.out.println("no LNodes");
			
					}
				 
				LNode1 tmp=head;

				while(tmp!=null){
						
				System.out.print(tmp.data+" ");
					 
				tmp=tmp.next;
					 
					
				}
	}
	
	}
	
	public class QueueNode{
		
		public static void main(String[] args)
		{
			Queuem ob=new Queuem();
			LNode1 head=null;
			
			head=ob.enqueue(head,1);
			head=ob.enqueue(head,2);
			head=ob.enqueue(head,3);
			head=ob.enqueue(head,4);
			head=ob.enqueue(head,5);
			ob.display(head);
			head=ob.dequeue(head);
			ob.display(head);
		}
	}
