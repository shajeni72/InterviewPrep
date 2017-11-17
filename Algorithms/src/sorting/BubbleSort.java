package sorting;

import java.util.Arrays;

public class BubbleSort {
	int[] arr;
	int[] tempArr;
	int swap;
	
	public static void main(String args[]){
		int inputArr[]={9,2,5,1,3,8};
		BubbleSort bs = new BubbleSort();
		bs.bubbleSort(inputArr);
	}
	
	public void bubbleSort(int[] arr){
		for(int i=0;i<arr.length;i++)
			for(int j=i+1;j<arr.length;j++){
				if(arr[i] > arr[j]){
					int swap = arr[i];
					arr[i] = arr[j];
					arr[j] = swap;
				}
				Arrays.stream(arr).forEach(n ->System.out.print(n+"\t"));
				System.out.println();
			}
		System.out.println(Arrays.toString(arr));
	}
}
