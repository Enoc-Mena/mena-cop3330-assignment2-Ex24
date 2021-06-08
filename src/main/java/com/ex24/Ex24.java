/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Enoc Mena
 */

package com.ex24;

import java.util.Arrays;
import java.util.Scanner;

public class Ex24 {

    static void isAnagram(String stringOne, String stringTwo) {

        //Checks to see if both strings are equal in length
        if(stringOne.length() != stringTwo.length()) {

            System.out.print("Strings are not the same length.");
            System.exit(0);

        }

        char[] arr1 = stringOne.toCharArray();
        char[] arr2 = stringTwo.toCharArray();

        //Sorts the arrays to be able to compare
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if(Arrays.equals(arr1, arr2)) {

            System.out.print(stringOne + " and " + stringTwo + " are anagrams.");

        } else {

            System.out.print(stringOne + " and " + stringTwo + " are not anagrams.");

        }

    }

    public static void main(String[] args) {

        String one;
        String two;

        System.out.print("Enter two strings and I'll tell you if they are anagrams: ");
        System.out.println("");

        Scanner word1 = new Scanner(System.in);
        System.out.print("Enter string 1: ");
        one = word1.nextLine();

        Scanner word2 = new Scanner(System.in);
        System.out.print("Enter string 2: ");
        two = word1.nextLine();

        isAnagram(one, two);

    }
}


