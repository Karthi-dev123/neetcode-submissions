class Solution {
    
    public void islandsAndTreasure(int[][] grid) {
        Queue<int[]> queue = new ArrayDeque<>();
        if(grid == null || grid.length == 0 || grid[0].length == 0) return ;

        for(int r = 0 ; r < grid.length ; r++){
            for(int c = 0 ; c < grid[0].length ; c++){
                // locating gates i.e treasures 
                if(grid[r][c] == 0){
                    queue.add(new int[] {r,c});
                }
            }
        }

        int[][] moves = new int[][] { 
            {1,0},
            {-1,0},
            {0,-1},
            {0,1}
        };

        while(!queue.isEmpty()){
            int[] cells = queue.poll();
            int row = cells[0];
            int col = cells[1];

            

            for(int[] i: moves){
                int r = row + i[0];
                int c = col + i[1];

                if(r < 0 || r >= grid.length ||
                   c < 0 || c >= grid[0].length) continue ;

                if(grid[r][c] != Integer.MAX_VALUE ) continue;

                grid[r][c] = grid[row][col] + 1;

                queue.add(new int[] {r,c});






            }
        }
    }
}
