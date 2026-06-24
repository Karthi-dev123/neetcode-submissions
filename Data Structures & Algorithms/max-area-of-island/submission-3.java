class Solution {
    int max = 0 ;

    public int maxAreaOfIsland(int[][] grid) {
      // this is just like the number of island problem , but the only thing is that 
      // this time , we gon have to track the max area and return that 

      // so if u've solved the number of islands problem , this can be like a lil test on how well u get it
        // lets ttry to do with the more optimised approach 
        for(int r = 0 ; r < grid.length ; r++){
            for(int c = 0 ; c < grid[0].length;c++){
                if(grid[r][c] == 1){


                    max = Math.max(dfs(r,c,grid) , max);

                    
                }
            }
        }
        return max;
    }

    public int dfs(int row , int col , int[][] grid){

        if(row < 0 || col < 0 ||
           row >= grid.length || col >= grid[0].length ||
           grid[row][col] == 0
        )
        {
            
            return 0; 
        }

        grid[row][col] = 0;
        
        // do up down right left 
        return 1 + 
        dfs(row-1,col,grid) + 
        dfs(row+1,col,grid) +
        dfs(row,col-1,grid) + 
        dfs(row,col+1,grid);
        
        // if( counter > max ) max = counter;
        // counter = 0 ;

        
    }

}
