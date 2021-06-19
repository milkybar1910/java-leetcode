package Reverse_Integer;

import java.util.Scanner;

public class ReverseInteger {
    
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       int x = scan.nextInt();
       int result = reverse(x);
       System.out.println(result);
       scan.close();
    }
    public static int reverse(int x) {
        long rev = 0;
          while(x!=0){
              int digit = x%10;
              rev  = (rev*10) +(digit);
              x = x/10;
          }
           if(rev < Integer.MIN_VALUE || rev > Integer.MAX_VALUE){
              return 0;
          }else{
              return (int)rev;
          }
      }
}

