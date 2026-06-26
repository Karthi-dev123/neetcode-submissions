


class Solution {
    public void islandsAndTreasure(int[][] grid) {

        // Edge cases
        if (grid == null || grid.length == 0 || grid[0].length == 0)
            return;

        int rows = grid.length;
        int cols = grid[0].length;

        Queue<int[]> queue = new ArrayDeque<>();

        // Add all gates to the queue (Multi-Source BFS)
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (grid[r][c] == 0) {
                    queue.add(new int[] { r, c });
                }
            }
        }

        // Four directions: Up, Down, Right, Left
        int[][] dirs = {
            {-1, 0},
            { 1, 0},
            { 0, 1},
            { 0,-1}
        };

        // BFS
        while (!queue.isEmpty()) {

            int[] cell = queue.poll();
            int row = cell[0];
            int col = cell[1];

            for (int[] dir : dirs) {

                int newRow = row + dir[0];
                int newCol = col + dir[1];

                // Out of bounds
                if (newRow < 0 || newRow >= rows ||
                    newCol < 0 || newCol >= cols) {
                    continue;
                }

                // Skip walls and already visited cells.
                // We ONLY process INF cells.
                if (grid[newRow][newCol] != Integer.MAX_VALUE) {
                    continue;
                }

                // Update distance
                grid[newRow][newCol] = grid[row][col] + 1;

                // Continue BFS from this newly discovered room
                queue.add(new int[] { newRow, newCol });
            }
        }
    }
}