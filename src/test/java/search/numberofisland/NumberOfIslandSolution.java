package search.numberofisland;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/*

https://leetcode.com/problems/number-of-islands/

Given an m x n 2d grid map of '1's (land) and '0's (water), return the number of islands.

An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically. You may assume all four edges of the grid are all surrounded by water.

 

Example 1:

Input: grid = [
  ["1","1","1","1","0"],
  ["1","1","0","1","0"],
  ["1","1","0","0","0"],
  ["0","0","0","0","0"]
]
Output: 1

Example 2:

Input: grid = [
  ["1","1","0","0","0"],
  ["1","1","0","0","0"],
  ["0","0","1","0","0"],
  ["0","0","0","1","1"]
]
Output: 3

 

Constraints:

    m == grid.length
    n == grid[i].length
    1 <= m, n <= 300
    grid[i][j] is '0' or '1'.


*/
public class NumberOfIslandSolution {

    public int numIslands(char[][] grid) {

        if (grid == null || grid.length == 0 || grid[0].length == 0) {
            return 0;
        }

        int m = grid.length;
        int n = grid[0].length;

        int count = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == '1') {
                    count++;
                    checkOtherPlaces(grid, i, j);
                }
            }
        }

        return count;
    }

    void checkOtherPlaces(char[][] grid, int row, int column) {
        int m = grid.length;
        int n = grid[0].length;

        if (row < 0 || column < 0 || row >= m || column >= n || grid[row][column] != '1') {
            return;
        }

        grid[row][column] = 'X';

        checkOtherPlaces(grid, row - 1, column);
        checkOtherPlaces(grid, row + 1, column);
        checkOtherPlaces(grid, row, column - 1);
        checkOtherPlaces(grid, row, column + 1);
    }

}

class NumberOfIslandSolutionTest {

    private NumberOfIslandSolution numberOfIsland = new NumberOfIslandSolution();

    @Test
    @DisplayName("return the number 5 of island ona given matrix")
    void shouldReturn5NumberOfIsland() {
        int num = numberOfIsland.numIslands(new char[][] { { '1', '0', '1' }, { '0', '1', '0' }, { '1', '0', '1' } });
        assertThat(num).isEqualTo(5);
    }

    @Test
    @DisplayName("return the number 3 of island ona given matrix")
    void shouldReturn3NumberOfIsland() {
        int num = numberOfIsland.numIslands(new char[][] { 
            { '1', '1', '1' }, 
            { '0', '1', '0' }, 
            { '1', '0', '1' } });

        assertThat(num).isEqualTo(3);
    }

    // todo add more test

}