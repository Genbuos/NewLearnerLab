import org.junit.jupiter.api.Test;
import testing.Instructor;
import testing.Person;
import testing.Student;
import testing.Teacher;
//this import allowed me to access the assert Methods in JUnit
import static org.junit.jupiter.api.Assertions.*;
public class TestInstructor {

    @Test
    public void testImplementation(){
        var mikaila = new Instructor(1,"Mikaila");

        assertTrue(mikaila instanceof Person);
    }

    @Test
    public void testInheritance(){
        var rachel = new Instructor(2,"Rachel");

        assertTrue(rachel instanceof Teacher);
    }

    @Test
    public void testTeach(){
        var vinte = new Instructor(3, "Vinte");
        var shay = new Student(1,"O'shay");

        vinte.teach(shay, 3.0);

        assertEquals(3.0, shay.getTotalStudyTime());
    }

    @Test
    public void testLecture(){
        var missy = new Instructor(4, "Tori");
        var mike = new Student(4, "Mikey");
        var naiyah = new Student(5, "Naiyah");
        var henry = new Student(6, "Henry");

        Student[] classroom = {mike, naiyah, henry};

        missy.lecture(classroom, 5.0);
        assertEquals(5.0, mike.getTotalStudyTime());
        assertEquals(5.0, naiyah.getTotalStudyTime());
        assertEquals(5.0, henry.getTotalStudyTime());
    }

}

