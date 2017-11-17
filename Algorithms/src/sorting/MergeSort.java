package sorting;
/**
 * Merge sort is a fast, stable sorting routine with guaranteed O(n*log(n)) efficiency. 
 * When sorting arrays, merge sort requires additional scratch space proportional to the size of the input array. 
 * Merge sort is relatively simple to code and offers performance typically only slightly below that of quicksort.
 * 
 * **/
public class MergeSort {
	int[] arr;
	int[] tempArr;
	int swap;
	
	public static void main(String args[]){
		int inputArr[]={9,2,5,1,3,8};
		MergeSort ms = new MergeSort();
		ms.doMerge(inputArr);
	}
	public void doMerge(int[] ipArr){
		arr = ipArr;
		tempArr = new int[arr.length];
		mergeSort(0,arr.length-1);
		for(int i=0;i<arr.length;i++) 
			System.out.println(arr[i]);
	}
	public void mergeSort(int lo, int hi){
		if(lo<hi){
			int mi = lo + (hi-lo)/2;
			mergeSort(lo,mi);
			mergeSort(mi+1, hi);
			mergeParts(lo, mi, hi);
		}
	}

	private void mergeParts(int lo, int mi, int hi) {
		for(int i=lo;i<=hi;i++){
			tempArr[i] = arr[i];
		}
		int i=lo;
		int j=mi+1;
		int k=lo;
		while(i<=mi && j<=hi){
			if(tempArr[i]<tempArr[j]){
				arr[k]=tempArr[i];
				i++;
			}else{
				arr[k]=tempArr[j];
				j++;
			}
			k++;
		}
		while(i<=mi){
			arr[k]=tempArr[i];
			i++;
			k++;
		}
	}

}
