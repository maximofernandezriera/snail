package edu.maximofernandez;

import org.junit.Assert;
import org.junit.Test;

public class SnailTests {
    @Test
    public void SnailBasicTests() {
        int[][] array
                = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        int[] r = {1, 2, 3, 6, 9, 8, 7, 4, 5};
        test(array, r);
    }

    public String int2dToString(int[][] a) {
        StringBuilder sb = new StringBuilder();
        for (int[] innerArray : a) {
            for (int i : innerArray) {
                sb.append(i).append(", ");
            }
            // Remove the trailing comma and space
            if (!sb.isEmpty()) {
                sb.setLength(sb.length() - 2);
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public void test(int[][] array, int[] result) {
        String text = int2dToString(array) + " should be travelled to " + intArrayToString(result);
        System.out.println(text);
        Assert.assertArrayEquals(result, SnailSort.snail(array));
    }

    public String intArrayToString(int[] a) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i : a) {
            sb.append(i).append(", ");
        }
        // Remove the trailing comma and space
        if (sb.length() > 1) {
            sb.setLength(sb.length() - 2);
        }
        sb.append("]");
        return sb.toString();
    }
}
