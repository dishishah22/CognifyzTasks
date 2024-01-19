package CognifyzTasks.Cognifyz.Level1.Task3;

import java.util.Scanner;
public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("***************Student Grade Calculator***************");
        System.out.print("Enter the name of the student :  ");
        String name = sc.nextLine();
        System.out.print("Enter division of the student :  ");
        String division = sc.nextLine();
        System.out.println("Marks obtained out of 100 in English : ");
        int english = sc.nextInt();
        System.out.println("Marks obtained out of 100 in Hindi : ");
        int hindi = sc.nextInt();
        System.out.println("Marks obtained out of 100 in Geography : ");
        int geography = sc.nextInt();
        System.out.println("Marks obtained out of 100 in Maths : ");
        int maths = sc.nextInt();
        System.out.println("Marks obtained out of 100 in Science : ");
        int science = sc.nextInt();

        int total = english+hindi+geography+maths+science;
        double percentage = total/5;

        System.out.println(name);
        System.out.println("Division of the student is : "+ division);
        System.out.println("Total of five subjects is : " +total);
        System.out.println("The average percentage is :  " +percentage + "%");

        if(total>=400 && total<=500)
        {
            System.out.println(" Student received A Grade!");
        }
        else if(total>=300 && total<400)
        {
            System.out.println("Student received B Grade!");
        }
        else if(total>=200 && total<300)
        {
            System.out.println("Student received C Grade!");
        }
        else if(total>=100 && total<200)
        {
            System.out.println("Student received D Grade!");
        }
        else if(total>=0 && total<100)
        {
            System.out.println("Student received E Grade!");
        }
        else
        {
            System.out.println("Please enter a valid number!");
        }

    }
}

