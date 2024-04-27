import java.math.BigInteger;
import java.util.Scanner;

//https://www.hackerrank.com/challenges/java-biginteger/problem

public class Solution {

    public static void main(String[] args) {
        
        Scanner obj = new Scanner(System.in);
        BigInteger a = obj.nextBigInteger();
        BigInteger b = obj.nextBigInteger();
        
        System.out.println(a.add(b));
        System.out.println(a.multiply(b));
        
        obj.close();
        
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
