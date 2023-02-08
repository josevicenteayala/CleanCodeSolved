package com.tasks.palindrome;

public class Palindrome {
    public static void main(String[] args) {

        System.out.println("kayak is palindrome " + isPalindrome("kayak"));
    }

    public static boolean isPalindrome(String word){
        String palindrome = "";
        for(int i = word.length()-1; i>0;i--){
            palindrome=palindrome+word.charAt(i);
        }
        return word.toLowerCase().equals(palindrome.toLowerCase());
    }

}
