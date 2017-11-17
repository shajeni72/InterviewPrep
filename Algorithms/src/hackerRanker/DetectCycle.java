package hackerRanker;

class Node {
    int data;
    Node next;
}

public class DetectCycle {
	public static void main(String[] args) {
		Node head = new Node();
		head.data = 1;
		
		/*head.next = new Node();
		head.next.data=2;
		
		head.next.next=new Node();
		head.next.next.data=3;
		
		head.next.next.next=head.next;
		*/
		DetectCycle dc = new DetectCycle();
		System.out.println(dc.hasCycle(head));
	}
	boolean hasCycle(Node head) {
		   if(head == null) return false;
		   if(head.next == null) return false;

		   Node slow=head;
		   Node fast=head;
		    
		   while(slow !=null && fast.next !=null){
		       slow=slow.next; 
		       fast=fast.next.next;
		       
		       if(slow!=null && fast!= null && slow == fast){
		           return true;
		       }
		   }
		    return false;
		}
}
