/*
A prime number (or a prime) is a natural number greater than 1
that cannot be formed by
MULTIPLYING two SMALLER natural numbers
 */
package com.timbuchalka;

public class Main {

    public static void main(String[] args) {
        System.out.println("*************************");
        System.out.println(getLargestPrime(100));
        System.out.println("*************************");
    }

    public static int getLargestPrime(int number) {
        if (number < 0 || number == 1 || number == 0) {
            return -1;
        }
        int copy = number;
        for (int i = 2; i < number; i++) {


            if (copy % i == 0) {
                copy /= i; // 100/2-->50
                if (copy == 1) {
                    copy = i;
                    break;
                }
                //System.out.println("Division by " + i + " is " + copy);
                i--;
            }
        }
        return copy;
    }
}