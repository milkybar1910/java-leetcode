// Given a non-empty array of decimal digits representing a non-negative integer, 
// increment one to the integer.

// The digits are stored such that the most significant digit is at the head of the list, 
// and each element in the array contains a single digit.
// Example 1:

// Input: digits = [1,2,3]
// Output: [1,2,4]
// Explanation: The array represents the integer 123.
// Example 2:

// Input: digits = [4,3,2,1]
// Output: [4,3,2,2]
// Explanation: The array represents the integer 4321.
// Example 3:

// Input: digits = [0]
// Output: [1]
// You may assume the integer does not contain any leading zero, except the number 0 itself.

package PLUS_ONE;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] digits = { 9 };
        int i;
        for (i = digits.length - 1; i >= 0; i--) {
            if ((digits[i] + 1) != 10) {
                digits[i] += 1;
                break;
            } else {
                digits[i] = 0;
            }
        }
        if (i == -1) {
            int[] digit1 = new int[digits.length + 1];
            digit1[0] = 1;
            for (int j = 1; j < digits.length + 1; j++) {
                digit1[j] = digits[j - 1];
            }
            System.out.println(Arrays.toString(digit1));
            return;
        }

        System.out.println(Arrays.toString(digits));
    }
}
