package linkedin;

public class CountPossibleTriangle {

	public static void main(String[] args) {
		CountPossibleTriangle cpt = new CountPossibleTriangle();
		int array[] = {3,4,6,7};
		int noOfTriangle = cpt.countTrianlgeBruteForce(array);
		System.out.println(noOfTriangle);
		noOfTriangle = cpt.countTriangleSortedArray(array);
		System.out.println(noOfTriangle);
	}
	/**
	 * O(n3)
	 * **/
	public int countTrianlgeBruteForce(int[] sides){
		int countTriangle = 0;
		for(int i=0;i<sides.length;i++){
			int a = sides[i];
			for(int j=i+1;j<sides.length;j++){
				int b = sides[j];
				for(int k= j+1;k<sides.length;k++){
					int c = sides[k];
					if( a+b > c && c+b > a  && a+c > b )
						++countTriangle;
				}
			}
		}
		return countTriangle;
	}
	public int countTriangleSortedArray(int[] sides){
		int count = 0;
		for(int i=0;i<sides.length-2;i++){
			for(int j=i+1;j<sides.length;j++){
				int k=j+1;
				int a = sides[i];
				int b = sides[j];
				if(k< sides.length){
					int c = sides[k];
					if(a+b > c && c+b > a  && a+c > b )
						count ++;
				}
			}
		}
		return count;
	}
}
