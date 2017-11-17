package linkedlsit;

public class RemoveDuplicateFromUnsorted {
	public static void main(String[] args) {
		Node<String> headNode = new Node<>();
		headNode.setValue("2");
		Node<String> newNode =null;
		newNode=createNode("2",headNode);
		newNode=createNode("4",newNode);
		newNode=createNode("5",newNode);
		
		RemoveDuplicateFromUnsorted.removeDuplicateNode(headNode);
		System.out.println("--");
		
		while(headNode.hasNext()){
			System.out.print(headNode.getValue());
			headNode = headNode.nextNode;
		}
		System.out.println(headNode.getValue());

	}
	public static Node<String> createNode(String value, Node<String> prevNode){
		Node<String> newNode = new Node<>();
		newNode.setValue(value);
		prevNode.setNextNode(newNode); 
		return newNode;
	}
	public static void removeDuplicateNode(Node<String> headNode){
		Node<String> prev = headNode;
		Node<String> current = headNode.getNext();
		Node<String> runner = null;
		
		while(current  !=null){
			runner = headNode;
			while(runner != current){
				if(runner.getValue() == current.getValue()){
					Node<String> temp = current.getNext();
					prev.setNextNode(temp);
					current = temp;
					break;
				}
				runner = runner.getNext();
			}
			if(runner == current){
				prev = current;
				current = current.getNextNode();
			}
		}
	}
}
