/*
Given a string , print Yes if it is a palindrome, print No otherwise.

Constraints

 will consist at most  lower case english letters.

Sample Input
madam

Sample Output
Yes
*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A = sc.next();
        sc.close();
        String reverse = "";
        for(int i = A.length()-1; i>=0 ; i--)
        {
            reverse = reverse + A.charAt(i);
        }
        
        if(A.equals(reverse))
            System.out.println("Yes");
        else
            System.out.println("No");

    }
}



