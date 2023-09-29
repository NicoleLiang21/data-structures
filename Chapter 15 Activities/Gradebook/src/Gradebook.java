import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 * A program to add, remove, modify or print
 * student names and grades.
*/
public class Gradebook
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        Map<String, String> students = new HashMap<>();


        boolean done = false;
        while(!done)
        {
            System.out.println("A)dd R)emove M)odify P)rint Q)uit");
            String input = in.next().toUpperCase();
            String name, grade;

            if (input.equals("Q"))
            {
                done = true;
            } else if (input.equals("A") || input.equals("M"))
            {
                // Get the student's name
                System.out.println("Name of student: ");
                name = in.next();
                in.nextLine();

                // Get the student's grade
                System.out.println("Grade: ");
                grade = in.next();
                in.nextLine();

                // Add the student's information to the HashMap
                students.put(name, grade);

            } else if (input.equals("R"))
            {
                // Get the name of the student
                System.out.println("Name of student: ");
                name = in.next();
                in.nextLine();

                // remove the student from the HashMap
                students.remove(name);

            } else if (input.equalsIgnoreCase("P"))
            {
                // Iterate through the list of students (as a set) and print out their names and grades
                Set<String> keys = students.keySet();
                for (String key : keys)
                {
                    System.out.println(key + " (" + key.hashCode() + "): " + students.get(key));
                }

            } else
            {
                done = true;
            }
        }
    }
}
