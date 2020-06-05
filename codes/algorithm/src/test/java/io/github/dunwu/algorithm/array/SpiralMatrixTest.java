package io.github.dunwu.algorithm.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * @author Zhang Peng
 * @since 2018-11-05
 */
public class SpiralMatrixTest {

    @Test
    public void test() {
        int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int[][] matrix2 = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };

        Integer[] expected = { 1, 2, 3, 6, 9, 8, 7, 4, 5 };
        Integer[] expected2 = { 1, 2, 3, 4, 8, 12, 16, 15, 14, 13, 9, 5, 6, 7, 11, 10 };

        List<Integer> results = SpiralMatrix.spiralOrder(matrix);
        List<Integer> results2 = SpiralMatrix.spiralOrder(matrix2);

        Assertions.assertArrayEquals(expected, results.toArray());
        Assertions.assertArrayEquals(expected2, results2.toArray());
    }

}
