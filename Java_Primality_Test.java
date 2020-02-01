/*
A prime number is a natural number greater than  whose only positive divisors are  and itself. For example, the first six prime numbers are , , , , , and .

Given a large integer, , use the Java BigInteger class' isProbablePrime method to determine and print whether it's prime or not prime.

Input Format

A single line containing an integer,  (the number to be checked).

Constraints

 contains at most  digits.

Output Format
If  is a prime number, print prime; otherwise, print not prime.

Sample Input
13

Sample Output
prime
*/

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.math.BigInteger; 

public class Solution {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String n = scanner.nextLine();
        scanner.close();
        BigInteger b = new BigInteger(n); 
        boolean res = b.isProbablePrime(1);
        if(res==true)
            System.out.println("prime");
        else
            System.out.println("not prime");
    }
}
