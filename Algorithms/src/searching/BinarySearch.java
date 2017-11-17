package searching;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BinarySearch {
	public static void main(String[] args) {
		BinarySearch bs = new BinarySearch();
		int[] arr={2, 3, 4, 10, 40};
		int index = bs.binarySearch(arr, 0, arr.length, 10);
		System.out.println(index);
		
		System.out.println(bs.buildInteger("27.67"));
	}
	
    Map<Character, Integer> strToNum = new HashMap<>();

	public double buildInteger(String s){
		List<Integer> list = new ArrayList<>();
        
        for(int i=0;i<13;i++)
            list.add(i);
        
        Collections.sort(list,(o1,o2) ->  Integer.toString(o1).compareTo(Integer.toString(o2)));
        
        
		strToNum.put('1', 1);
		strToNum.put('2', 2);
		strToNum.put('3', 3);
		strToNum.put('4', 4);
		strToNum.put('5', 5);
		strToNum.put('6', 6);
		strToNum.put('7', 7);
		strToNum.put('8', 8);
		strToNum.put('9', 9);
		strToNum.put('0', 0);
        char[] ch = s.toCharArray();
        double num=0;
        int decimalIdx = -1;
        double decimal=1;
        //01234
        //27.67
        for(int i=0;i<s.length(); i++){
            if(ch[i] == '.'){
                decimalIdx = i; //2
                continue;
            }
            if(decimalIdx >-1){
                decimal *=.1;//.01*7 = .07
                num +=decimal*strToNum.get(ch[i]);
            }
            else{
                num += strToNum.get(ch[i]);
                if(i<s.length()-1 && ch[i+1]!='.'){
                    num *=10;
                }
            }
        }
        
        return num;
    }

	public int binarySearch(int[] arr,int lo,int hi,int search){
		int mi = lo + (hi-lo)/2;
		if(arr[mi] == search) return mi;
		else if(arr[mi] < search) return binarySearch(arr, mi+1, hi, search);
		else return binarySearch(arr,lo,mi-1,search);
	}
}
class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
}
class GfG
{
    Node removeDuplicates(Node head)
    {
	// Your code here
	  Node currNode= head;
	  Node nextNode=null;
	  while(currNode.next !=null){
	      nextNode = currNode.next;
	      while(nextNode !=null && currNode.data == nextNode.data){
	          nextNode = nextNode.next;
	      }
	      currNode.next = nextNode;
	  }
	  return head;
    }
}