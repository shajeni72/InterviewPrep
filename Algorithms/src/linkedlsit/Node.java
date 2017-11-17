package linkedlsit;


class Node<T>{
	Node<T> nextNode;
	T value;
	public Node<T> getNextNode() {
		return nextNode;
	}
	public void setNextNode(Node<T> nextNode) {
		this.nextNode = nextNode;
	}
	public T getValue() {
		return value;
	}
	public void setValue(T value) {
		this.value = value;
	}
	
	public boolean hasNext(){
		if(this.nextNode != null) return true;
		return false;
	}
	public Node<T> getNext(){
		if(this.hasNext()) return this.nextNode;
		return null;
	}
}