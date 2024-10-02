
import java.util.Scanner;

/*
Sample Input
    Helloworld
    3 7

Sample Output
    lowo
 */

public class P3_Substring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String S=sc.next();
        int start=sc.nextInt();
        int end=sc.nextInt();

        System.out.println(S.substring(start,end));
    }
    
}
