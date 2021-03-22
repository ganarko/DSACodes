package DP_codeNcode;

public class UniqueWaysToReach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int uniquePathsWithObstacles(int[][] grid) {
		    
	        int m = grid.length;
	        int n = grid[0].length;
	        
	        return uniquePaths(m,n,grid);
	    }
	 public int uniquePaths(int m, int n,int[][] grid){
	        
	        int[][] dp = new int [m][n];
	        dp[m-1][n-1]=1;
	        if(grid[m-1][n-1]==1 || grid[0][0]==1)return 0;
	        //last Column
	        for(int i=m-2;i>=0;i--){
	            dp[i][n-1] = (grid[i][n-1]!=1 && dp[i+1][n-1]!=0)?1:0;
	        }
	        //Last Row
	        for(int i=n-2;i>=0;i--){
	            dp[m-1][i] = (grid[m-1][i]!=1 && dp[m-1][i+1]!=0)?1:0;
	        }
	        
	        for(int i=m-2;i>=0;i--){
	            for(int j=n-2;j>=0;j--){
	                if(grid[i][j]!=1)   
	                    dp[i][j] = dp[i+1][j]+dp[i][j+1];
	            }
	        }
	     
	        return dp[0][0];
	    }

}
