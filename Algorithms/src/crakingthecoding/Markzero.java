package crakingthecoding;

/**
 * 1.7 Write an algorithm such that if an element in an MxN matrix is 0, its entire row and column is set to 0.
 * **/
public class Markzero {

	public static void main(String[] args) {
		int[][] matrix ={{1,0,2},{3,4,5},{6,7,8}};
		Markzero.markZero(matrix);
	}
	public static void markZero(int[][] arr){
		int[] row=new int[arr.length];
		int[] column=new int[arr[0].length];
		
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				if(arr[i][j]==0){
					row[i]=1;
					column[j]=1;
				}
			}
		}
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				if(row[i] == 1 || column[j]==1){
					arr[i][j]=0;
				}
			}
		}
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
		
	}
}
