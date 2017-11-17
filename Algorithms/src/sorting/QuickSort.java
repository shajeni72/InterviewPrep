package sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class QuickSort {

	private int arr[]={4,20,8,35,1};
	public static void main(String ars[]){
		QuickSort qs = new QuickSort();
		qs.quicksort(0, qs.arr.length-1);
		List<Map<String,Integer>> wordReference = new ArrayList<>();
		Arrays.stream(qs.arr).forEach(n -> System.out.print(n+"\t"));
	}
	public void quicksort(int lo,int hi){
		int i=lo;
		int j=hi;
		int swap;
		
		int pivot=arr[lo+(hi-lo)/2];
		
		while(i<=j){
			while(arr[i] < pivot){
				i++;
			}
			while(arr[j] > pivot){
				j--;
			}
			if(i<=j){
				swap = arr[i];
				arr[i]=arr[j];
				arr[j]=swap;
				i++;
				j--;
			}
		}
		
		if(lo <j){
			quicksort(lo,j);
		}
		if(i<hi){
			quicksort(i,hi);
		}
	}
}
