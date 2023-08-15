 package com.company;

public class Primes {
           public static void main(String[] args)  {
            for (int i = 2; i<=100; i++){
                if (isPrime(i) == true)
                    System.out.print(i + " ");
            }
        }
        //Метод, проверяющий является ли число простым
        public static boolean isPrime(int n){
            boolean res = true;
            for ( int i = 2; i<n; i++){
                if (n%i==0)
                    res = false;
            }
            return res;
        }

    }


