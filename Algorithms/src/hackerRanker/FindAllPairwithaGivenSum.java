package hackerRanker;

import java.util.HashMap;
import java.util.Map;

public class FindAllPairwithaGivenSum {
	int[] arr1= {1 ,2 ,4 ,5 ,7};
	int[] arr2= {5 ,6, 3, 4 ,8};
	
	public static void main(String[] args) {
		FindAllPairwithaGivenSum c = new FindAllPairwithaGivenSum();
		c.findPairs(9);
	}
	public void findPairs(int n){
	    Map<Integer, Integer> map= new HashMap<>();
	    for(int i:arr1){
	        map.put(i,i);
	    }
	    
	    for(int i=0 ;i <arr2.length ; i++){
	        Integer diff = map.get(n - arr2[i]);
	        if(diff != null){
	            if(i>0)
	            System.out.print(",");
	            System.out.print(arr2[i] +" "+diff );
	        }
	    }
	}
}
