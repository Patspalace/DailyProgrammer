/**
 * Reddit's Daily Programmer Challenge #2[Easy] - Calculator
 * Link: https://www.reddit.com/r/dailyprogrammer/comments/pjbj8/easy_challenge_2/
 *
 * @author Patrick Carder
 * @version 1.0
 */

import java.util.Scanner;

public class Easy_2{
    
    
    public static void main (String[] args){
        Easy_2 myCalculator = new Easy_2();
        Scanner sn = new Scanner(System.in);
        myCalculator.userInterface(sn);
    }
    
    public void userInterface(Scanner sn){
        System.out.println("Welcome to the Physics calculator!");
        System.out.println("What will we be solving for today?");
        System.out.println("Please enter 1 to calculate force, 2 to calculate acceleration, "
                + "or 3 to calculate mass.");
        boolean isInputValid = false;
        int userInput;
        while(!isInputValid){
            userInput = sn.nextInt();
            if(userInput <= 3 && userInput >= 1){
                isInputValid = true;
            } else {
                System.out.println("Please enter an integer between 1 and 3");
            }
        }
    }
    
}