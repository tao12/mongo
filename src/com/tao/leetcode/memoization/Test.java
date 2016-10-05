package com.tao.leetcode.memoization;

public class Test {
	public static void main(String[] args) {
		//int[][] input={{9,9,4},{6,6,8},{2,1,1}};
		int[][] input={{0},{1},{5},{5}};
		int result=longestIncreasingPath(input);
		System.out.println(result);
	}
	
	public static int longestIncreasingPath(int[][] matrix) {
        if(matrix==null || matrix.length==0) return 0;
        
        int m=matrix.length;
        int n=matrix[0].length;
        int result=0;
        
        int[][] cache=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                int value=dfs(matrix,i,j,cache,m,n);
                result=Math.max(result,value);
            }
        }
        
        return result;
    }
    
    public static int dfs(int[][] matrix, int i, int j, int[][] cache,int m, int n){
    	System.out.println("i="+i+" j="+j+" cache[i][j]="+cache[i][j]);
        if(cache[i][j] != 0) return cache[i][j];
        if(i<0 || i>m || j<0 || j>n) return 0;
        
        
        int a=1;
        int b=1;
        int c=1;
        int d=1;
        
        if(i+1<m && matrix[i+1][j] > matrix[i][j]){
            a=1+dfs(matrix,i+1,j,cache,m,n);
        }
        
        if(j+1<n && matrix[i][j+1] > matrix[i][j]){
            b=1+dfs(matrix,i,j+1,cache,m,n);
        }
        
        if(i-1>=0 && matrix[i-1][j] > matrix[i][j]){
            c=1+dfs(matrix,i-1,j,cache,m,n);
        }
        
        if(j-1>=0 && matrix[i][j-1] > matrix[i][j]){
            d=1+dfs(matrix,i,j-1,cache,m,n);
        }
        
        int value=Math.max(Math.max(Math.max(a,b),c),d);
        cache[i][j]=value;
        
        return value;
    }
}
