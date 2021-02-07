package search.numberofisland;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/*
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
public class NumberOfIsland {

     public int numIslands(char[][] grid) {
        
        return 0;
    }
    
}


class NumberOfIslandTest {

    private NumberOfIsland numberOfIsland = new NumberOfIsland();

    @Test
    @DisplayName("return the number 5 of island ona given matrix")
    void shouldReturnNumberOfIsland(){
        
        int num = numberOfIsland.numIslands(new char[][] {
            {'1','0','1'},
            {'0','1','0'},
            {'1','0','1'}
        });
        assertThat(num).isEqualTo(5);
    }

    @Test
    @DisplayName("return the number 3 of island ona given matrix")
    void shouldReturn3NumberOfIsland() {
        int num = numberOfIsland.numIslands(new char[][] { 
            { '1', '1', '1' }, 
            { '0', '1', '0' }, 
            { '1', '0', '1' } 
        });

        assertThat(num).isEqualTo(3);
    }

    //todo add more test

}