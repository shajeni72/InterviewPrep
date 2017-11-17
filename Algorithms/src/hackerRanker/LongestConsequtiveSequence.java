package hackerRanker;

import java.util.*;
import java.lang.*;
import java.io.*;

class LongestConsequtiveSequence {
    int arr[];

	public static void main (String[] args) {
		int check[]=new int[100000];
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of Test Cases : ");
		int testcase = sc.nextInt();
		for(int i=0;i<testcase; i++){
			LongestConsequtiveSequence c = new LongestConsequtiveSequence();
    		System.out.println("Enter size of Array: ");
    		int n=sc.nextInt();
    		c.arr = new int[n];
    		for(int j=0;j<n;j++){
    			c.arr[j] = sc.nextInt();
    		}
    		c.quicksort(0,c.arr.length-1);
    		int seqSum =0;
    		int maxSeqSum=0;
    		
    		for(int k=0;k<c.arr.length-1;k++){
    		    if(Math.abs(c.arr[k]-c.arr[k+1]) == 1){
    		     if(seqSum == 0) seqSum = 1;
    		    	 seqSum ++;
    		    }
    		    else{
    		        if(seqSum > maxSeqSum)
    		         maxSeqSum = seqSum;
    		        seqSum = 0;
    		    }
    		}
    		System.out.println(maxSeqSum);
		}
		
	}
	
	public void quicksort(int lo,int hi){
	    int i=lo;
	    int j=hi;
	    int pivot = arr[lo + (hi-lo)/2];
	    while(i<=j){
		    while(this.arr[i] < pivot){
		        i++;
		    }
		    while(this.arr[j] > pivot){
		        j--;
		    }
		    
		    if(i <= j){
		    	int swap = arr[i];
		    	arr[i]=arr[j];
		    	arr[j]=swap;
		    	i++;
		    	j--;
		    }
		    if(lo<j){
		    	quicksort(lo,j);
		    }
		    if(i<hi){
		    	quicksort(i,hi);
		    }
	    }
	}
}
