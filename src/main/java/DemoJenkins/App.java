package DemoJenkins;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner inputObj = new Scanner(System.in);
        System.out.println("Enter name, age and salary:");

    // String input
    String name = inputObj.nextLine();

    // Numerical input
    int age = inputObj.nextInt();
    double salary = inputObj.nextDouble();

    // Output input by user
    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
    System.out.println("Salary: " + salary);
    inputObj.close();
    
    }
}
