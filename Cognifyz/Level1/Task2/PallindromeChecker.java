package Cognifyz.Level1.Task2;

import java.util.Scanner;

public class PallindromeChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word or phrase: ");
        String a = scanner.nextLine();
        String cleanInput = a.replaceAll("\\s+", "").toLowerCase();

        if (isPalindrome(cleanInput)) 
        {
            System.out.println("The word or phrase is a palindrome.");
        }
        else
        {
            System.out.println("The word or phrase is not a palindrome.");
        }
         scanner.close();
    }

    public static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}

