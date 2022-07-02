class TLNode1{

	int data;
	TLNode1 left,right;
	
	TLNode1(int d)
	{
		data=d;
	}
 }

public class BinarySearchTree{
	 
	TLNode1 root;
	
	TLNode1 insert(int d,TLNode1 root)
	{
	  if(root==null)
	    root=new TLNode1(d);
	  
     else if(d<=root.data)
		root.left=insert(d,root.left);
	
	  else
		root.right=insert(d,root.right);
	
	  return root;
	}
	
	TLNode1 search(int d,TLNode1 root)
	{
		if(root.data==d)
			return root;
		else if(d<root.data)
			return search(d,root.left);
	    else
			return search(d,root.right);
	}
	
	
	
	void inorder(TLNode1 r)
  {
		if(r==null)
		    return;
		
		
		inorder(r.left);
		System.out.println(r.data);
		inorder(r.right);
		
  }
  

TLNode1 delete(TLNode1 root, int data) 
   { 
       
       if (root == null)  return root; 

       if (data < root.data) 
           root.left = delete(root.left, data); 
       else if (data > root.data) 
           root.right = delete(root.right, data); 
 
       else
       { 
           
           if (root.left == null) 
               return root.right; 
           else if (root.right == null) 
               return root.left; 
 
           
           root.data = minValue(root.right); 
 
           root.right = delete(root.right, root.data); 
       } 
 
       return root; 
   } 	
  int minValue(TLNode1 root) 
   { 
       int minv = root.data; 
       while (root.left != null) 
       { 
           minv = root.left.data; 
           root = root.left; 
       } 
       return minv; 
   } 

  
  public static void main(String[] args)
  {
		BinarySearchTree ob=new BinarySearchTree();
		ob.root=ob.insert(50,ob.root); 
               ob.root=ob.insert(30,ob.root); 
               ob.root=ob.insert(20,ob.root); 
               ob.root=ob.insert(20,ob.root); 
               ob.root=ob.insert(70,ob.root); 
               ob.root=ob.insert(60,ob.root); 
               ob.root=ob.insert(80,ob.root);    
		ob.root=ob.delete(ob.root,50);
		System.out.println("******" +ob.root.data);
		ob.inorder(ob.root);
		
		TLNode1 find=ob.search(30,ob.root);
		if(find==null)
			System.out.println("not found");
		else
			System.out.println("found : "+find.data);
		
		
	}
}