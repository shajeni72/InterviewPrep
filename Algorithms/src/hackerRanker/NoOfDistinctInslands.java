package hackerRanker;

import java.util.HashSet;
import java.util.Set;

public class NoOfDistinctInslands {

	public static void main(String[] args) {
		NoOfDistinctInslands m = new NoOfDistinctInslands();
		int[][]grid ={{1,1,0},{0,1,1},{0,0,0},{1,1,1},{0,1,0}};
		
		int sum = m.numDistinctIslands(grid);
		System.out.println(sum);
	}
	
	public int numDistinctIslands(int[][] grid) {
		int row = grid.length;
        int col = grid[0].length;
        int[][] marked=new int[row][col];
        Set<String> set = new HashSet<>();
        for(int r=0;r<row;r++){
        	for(int c=0;c<col;c++)
                if(marked[r][c] == 0){
                    /* Check all four directions*/
                    String pattern = checkOne(grid,marked,r,c,r,c,new StringBuilder());
                    if(pattern.trim().length() >0){
                    	set.add(pattern);
                    }
                    }
            }
        return set.size();
    }
	
	public String checkOne(int[][]grid,int[][] marked,int offsetX,int offsetY,int r,int c,StringBuilder retChar){
        if(r<0 || c < 0 || r >grid.length-1 || c >grid[0].length-1 ) return "";
        if(grid[r][c] == 1 && marked[r][c] == 0){
        	   
                marked[r][c] = 1;
                retChar.append(Integer.toString(offsetX-r)+Integer.toString(offsetY-c));
                checkOne(grid,marked,offsetX,offsetY,r-1, c,retChar);
                checkOne(grid,marked,offsetX,offsetY,r+1, c,retChar);
                checkOne(grid,marked,offsetX,offsetY,r, c+1,retChar) ;
                checkOne(grid,marked,offsetX,offsetY,r, c-1,retChar);
                return retChar.toString();
            }else{
            	if(marked[r][c] == 0)
            		marked[r][c] = 1;
                return "";
            }
         
        }
}
