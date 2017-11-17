package tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Node {
    int data;
    Node left;
    Node right;
 }

public class BinarySearchTree {
	
	public static void main(String[] args) {
		Node root = new Node();
		root.data=4;
		
		root.left = new Node();
		root.left.data = 2;
		
		root.right = new Node();
		root.right.data = 6;
		
		root.left.left = new Node();
		root.left.left.data = 1;
		
		root.left.right = new Node();
		root.left.right.data = 3;
		
		root.right.left = new Node();
		root.right.left.data = 5;
		
		root.right.right = new Node();
		root.right.right.data = 7;
		
		BinarySearchTree bst = new BinarySearchTree();
	    //System.out.println(bst.checkNodes(root, root.data,Integer.MAX_VALUE,Integer.MIN_VALUE));
	    
	    System.out.println(bst.checkBST(root));
	}
	boolean checkNodes(Node root , int rootVal, int min , int max) {
	       if(root.left !=null){ 
	            if(root.data > root.left.data && rootVal > Math.max(max,root.left.data)) 
	                return checkNodes(root.left, rootVal, min , Math.max(max,root.left.data));
	            else
	                return false;
	        }
	        if(root.right !=null){
	            if(root.data < root.right.data && rootVal < Math.min(min,root.right.data)) 
	                return checkNodes(root.right,rootVal,Math.min(min,root.right.data),max );
	            else
	                return false;
	        }
	        return true;
	   }
	
	boolean checkBST(Node root) {
        List<Integer> tree = new ArrayList<>();
        inOrderTraversal(root,tree);
        return isSorted(tree);
        
    }

   void inOrderTraversal(Node root,List<Integer> tree){
       if(root== null) return ;
       else{
         inOrderTraversal(root.left,tree);
         tree.add(root.data);
         inOrderTraversal(root.right,tree);  
       }
   }
   
   boolean isSorted(List<Integer> tree){

       for(int i=0;i<tree.size();i++){
           for(int j=i+1; j<tree.size()-1;j++){
               if(tree.get(i) > tree.get(j+1))
                   return false;
               else
                   continue;
           }
       }
       return true;
   }

}
