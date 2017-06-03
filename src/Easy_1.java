/**
 * Reddit's Daily Programmer Challenge #1[Easy] - Introduction 
 * Link: https://www.reddit.com/r/dailyprogrammer/comments/pih8x/easy_challenge_1/
 *
 * @author Patrick Carder
 * @version 1.0
 */
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Easy_1 {

    public String name;
    public String age;
    public String userName;

    public static void main(String[] args) {
        Easy_1 myInfo = new Easy_1();
        Scanner sn = new Scanner(System.in);
        myInfo.userInterface(sn);
        myInfo.fileOutput();
    }

    public void userInterface(Scanner sn) {
        System.out.println("What is your name?: ");
        this.name = sn.nextLine();
        System.out.println("How old are you?: ");
        this.age = sn.nextLine();
        System.out.println("What is your reddit username?: ");
        this.userName = sn.nextLine();
        String output = "your name is " + name + ", you are " + age + " years old,"
                + " and your username is " + userName;
        System.out.println(output);
    }

    public void fileOutput() {
        String fileName = "Easy_1.txt";
        File file = new File(fileName);
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            
            FileWriter fw = new FileWriter(file.getAbsoluteFile(), true);
            BufferedWriter bw = new BufferedWriter(fw);
            
            String fileInfo = "Name: " + this.name + "\t\tAge: " + this.age +
                    "\t\tUsername: " + this.userName + "\n";
            bw.write(fileInfo);
            
            System.out.println("Object printed.");
            
            bw.close();
            fw.close();
            
        } catch (IOException ex) {
            Logger.getLogger(Easy_1.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}