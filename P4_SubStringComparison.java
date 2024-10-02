
import java.util.Scanner;

/*
•Lexicographical Order, also known as alphabetic or dictionary order, orders characters as f

A<<...<<2<a<b<...<<

For example, ball < cat, dog < dorm. Happy happy. Zoo < ball.

* A substring of a string is a contiguous block of characters in the string. For example, the substrings of abc are a, b, c. ab, bc, and abc.

Given a string, a, and an Integer, e, complete the function so that it finds the lexicographically smallest and largest substrings of length 4.

Function Description

Complete the getSmallestAndLargest function in the editor below.

getSmallestAndLargest has the following parameters:

* string s: a string

* Int is the length of the substrings to find

Leaderboard

Returns

⚫ string: the string'+ "\n" + 'where and are the two substrings

Input Format

The first line contains a string denoting a.

The second line contains an integer denoting k.

Sample Input:
    welcometojava
    3

Sample Output:
    ava
    wel
 */

public class P4_SubStringComparison {
    public static String getSmallestAndLargest(String s, int k) {
        String smallest =s.substring(0,k);
        String largest = s.substring(0,k);
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        
        for(int i=1;i<=s.length()-k;i++){
            String substring=s.substring(i,i+k);
            
            if(substring.compareTo(smallest)<0){
                smallest=substring;
            }
            if(substring.compareTo(largest)>0){
                largest=substring;
            }
            
        }
      
        
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}
