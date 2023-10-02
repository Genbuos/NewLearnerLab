
import org.junit.jupiter.api.Test;
//this import allowed me to access the assert Methods in JUnit
import static org.junit.jupiter.api.Assertions.*;
import testing.Learner;
import testing.Person;
import testing.Student;

public class TestStudent {

    @Test
    public void testImplementation(){

        var student = new Student(1, "Jordy");

        assertTrue(student instanceof Learner);
    }

    @Test
    public void testInheritence(){
        var student = new Student(2, "Andy");

        assertTrue(student instanceof Person);
    }

    @Test
    public void testLearn(){
        var student = new Student(3, "Julio");

        var numOfHoursLearned = 5.0;

        student.learn(5.0);

        assertEquals(numOfHoursLearned, student.getTotalStudyTime());
    }
}
