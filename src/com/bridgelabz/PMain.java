package com.bridgelabz;

import java.util.Scanner;
import java.util.Scanner;
public class PMain {
    public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            System.out.println("Enter the string : ");
            String s = scan.nextLine();
            Palindrome<String> palindrome = new Palindrome<String>(s);
            System.out.println(palindrome.palindromeChecker());
        }
    }
