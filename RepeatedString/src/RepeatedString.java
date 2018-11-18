/*
Lilah has a string, s, of lowercase English letters that she repeated infinitely many times.

Given an integer, n, find and print the number of letter a's in the first n letters of Lilah's infinite string.

For example, if the string abcac and n=10, the substring we consider is abcacabcac, the first  characters of her infinite string.
There are 4 occurrences of a in the substring.

Function Description

Complete the repeatedString function in the editor below. It should return an integer representing the number of occurrences of a in the prefix of length  in the infinitely repeating string.

repeatedString has the following parameter(s):

s: a string to repeat
n: the number of characters to consider
Input Format

The first line contains a single string, s.
The second line contains an integer, n.

Constraints

For  of the test cases, s.
Output Format

Print a single integer denoting the number of letter a's in the first  letters of the infinite string created by repeating infinitely many times.

Sample Input 0

aba
10
Sample Output 0

7
Explanation 0
The first  letters of the infinite string are abaabaabaa. Because there are  a's, we print  on a new line.

Sample Input 1

a
1000000000000
Sample Output 1

1000000000000
 */

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class RepeatedString {

    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {
        long numAs = 0;
        long numRepeats = (long)Math.rint(n/s.length());
        long remainder = n % s.length();

        for (char c : s.toCharArray()) {
            if (c == 'a') {
                numAs++;
            }
        }

        numAs *= numRepeats;

        for (int i = 0; i < remainder; i++) {
            if (s.toCharArray()[i] == 'a') {
                numAs++;
            }
        }

        return numAs;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        String s = scanner.nextLine();

        long n = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long result = repeatedString(s, n);
        System.out.println(result);
        scanner.close();
    }
}