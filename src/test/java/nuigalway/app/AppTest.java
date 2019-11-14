package nuigalway.app;

import org.joda.time.DateTime;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void verifyStudentDetails()
    {
        Student s1 = new Student("Joe", 18,"29-05-1997",19990);

        //Assertions
        assertEquals("Username is incorrect", "Joe 18",s1.getUsername());
        assertEquals("Age is incorrect", 18,s1.getAge());
        assertEquals("Name is incorrect", "Joe",s1.getName());
        assertEquals("ID is incorrect", 19990,s1.getIdNumber());
    }

    @Test
    public void verifyModuleDetails()
    {
        Student s1 = new Student("Joe", 18,"29-05-1997",19990);
        Student s2 = new Student("Mama", 20, "29-06-1997",19991);

        ArrayList<Student> students = new ArrayList<>();
        students.add(s1);
        students.add(s2);

        Module m1 = new Module("Software Engineering",101,students);

        //Assertions
        assertEquals("Module Name is incorrect", "Software Engineering",m1.getModName());
        assertEquals("ID is incorrect", 101,m1.getId());
        assertNotNull("Students null",m1.getListStudent());
    }

    @Test
    public void verifyProgrammeDetails()
    {
        Student s1 = new Student("Joe", 18,"29-05-1997",19990);
        Student s2 = new Student("Mama", 20, "29-06-1997",19991);

        ArrayList<Student> students = new ArrayList<>();
        students.add(s1);
        students.add(s2);

        Module m1 = new Module("Software Engineering",101,students);
        Module m2 = new Module("Machine Learning",102, students);

        ArrayList<Module> modules = new ArrayList<>();
        modules.add(m1);
        modules.add(m2);

        DateTime d1 = new DateTime("2018-05-05T11:00:00.000");
        DateTime d2 = new DateTime("2019-05-05T11:00:00.000");

        Programme p1 = new Programme("Computer Science",modules,students,d1,d2);

        //Assertions
        assertEquals("Programme is incorrect", "Computer Science",p1.getCourseName());
        assertEquals("Student Username is incorrect", "Joe 18", p1.getModules().get(0).getListStudent().get(0).getUsername());
        assertEquals("Student Username is incorrect", "Mama 20", p1.getModules().get(0).getListStudent().get(1).getUsername());
        assertNotNull("Modules null", p1.getModules());
        assertNotNull("Students null", p1.getStudents());
        assertNotNull("Start date is null", p1.getStartDate());
        assertNotNull("End date is null", p1.getEndDate());

    }

}
