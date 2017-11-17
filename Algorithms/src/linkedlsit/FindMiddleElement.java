package linkedlsit;

public class FindMiddleElement {
	public Node<String> middleNode(Node<String> linkedList){
		Node<String> slow= linkedList;
		Node<String> fast = linkedList;
		while(fast != null && fast.getNext() != null){
			slow=linkedList.getNext();
			fast=slow.getNext();
		}
		return slow;
	}
}

