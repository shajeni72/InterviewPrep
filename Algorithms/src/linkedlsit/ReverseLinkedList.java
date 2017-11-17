package linkedlsit;

public class ReverseLinkedList {

	public void reverseList(Node<String> linkedList){
		Node<String> currNode = linkedList;
		Node<String> nextNode = null;
		Node<String> prevNode = null;
		Node<String> headNode = linkedList;
		while(currNode.hasNext()){
			nextNode = linkedList.getNext();
			currNode.nextNode = prevNode;
			prevNode = currNode;
			currNode = nextNode;
		}
		headNode = prevNode;
	}
}
