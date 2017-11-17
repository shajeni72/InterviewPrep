package geekforgeeks;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MaximumHistogram {
		Map<Character, Integer> numMap = new HashMap<>();
	
		public static void main(String args[]){
			MaximumHistogram m = new MaximumHistogram();
			System.out.println(m.solution("A2Le","2pL1"));
		}
		public void initMap(){
			numMap.put('0', 0);
	    	numMap.put('1', 1);
	    	numMap.put('2', 2);
	    	numMap.put('3', 3);
	    	numMap.put('4', 4);
	    	numMap.put('5', 5);
	    	numMap.put('6', 6);
	    	numMap.put('7', 7);
	    	numMap.put('8', 8);
	    	numMap.put('9', 9);
		}
	    public boolean solution(String S, String T) {
	        // write your code in Java SE 8
	    	initMap();
	    	
	    	List<Character> str1 = createSampleString(S);
	    	List<Character> str2 = createSampleString(T);
	    	
	    	if(str1 == null || str2 == null)
	    		return false;
	    	if(str1.size() != str2.size())
	    		return false;
	    	else{
	    		for(int i=0;i<str1.size();i++){
	    			if(str1.get(i) == '*' || str2.get(i) =='*')
	    				continue;
	    			else{
	    				if(str1.get(i) == str2.get(i))
	    					continue;
	    				else
	    					return false;
	    			}
	    		}
	    	}
	    	return true;
	    }
	    
	    public List<Character> createSampleString(String s){
	        List<Character> chList = new ArrayList<>();
	        int actualNumber=0;
	        int nextDigit = 1;
	        for(int i=0;i<s.length();i++){
	        	
	        	int ch = s.charAt(i);
	        	while(ch <= 57 && ch >=48){
	        		actualNumber = (nextDigit *actualNumber) + numMap.get(s.charAt(i));
	        		nextDigit = nextDigit*10;
	        		i++;
	        		if(i<s.length()){
	        			ch = s.charAt(i);
	        		}else{
	        			break;
	        		}
		        	
	        	}
	        	for(int j=0;j<actualNumber;j++)
	        		chList.add('*');
	        	if(i<s.length()){
		        	nextDigit = 1;
		        	actualNumber=0;
		        	chList.add(s.charAt(i));
	        	}else{
        			break;
        		}
	        }
	        return chList;
	    }
}