package CognifyzTasks.Cognifyz.Level1.Task1;

import java.util.Scanner;

public class TemperatureConverter
 {
    public static void main(String[] args)
    {
        double celsius,fahrenheit;
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose the type of conversion : \n 1.Celsius to Fahrenheit  \n 2. Fahrenheit to Celsius");
        int choice = sc.nextInt();
        
        switch(choice)
        {
            case 1:
            System.out.println("Enter Celsius Temperature : ");
            celsius=sc.nextDouble();
            fahrenheit=((9*celsius)/5)+32;
            System.out.println("Fahrenheit Temperature is : " + fahrenheit);
            break;

            case 2:
            System.out.println("Enter Fahrenheit Temperature : ");
            fahrenheit=sc.nextDouble();
            celsius=(fahrenheit-32)*5/9;
            System.out.println("Celsius Temperature is : " + celsius);
            break;

            default:
            System.out.println("Please enter correct choice.");

        }
    }
    
}
