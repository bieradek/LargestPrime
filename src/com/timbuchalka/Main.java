package com.timbuchalka;

public class Main {

    public static void main(String[] args) {
        System.out.println(getLargestPrime(21));  // 7 3*7=21
        System.out.println(getLargestPrime(217)); // 31 7*31
        System.out.println(getLargestPrime(45));  // 5  3*3*5=15
    }

    public static int getLargestPrime(int number) {
        if (number < 0 || number == 1 || number == 0) {
            return -1;
        }
        return 1;
    }
}
