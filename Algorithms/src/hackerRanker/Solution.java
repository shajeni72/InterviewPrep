package hackerRanker;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Solution {
	Map<String,Integer> magazineMap = new HashMap<>(); 
    Map<String,Integer> noteMap = new HashMap<>(); 
    String[] noteStore;
    
    public Solution(String magazine, String note) {
        String[] magazineStore = magazine.split("\\s");
        noteStore = note.split("\\s");
        
        for(String s:magazineStore){
            if(magazineMap.get(s) == null)
             magazineMap.put(s,1);
            else{
              int count = magazineMap.get(s);
              magazineMap.put(s,++count);
            }
        }
   
    }
    
    public boolean solve() {
       for(String s: noteStore){
    	   if(magazineMap.get(s) !=null && magazineMap.get(s) > 0){
    		   int count = magazineMap.get(s);
               magazineMap.put(s,--count);
    	   }else{
    		   return false;
    	   }
       }
       return true;
       
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Eat whitespace to beginning of next line
        //two times three is not fourscanner.nextLine();
        
        Solution s = new Solution(scanner.nextLine(), scanner.nextLine());
        scanner.close();
        
        boolean answer = s.solve();
        if(answer)
            System.out.println("Yes");
        else System.out.println("No");
      
    }
}