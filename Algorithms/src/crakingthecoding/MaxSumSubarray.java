package crakingthecoding;

public class MaxSumSubarray {
	public static void main(String[] args) {
		int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
		int maxSum = MaxSumSubarray.maxSum(arr);
		System.out.println("Maximum Sum = "+maxSum);
	}
	public static int maxSum(int[] arr){
		int max=Integer.MIN_VALUE;
		int sum=0;
		
		for(int i=0;i<arr.length;i++){
			sum=Math.max(arr[i], sum+arr[i]);
			max=Math.max(max, sum);
		}
		return max;
	}
}
