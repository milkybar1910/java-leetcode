
// Write a function to find the longest common prefix string amongst an array of strings.

// If there is no common prefix, return an empty string "".

// Example 1:

// Input: strs = ["flower","flow","flight"]
// Output: "fl"
// Example 2:

// Input: strs = ["dog","racecar","car"]
// Output: ""
// Explanation: There is no common prefix among the input strings.

// Constraints:

// 1 <= strs.length <= 200
// 0 <= strs[i].length <= 200
// strs[i] consists of only lower-case English letters.

package Longest_common_Prefix;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        short lengthOfArray;
        short inc = -1;
        short count = 0;
        Scanner scan = new Scanner(System.in);
        lengthOfArray = scan.nextShort();

        int[] index = new int[lengthOfArray - 1];
        String[] stringArray = new String[lengthOfArray];

        // getting the string array
        for (int i = 0; i < lengthOfArray; i++)
            stringArray[i] = scan.next();

        if (lengthOfArray == 1) {
            System.out.println(stringArray[0]);
        }
        
        for (int i = 0; i < lengthOfArray - 1; i++) {
            if (stringArray[i].length() > stringArray[i + 1].length()) {
                for (int j = 0; j < stringArray[i + 1].length(); j++) {
                    if (stringArray[i + 1].charAt(j) == stringArray[i].charAt(j)) {
                        count++;
                    } else {
                        break;
                    }
                }
            } else {
                for (int j = 0; j < stringArray[i].length(); j++) {
                    if (stringArray[i].charAt(j) == stringArray[i + 1].charAt(j)) {
                        count++;
                    } else {
                        break;
                    }
                }
            }
            index[++inc] = count;
            count = 0;
        }
        Arrays.sort(index);
        String result = stringArray[0].substring(0, index[0]);
        System.out.println(result);
        scan.close();
    }
}