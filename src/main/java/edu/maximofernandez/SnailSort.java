package edu.maximofernandez;
public class SnailSort {
    /**
     * This method takes a 2D array and returns a 1D array with the elements arranged in a snail pattern.
     * The snail pattern starts from the top left corner, moves right to the end of the row, then down to the bottom of the column,
     * then left to the start of the row, then up to the top of the column, and so on, until all elements have been visited.
     *
     * @param array The 2D array to be converted into a snail pattern.
     * @return A 1D array with the elements of the input array arranged in a snail pattern.
     */
    public static int[] snail(int[][] array) {
        // If the input array is empty, return an empty array
        if (array[0].length == 0) return new int[0];
        // The length of the sides of the square array
        int n = array.length;
        // The result array with length n*n
        int[] result = new int[n * n];
        // Initialize the indices for the top, bottom, left, and right boundaries of the snail pattern
        int i = 0;
        int top = 0, bottom = n - 1, left = 0, right = n - 1;
        // Continue the loop as long as there are unvisited elements in the array
        while (top <= bottom && left <= right) {
            // Move right along the top row
            for (int j = left; j <= right && top <= bottom; j++) result[i++] = array[top][j];
            top++;
            // Move down along the right column
            for (int j = top; j <= bottom && left <= right; j++) result[i++] = array[j][right];
            right--;
            // Move left along the bottom row
            for (int j = right; j >= left && top <= bottom; j--) result[i++] = array[bottom][j];
            bottom--;
            // Move up along the left column
            for (int j = bottom; j >= top && left <= right; j--) result[i++] = array[j][left];
            left++;
        }
        // Return the result array
        return result;
    }
}