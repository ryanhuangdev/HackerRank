/*
Function Description

Complete the function hourglassSum in the editor below. It should return an integer, the maximum hourglass sum in the array.

hourglassSum has the following parameter(s):

arr: an array of integers

Sample Input

1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 2 4 4 0
0 0 0 2 0 0
0 0 1 2 4 0
Sample Output

19
The hourglass with the maximum sum () is:

2 4 4
  2
1 2 4
 */

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class DS2DArray {

    // Complete the hourglassSum function below.
    static int hourglassSum(int[][] arr) {
        int largestSum = 0;
        int i, j;

        for (i = 0; i < arr.length - 2; i++) {
            for (j = 0; j < arr[0].length - 2; j++) {
                int tempSum = arr[i][j] + arr[i][j + 1] + arr[i][j + 2] + arr[i+1][j + 1] + arr[i + 2][j] + arr[i+2][j+1] + arr[i+2][j+2];

                if (i == 0 && j == 0) {
                    largestSum = tempSum;
                }

                if (tempSum > largestSum) {
                    largestSum = tempSum;
                }
            }
        }

        return largestSum;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        int result = hourglassSum(arr);
        System.out.println(result);
        scanner.close();
    }
}