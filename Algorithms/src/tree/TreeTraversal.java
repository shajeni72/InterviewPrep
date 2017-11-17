package tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class TreeTraversal {

	Node binaryTree;
	
	public static void main(String[] args) {
		TreeTraversal  tt = new TreeTraversal();
		tt.buildTree();
		tt.inOrderTraversal(tt.binaryTree);
		System.out.println();
		tt.inOrderTraversal_Stack(tt.binaryTree);
		System.out.println();
		tt.preOrderTraversal_Stack(tt.binaryTree);
		System.out.println();
		tt.preOrderTraversal(tt.binaryTree);
		System.out.println();
		ArrayList<Node> postOrder = tt.postOrderTraversal_Stack(tt.binaryTree);
		
		postOrder.forEach(n -> System.out.print(n.val+", "));
		System.out.println();
		tt.levelTraversal(tt.binaryTree);
		System.out.println();
		tt.bfs_Queue(tt.binaryTree);
		tt.leastCommonAncestor(tt.binaryTree);
	}
	
	public void buildTree(){
		Node root = new Node();
		root.val = 1;
		
		Node left1 = new Node();
		left1.val= 2;
		
		Node right = new Node();
		right.val = 3;
		
		root.left = left1;
		root.right = right;
		
		Node left2 = new Node();
		left2.val = 4;
		
		Node right2 = new Node();
		right2.val = 5;
		
		left1.left = left2;
		left1.right = right2;
		
		binaryTree = root;
	}
	class Node{
		int val;
		Node left, right;
	}
	public void inOrderTraversal_Stack(Node root){
		Stack<Node> stack = new Stack<>();
		Node node = root;
		while(node !=null){
			stack.push(node);
			node = node.left;
		}
		
		while (stack.size() > 0){
			node = stack.pop();
			
			System.out.print(node.val +", ");
			
			if(node.right != null){
				node = node.right;
				while(node !=null){
					stack.push(node);
					node = node.left;
				}
				
			}
		}
	}
	
	public void inOrderTraversal(Node node){
		if(node == null) return;
		inOrderTraversal(node.left);
		System.out.print(node.val+", ");
		inOrderTraversal(node.right);
	}
	
	public void preOrderTraversal_Stack(Node root){
		Node node = root;
		Stack<Node> stack = new Stack<>();
		
		if(node == null) return;
		else stack.push(root);
		
		while(stack.size() >0){
			node =stack.pop();
			
			System.out.print(node.val+" ,");
			if(node.right != null)
				stack.push(node.right);
			if(node.left !=null)
				stack.push(node.left);
		}
	}
	
	public void preOrderTraversal(Node node){
		if(node == null) return;
		System.out.print(node.val+", ");
		preOrderTraversal(node.left);
		preOrderTraversal(node.right);
	}
	
	public ArrayList<Node> postOrderTraversal_Stack(Node root){
		ArrayList<Node> list = new ArrayList<>();
		
		Stack<Node> stack = new Stack<>();
		stack.push(root);
		
		Node prev = null;
		while(stack.size() >0){
			Node current = stack.peek();
			
			if(prev ==null || prev.left == current || prev.right == current){
				if(current.left !=null )
					stack.push(current.left);
				else if(current.right !=null )
					stack.push(current.right);
				else{
					stack.pop();
					list.add(current);
				}
			}
			
			else if(current.left == prev){
				if(current.right != null){
					stack.push(current.right);
				}else{
					stack.pop();
					list.add(current);
				}
			}
			else if(current.right == prev){
					stack.pop();
					list.add(current);
			}
			
			prev=current;
		}
		return list;
	}
	
	public void levelTraversal(Node root){
		int height = height(root);
		
		for(int i=1;i<=height;i++){
			bfs(root,i);
		}
	}
	private void bfs(Node root, int level) {
		if(root == null) return;
		if(level == 1) System.out.println(root.val);
		else{
			bfs(root.left,level-1);
			bfs(root.right,level-1);
		}
	}

	public int height(Node root){
		 if(root == null) return 0;
		 else{
			 int lheight = height(root.left);
			 int rheight = height(root.right);
			 
			 if( lheight > rheight){
				 return lheight+1;
			 }
			 else{
				 return rheight+1;
			 }
		 }
	}
	
	public void bfs_Queue(Node root){
		if(root == null) return;
		
		Node node = root;
		Queue<Node> queue = new LinkedList<>();
		
		queue.offer(node);
		
		while(! queue.isEmpty()){
			node = queue.poll(); 
			System.out.print(node.val+" , ");
			if(node.left != null)
			queue.offer(node.left);
			if(node.right != null)
			queue.offer(node.right);
		}
	}
	
	public void leastCommonAncestor(Node head){
		ArrayList<Node> path1 = new ArrayList<>();
		ArrayList<Node> path2 = new ArrayList<>();
		
		findPath(head, path1, 4);
		findPath(head, path2, 3);
		
		int i=0,j=0;
		while(i < path1.size() && j < path2.size()){
			if(path1.get(i).val == path2.get(i).val){
				i++;
				j++;
			}
			else
				break;
		}
		
		System.out.println("Common Ancestor = "+path1.get(i-1).val);
	}
	
	public boolean findPath(Node node, ArrayList<Node> path, int search){
		if(node == null) return false;
		
		path.add(node);
		
		if(node.val == search){
			return true;
		}
		
		if(node.left != null && findPath(node.left, path , search)) return true;
		if(node.right != null && findPath(node.right, path , search)) return true;
		
		path.remove(path.size()-1);
		return false;
	}
}
