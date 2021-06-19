package Palindrome;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        boolean result = isPalindrome(x);
        System.out.println(result);
        scan.close();
    }

        public static boolean isPalindrome(int x) {
            int rev = 0;
            if(x<0){
                return false;
            }
            int temp = x;
            while(x!=0){
                rev = (rev*10) + (x%10);
                x /= 10;
            }
            if(temp == rev){
                return true;
            }
            else{
                return false;
            }
        }

}
