package linkedin;

public class MinDistanceBetweenWords {
	public static void main(String[] args) {
		MinDistanceBetweenWords minDis = new MinDistanceBetweenWords();
		int[] arr = {2, 5, 3, 5, 4, 4, 2, 3};
		int distance = minDis.minDistanceBetweenWords(arr, 3, 2);
		System.out.println(distance);
	}
	public int minDistanceBetweenWords(int[] arr,int x,int y){
		int idx1 =0;
		int idx2 = -1;
		int min = Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++){
		 if(arr[i] == x) idx1=i;
		 if(arr[i] == y) idx2=i;
		 if(idx1 > 0 && idx2 > 0)
			 min = min < Math.abs(idx2 - idx1)  ?  min : Math.abs(idx2 - idx1) ;
		}
		return min;
	}
}
