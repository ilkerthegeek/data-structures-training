import java.util.*;
public class data {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] priceOfPen= new int[5];
		 System.out.println("Please enter 5 values:");
		    Scanner in=new Scanner(System.in);
		    for(int i=0;i<priceOfPen.length;i++) {
		    	   priceOfPen[i]=in.nextInt();
		    }
		     

		    for(int i=0;i<priceOfPen.length;i++) {
			    System.out.print(priceOfPen[i]+" ");
		    }
		

	}

}
