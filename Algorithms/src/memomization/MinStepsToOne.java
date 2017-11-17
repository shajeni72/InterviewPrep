package memomization;

import java.util.Arrays;

public class MinStepsToOne {

	public static void main(String[] args) {
		MinStepsToOne min = new MinStepsToOne();
		
		int r = min.getMinSteps(4);
		System.out.println("R = "+r);
		
	}
	int[] memo = new int[5];
	public int getMinSteps(int n){
		if(n == 0) return 0;
		if(memo[n] !=0 )return memo[n];
		int  r= 1+ getMinSteps(n-1);
		if(n%2 == 0){ r = Math.min(r, getMinSteps(n/2));}
		if(n%3 == 0){ r = Math.min(r, getMinSteps(n/3));}
		System.out.println(n%2);
		memo[n]=r;
		Arrays.stream(memo).forEach(x -> System.out.print(x+" , "));
		System.out.println("n=,"+n+" r="+r);
		return r;
	}
}
