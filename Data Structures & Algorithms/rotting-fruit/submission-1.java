class Solution {
    public int orangesRotting(int[][] grid) {
        int rows = grid.length, cols = grid[0].length;
        Queue<int[]> queue = new ArrayDeque<>();
        int fresh = 0, minutes = 0;

        // Collect all initial rotten fruits as BFS sources.
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if (grid[row][col] == 2) queue.offer(new int[]{row, col});
                else if (grid[row][col] == 1) fresh++;
            }
        }

        int[][] directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

        // Each BFS level represents one minute.
        while (!queue.isEmpty() && fresh > 0) {
            int levelSize = queue.size();

            while (levelSize-- > 0) {
                int[] cell = queue.poll();

                for (int[] direction : directions) {
                    int newRow = cell[0] + direction[0];
                    int newCol = cell[1] + direction[1];

                    if (newRow < 0 || newRow >= rows ||
                        newCol < 0 || newCol >= cols ||
                        grid[newRow][newCol] != 1) {
                        continue;
                    }

                    // Rot the fresh fruit and process it next minute.
                    grid[newRow][newCol] = 2;
                    fresh--;
                    queue.offer(new int[]{newRow, newCol});
                }
            }
            minutes++;
        }

        return fresh == 0 ? minutes : -1;
    }
}
