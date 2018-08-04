/*
A prime number (or a prime) is a natural number greater than 1
that cannot be formed by
MULTIPLYING two SMALLER natural numbers
 */
package com.timbuchalka;

public class Main {

    public static void main(String[] args) {
        System.out.println(getLargestPrime(45));
        System.out.println("*************************");
        System.out.println(getLargestPrime(217));
        System.out.println("*************************");
        System.out.println(getLargestPrime(3242));
        System.out.println("*************************");
        System.out.println(getLargestPrime(324224128));

    }

    public static int getLargestPrime(int number) {
        if (number < 0 || number == 1 || number == 0) {
            return -1;
        }
        int copy = number;
        int divisorCount = 0;
        int nextDivisor = 1;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                System.out.println("Divisor found and equal to " + i);
                divisorCount++;
            }
        }
        return divisorCount;
    }
}

/*
1
2
3
4
5
6
7
8
9
10
11
12
13
15 3 * 5
14 2 * 7
18 2 * 3 * 3
22 2 * 11
24 2 * 2 * 2  * 3
25 5 * 5
217 7
*/