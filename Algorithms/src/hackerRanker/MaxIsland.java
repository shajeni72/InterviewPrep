package hackerRanker;

public class MaxIsland {
	public static void main(String[] args) {
		MaxIsland m = new MaxIsland();
		int[][]grid ={{0},{1}};
		
		int sum = m.maxAreaOfIsland(grid);
		System.out.println(sum);
	}
	    public int maxAreaOfIsland(int[][] grid) {
	        int row = grid.length;
	        int col = grid[0].length;
	        int[][] marked=new int[row][col];
	        int maxSum = 0;
	        int sum=0;
	        int r=0,c=0;
	        while(r<row){
	        	c=0;
	            while(c<col){
	                if(marked[r][c] == 0){
	                    /* Check all four directions*/
	                    sum = checkOne(grid,marked,r,c);
	                    maxSum = Math.max(sum,maxSum);
	                }
	                c++;
	            }
	            r++;
	        }
	        return maxSum;
	    }
	    
	    public int checkOne(int[][]grid,int[][] marked,int r,int c){
	        if(r<0 || c < 0 || r >grid.length-1 || c >grid[0].length-1 ) return 0;
	        if(grid[r][c] == 1 && marked[r][c] == 0){
	                marked[r][c] = 1;
	                return 1 + checkOne(grid,marked,r-1, c) + checkOne(grid,marked,r+1, c) + checkOne(grid,marked,r, c+1)+checkOne(grid,marked,r, c-1);
	            }else{
	            	if(marked[r][c] == 0)
	            		marked[r][c] = 1;
	                return 0;
	            }
	        }
}
