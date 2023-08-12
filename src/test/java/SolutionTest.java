import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class SolutionTest {
    @Test
    public void setZeroesTest1() {
        int[][] matrix = {
                {1, 1, 1},
                {1, 0, 1},
                {1, 1, 1}
        };
        int[][] expected = {
                {1, 0, 1},
                {0, 0, 0},
                {1, 0, 1}
        };
        new Solution().setZeroes(matrix);
        boolean answer = Arrays.deepEquals(matrix, expected);
        Assert.assertTrue(answer);
    }

    @Test
    public void setZeroesTest2() {
        int[][] matrix = {
                {0, 1, 2, 0},
                {3, 4, 5, 2},
                {1, 3, 1, 5}
        };
        int[][] expected = {
                {0, 0, 0, 0},
                {0, 4, 5, 0},
                {0, 3, 1, 0}
        };
        new Solution().setZeroes(matrix);
        boolean answer = Arrays.deepEquals(matrix, expected);
        Assert.assertTrue(answer);
    }
}
