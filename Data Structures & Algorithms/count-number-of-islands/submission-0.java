class Solution {
    int counter = 0;
    //boolean[][] visited = new boolean[grid.length][grid[0].length];
    boolean[][] visited ;
    public int numIslands(char[][] grid) {
        // lets make a 2d visited array and set it as false 
        visited = new boolean[grid.length][grid[0].length];
        // for(int i = 0 ; i < grid.length;i++){
        //     for(int j = 0 ; j < grid[0].length;j++){
        //         visited[i][j] = false;
        //     }
        // }

        // now lets traverse through the 2d array , one cell at a time 
        // the only 2  thing we care abt 
        // 1. is that a land 
        // 2. is it NOT visited 
        // then go ahead and increment a counter and call dfs function to take care of rest 
        for(int i = 0 ; i < grid.length;i++){
            for(int j = 0 ; j < grid[0].length;j++){
                
                if(grid[i][j] == '1' && visited[i][j] == false){
                    counter += 1;
                    dfs(i,j,grid);
                }
            }
        }
        return counter;
    }

    public void dfs(int row , int col ,char[][] grid ){

        // test and add to the visited array 
        // if (row < grid.length && 
        //     row >= 0 && col >= 0 &&
        //     col < grid[0].length && 
        //     grid[row][col] == '1' &&
        //     visited[row][col] == false){
        //         counter++;
        //         visited[row][col] = true;
        //     }
        //     else{
        //         return;
        //     }

        if(row >=  grid.length || // invalid rows & cols 
             row < 0 || col < 0 || 
             col >= grid[0].length || 
             grid[row][col] == '0' || // water check 
            visited[row][col] == true // already visited check 
            ) return ;
        visited[row][col] = true;

        // now lets make recursive call of the 4 sides 
        dfs(row,col+1,grid);   // right 
        dfs(row,col-1,grid);      // left
        dfs(row-1,col,grid);      // up 
        dfs(row+1,col,grid);     // down

        return; 
    }
}
