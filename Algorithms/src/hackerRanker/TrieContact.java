package hackerRanker;

import java.util.*;

public class TrieContact {

	class Item{
        char ch;
        int wordCount=0;
        Item(char ch){
        	this.ch=ch;
        	this.wordCount=1;
        }
    }
    class Node<T>{
        Node<T>[] node =new Node[26];
    }

	Node<Item> trieNode = new Node();

	public void performOp(String op, String contact) {
		Node<Item> tempTrieNode = trieNode;
		switch (op) {
		case "add":

			for (char c : contact.toCharArray()) {
				int val = c - 97;
				if (tempTrieNode.node[val] == null){
					Item i = new Item(c);
					tempTrieNode.node[val] = new Node<Item>();
				}
				tempTrieNode = tempTrieNode.node[val];
			}
			break;
		case "find":
			int tempWordCount = 0;
			for (char c : contact.toCharArray()) {
				int val = c - 97;
				if (tempTrieNode.node[val] != null) {
					//tempWordCount = tempTrieNode.;
					//tempTrieNode = tempTrieNode.node[val];
				} else {
					tempWordCount = 0;
					break;
				}
			}
			System.out.println("Find "+contact+", count = "+tempWordCount);
			break;
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		TrieContact tc = new TrieContact();
		for (int a0 = 0; a0 < n; a0++) {
			String op = in.next();
			String contact = in.next();
			tc.performOp(op, contact);
		}
	}
}
