package CognifyzTasks.Cognifyz.Level1.Task4;

import java.security.SecureRandom;
import java.util.Scanner;

public class RandomPasswordGenerator 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the desired length of the password : ");
        int pwd = sc.nextInt();
        System.out.println("Should include numbers (yes/no)? :");
        boolean num = sc.next().equalsIgnoreCase("yes");

        System.out.println("Should include lowercase letters (yes/no)? :");
        boolean lwrcase = sc.next().equalsIgnoreCase("yes");

        System.out.println("Should include uppercase letters (yes/no)? :");
        boolean uprcase = sc.next().equalsIgnoreCase("yes");

        System.out.println("Should include special characters (yes/no)? :");
        boolean splchar = sc.next().equalsIgnoreCase("yes");

        String password = generatePassword(pwd,num,lwrcase,uprcase,splchar);
        System.out.println("Generate Password : " + password);
    }    

    public static String generatePassword(int pwd,boolean num,boolean lwrcase,boolean uprcase,boolean splchar)
    {
        StringBuilder password = new StringBuilder();
        SecureRandom random = new SecureRandom();

        String lwrcaseChars = "abcdefghijklmnopqrstuvwxyz";
        String uprcaseChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String numChars = "0123456789";
        String splChars = "!@#$%^&*()_+-=[]{}|;:,.<>?";
        String allChars = "";

        if(lwrcase) {
            allChars += lwrcaseChars;
        }
        if(uprcase) {
            allChars += uprcaseChars;
        }
        if(num) {
            allChars += numChars;
        }
        if(splchar) {
            allChars += splChars;
        }
        if(allChars.isEmpty()) {
            System.out.println("Please enter atleast one character");
            return "";
        }

        for(int i=0;i < pwd;i++)
        {
            int randomIndex = random.nextInt(allChars.length());
            password.append(allChars.charAt(randomIndex));
        }
            return password.toString();
    }
}


