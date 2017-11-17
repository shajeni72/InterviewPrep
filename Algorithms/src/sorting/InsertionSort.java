package sorting;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String args[]){
		InsertionSort is=new InsertionSort();
		int[] sorted =is.insertionSort(new int[]{4,20,8,35,1});
		Arrays.stream(sorted).forEach(n ->System.out.print(n+"\t"));
	}
	public int[] insertionSort(int[] arr){
		int swap =0;
		for(int i=1;i<arr.length;i++){
			for(int j=i;j>0;j--){
				if(arr[j] < arr[j-1]){
					swap = arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=swap;
				}
			}
		}
		return arr;
	}
}
