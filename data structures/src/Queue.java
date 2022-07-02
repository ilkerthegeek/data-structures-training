import java.util.*;
class QueueArray{

	 int front;
	 int rear;
	 int[] arr;
	 
	 QueueArray()
	 {
	   front=rear=-1;
	   arr=new int[10];
	  }
	  
	  void enqueue(int a)
	  {
	    if(rear==arr.length-1)
			System.out.println("overflow");
		else
			arr[++rear]=a;
		
		if(front==-1)
			front++;
	   }
	   
	   int dequeue()
	   {
	     int x=-1;
		 if(front==-1)
			System.out.println("underflow");
		 else
			x=arr[front++];
		 if(rear==0)
		     rear--;
		 return x;
	    }
		
		void display()
		{
		  for(int i=front;i<=rear;i++)
			System.out.print(arr[i]+" ");

		 System.out.println();


		}
	}
public class Queue{

	public static void main(String[] args)
	{
	  QueueArray ob=new QueueArray();
	  ob.enqueue(1);
	  ob.enqueue(2);
	  ob.enqueue(3);
	  ob.enqueue(4);
	  ob.enqueue(5);
	  ob.enqueue(6);
	  ob.enqueue(7);
	  ob.enqueue(8);
	  ob.enqueue(9);
	  ob.enqueue(10);
	  ob.enqueue(11);
	  ob.display();
	  ob.dequeue();
	  ob.display();
	 }
}