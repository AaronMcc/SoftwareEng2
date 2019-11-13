package nuigalway.app;

import org.joda.time.DateTime;

import java.util.ArrayList;

/**
 * Author: Aaron McCormack
 * ID: 16492186
 */
public class App 
{
    public static void main( String[] args )
    {

        //Initialise the student objects
        Student s1 = new Student("Joe", 18,"29-05-1997",19990);
        Student s2 = new Student("Mama", 20, "29-06-1997",19991);

        //Create students and add them to the array
        ArrayList<Student> students = new ArrayList<>();
        students.add(s1);
        students.add(s2);

        //Initialise the module objects
        Module m1 = new Module("Software Engineering",101,students);
        Module m2 = new Module("Machine Learning",102, students);

        //Create an array of modules
        ArrayList<Module> modules = new ArrayList<>();
        modules.add(m1);
        modules.add(m2);

        //Initialise programme object & dates
        DateTime d1 = new DateTime("2018-05-05T11:00:00.000");
        DateTime d2 = new DateTime("2019-05-05T11:00:00.000");

        Programme p1 = new Programme("Computer Science",modules,students,d1,d2);
    }

}
