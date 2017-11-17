package hackerRanker;

import java.util.*;
import java.lang.*;
import java.io.*;

public class CheckSubArray {
	    int arr1[];
	    int arr2[];
		public static void main (String[] args) {
			//code
			Scanner sc = new Scanner(System.in);
			int testcase = sc.nextInt();
			for(int i=0;i<testcase; i++){
				CheckSubArray c = new CheckSubArray();
			    int n1=sc.nextInt();
	    		c.arr1 = new int[n1];
	    		int n2=sc.nextInt();
	    		c.arr2 = new int[n2];
	    		for(int j=0;j<n1;j++){
	    			c.arr1[j] = sc.nextInt();
	    		}
	    		for(int j=0;j<n2;j++){
	    			c.arr2[j] = sc.nextInt();
	    		}
	    		
	    		String result = c.isSubArray();
	    		System.out.println(result);
			}
		}
		
		public String isSubArray(){
		    int check[]=new int[100000];
		    
		    for(int i:arr1){
		        check[i] = 1;
		    }
		    
		    for(int i:arr2){
		        if(check[i] == 1)
		          continue;
		        else
		          return "No";
		    }
		    
		    return "Yes";
		}
	}
