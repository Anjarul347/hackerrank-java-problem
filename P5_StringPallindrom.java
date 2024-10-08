/*
 * Given a string A, print Yes if it is a palindrome, print No otherwise.

Constraints

 will consist at most 50  lower case english letters.
Sample Input

madam
Sample Output

Yes
 */

import java.util.Scanner;

public class P5_StringPallindrom {
    public static void main(String[] args) {
        
      Scanner sc=new Scanner(System.in);
        String A=sc.next();
        int start=0, end=A.length()-1;
        boolean rev=true;
        while(start<end){
            start++;end--;
            if(A.charAt(start)==A.charAt(end)){
                rev=true;
            }else{
                rev = false;
                break;
            }
            
        }
        
        
        if(rev){
            
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
