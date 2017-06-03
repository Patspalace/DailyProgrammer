/**
 * Reddit's Daily Programmer Challenge #317[Easy] - Collatz Tag System
 * Link: https://www.reddit.com/r/dailyprogrammer/comments/6e08v6/20170529_challenge_317_easy_collatz_tag_system/
 * 
 * @author Patrick Carder
 * @version 1.0
 */
import java.util.Scanner;

public class Easy_317 {

    public static void main(String[] args) {
        System.out.println("Please enter a sequence of a's:");
        Scanner sn = new Scanner(System.in);
        String userInput = sn.next();
        String updatedString = userInput;
        String appendedString;
        while (updatedString.length() > 1) {
            char firstChar = updatedString.charAt(0);
            if (firstChar == 'a') {
                appendedString = "bc";
                updatedString = updatedString.substring(2, updatedString.length()) + appendedString;
                System.out.println(updatedString);
            } else if (firstChar == 'b') {
                appendedString = "a";
                updatedString = updatedString.substring(2, updatedString.length()) + appendedString;
                System.out.println(updatedString);
            } else if (firstChar == 'c') {
                appendedString = "aaa";
                updatedString = updatedString.substring(2, updatedString.length()) + appendedString;
                System.out.println(updatedString);
            }
        }
    }
}
