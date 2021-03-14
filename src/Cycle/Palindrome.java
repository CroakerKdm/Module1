package Cycle;

/**
 * @author Croaker
 * @version 1.0.0
 * @project Module1
 * @class Palindrome
 * @since 13.03.2021 - 15.25
 **/

public class Palindrome {

    public static boolean isPalindrome (String possiblePalindrome) {
        possiblePalindrome = possiblePalindrome.replaceAll("[^A-Za-zА-Яа-я]", "");
        possiblePalindrome = possiblePalindrome.toLowerCase();
        StringBuilder reversedPossiblePalindrome = new StringBuilder();

        for (int i = possiblePalindrome.length() - 1; i >= 0; i--) {
            reversedPossiblePalindrome.append(possiblePalindrome.charAt(i));
        }

        return reversedPossiblePalindrome.toString().equals(possiblePalindrome);
    }

    public static void main (String[] args) {
        String possiblePalindrome = "Аргентина манит негра";

        System.out.println();
        System.out.println(possiblePalindrome + " is a palindrome - " + isPalindrome(possiblePalindrome));
    }
}
