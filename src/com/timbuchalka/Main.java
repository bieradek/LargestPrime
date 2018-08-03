package com.timbuchalka;

public class Main {

    public static void main(String[] args) {
//        System.out.println(getLargestPrime(21));  // 7  3*7=21
//        System.out.println(getLargestPrime(217)); // 31 7*31
//        System.out.println(getLargestPrime(45));  // 5  3*3*5=15
//        System.out.println(getLargestPrime(60));  // 5  3*3*5=15
//        System.out.println(getLargestPrime(30));  // 5  3*3*5=15
//        System.out.println(getLargestPrime(65));
        isPrime(15);
    }

//    public static int getLargestPrime(int number) {
//        if (number < 0 || number == 1 || number == 0) {
//            return -1;
//        }
//        int prime;
//        for (int i = 1; i <= number; i++) {
//            for (int i = 2; i <= number / 2; i++) {
//                System.out.println("Number is " + i);
//                if (number % i == 0) {
//                    System.out.println("Prime number found and equal to " + i);
//                    prime = i;
//                }
//            }
//        }
//        return prime;
//    }

    public static void isPrime(int number) {
        if (number == 1) {

        }
        for (int i = 1; i <= number; i++)
            for (int i = 2; i <= number / 2; i++) {
                int found;
                if (number % i == 0) {
                    found = i;
                    System.out.println("Prime found " + found);
                }

            }
    }
}
//2
//3
//5
//7
//11
//13 check whether multiplication returns the value
//17
//19
//23
//29
//31
//37
//41
//43
//47
//53
//59
//61
//67
//71

/*
number 80
//greater than 1 that cannot be formed by multiplying two smaller natural numbers

        for (int i = 1; i <= number; i++) {
            if (number) {
                System.out.println("Prime number found and equal to " + i);
            }
        }

 */

/* LARGEST PRIME from n

1
2 n % 2
3
4
5
6
7
8
9
10

 */