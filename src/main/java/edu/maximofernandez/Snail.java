package edu.maximofernandez;

public class Snail {
    public static int[] snail(int[][] array) {
        if (array[0].length == 0) return new int[0];
        int n = array.length;
        int[] result = new int[n*n];
        int i = 0;
        int top = 0, bottom = n - 1, left = 0, right = n - 1;
        while (top <= bottom && left <= right) {
            for (int j = left; j <= right && top <= bottom; j++) result[i++] = array[top][j];
            top++;
            for (int j = top; j <= bottom && left <= right; j++) result[i++] = array[j][right];
            right--;
            for (int j = right; j >= left && top <= bottom; j--) result[i++] = array[bottom][j];
            bottom--;
            for (int j = bottom; j >= top && left <= right; j--) result[i++] = array[j][left];
            left++;
        }
        return result;
    }
}