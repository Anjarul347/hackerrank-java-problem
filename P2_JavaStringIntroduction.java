/*
 * String myString = "Hello World!"
 * 
The elements of a String are called characters. The number of characters in a String is called the length, and it can be retrieved with the String.length() method.

Given two strings of lowercase English letters,  A and B , perform the following operations:

1. Sum the lengths of A and B.
2. Determine if A is lexicographically larger than  B (i.e.: does B  come before A in the dictionary?).
3. Capitalize the first letter in A and B and print them on a single line, separated by a space.
Input Format

The first line contains a string A. The second line contains another string B. The strings are comprised of only lowercase English letters.

Output Format

There are three lines of output:
For the first line, sum the lengths of  A and B.
For the second line, write Yes if A is lexicographically greater than B otherwise print No instead.
For the third line, capitalize the first letter in both A and B and print them on a single line, separated by a space.

Sample Input 0

hello
java


Sample Output 0

9
No
Hello Java
Explanation 0

*/
import java.util.Scanner;


public class P2_JavaStringIntroduction {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        
        /* Enter your code here. Print output to STDOUT. */
        
        int sumLength=A.length()+B.length();
        System.out.println(sumLength);
        if(A.compareTo(B)> 0 ){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        System.out.println(A.substring(0,1).toUpperCase() + A.substring(1).toLowerCase()+ " "+ B.substring(0,1).toUpperCase()+ B.substring(1).toLowerCase());        
        
        
    }
    
}
