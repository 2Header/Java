package com.company;

import java.util.Scanner;

    public class Palindrom {
        public static void main(String[] args) {
            for (int i = 0; i < args.length; i++) {
                String s = args[i];
            }

            //Ввод строки
            Scanner str1 = new Scanner(System.in);
            String str = str1.next();
            System.out.print(isPalindrome(str));

        }

        //Метод, переворачивающий строку
        public static String reverseString(String s) {
            String r = "";
            for (int i = s.length() - 1; i >= 0; --i) {
                r += s.charAt(i);
            }
            return r;
        }

        //Метод сравнивает исходную строку с перевернутой
        //и определяет палиндром ли слово
        public static boolean isPalindrome(String s) {
            return s.equalsIgnoreCase(reverseString(s));
        }

    }



