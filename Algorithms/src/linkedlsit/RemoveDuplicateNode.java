package linkedlsit;

public class RemoveDuplicateNode {

	public static void main(String[] args) {
		Node<String> headNode = new Node<>();
		headNode.setValue("2");
		Node<String> newNode =null;
		newNode=createNode("2",headNode);
		newNode=createNode("4",newNode);
		newNode=createNode("5",newNode);
		
		RemoveDuplicateNode remove = new RemoveDuplicateNode();
		remove.removeDuplicates(headNode);
		
		while(headNode.hasNext()){
			System.out.println(headNode.getValue());
			System.out.println(headNode.nextNode);
		}
		System.out.println(headNode.getValue());

	}
	
	public static Node<String> createNode(String value, Node<String> prevNode){
		Node<String> newNode = new Node<>();
		newNode.setValue(value);
		prevNode.setNextNode(newNode); 
		return newNode;
	}
	Node<String> removeDuplicates(Node<String> head)
    {
	// Your code here
	  Node<String> currNode= head;
	  Node<String> nextNode=null;
	  while(currNode.hasNext()){
	      nextNode = currNode.getNext();
	      while(nextNode !=null && currNode.getValue() == nextNode.getValue()){
	          nextNode = nextNode.getNext();
	      }
	      currNode.setNextNode(nextNode);
	  }
	  return head;
    }
}
