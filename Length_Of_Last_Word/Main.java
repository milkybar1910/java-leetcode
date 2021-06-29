
/*
Given a string s consists of some words separated by spaces, 
return the length of the last word in the string. 
If the last word does not exist, return 0.

A word is a maximal substring consisting of non-space characters only.
*/

package Length_Of_Last_Word;

public class Main {
    public static void main(String[] args) {
        String h = " ";

        String[] hArr = h.split(" ");
        if (hArr.length == 0) {
            System.out.println(0);
            return;
        }
        System.out.println(hArr[hArr.length - 1].length());
    }
}
