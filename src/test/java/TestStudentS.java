import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import testing.Student;
import testing.StudentSingleton;

public class TestStudentS {
   private StudentSingleton studentSingleton;
   @BeforeEach
   public void setUp() {
       if (studentSingleton == null) {
           studentSingleton = StudentSingleton.getInstance();
       }
   }

    @Test
    public void testGetInstance() {
        // Ensure that calling getInstance() multiple times returns the same instance
        StudentSingleton instance1 = StudentSingleton.getInstance();

        assertSame(instance1, studentSingleton);
    }

    @Test
    public void testAddStudent(){
        var newVal = new Student(5,"Blanca");
        studentSingleton.add(newVal);
        assertTrue(studentSingleton.contains(newVal));
    }


    @Test
    public void testSingletonBehavior() {
        // Ensure that the instance is a singleton
        assertSame(studentSingleton, StudentSingleton.getInstance());
    }


    @Test
    void testRemoveAll_and_Count(){
        var newVal = new Student(5,"Blanca");
        var newV = new Student(3,"Blanca");
        var newVa = new Student(2,"Blanca");
        var newVal1 = new Student(1,"Blanca");

        studentSingleton.add(newV);
        studentSingleton.add(newVa);
        studentSingleton.add(newVal);
        studentSingleton.add(newVal1);

        assertTrue(studentSingleton.contains(newV));
        assertTrue(studentSingleton.contains(newVa));
        assertTrue(studentSingleton.contains(newVal));
        assertTrue(studentSingleton.contains(newVal1));

        studentSingleton.removeAll();

        assertEquals(studentSingleton.count(), studentSingleton.toArray().length);
        assertEquals(studentSingleton.count(), 0);
        assertEquals(0, studentSingleton.toArray().length);


    }


}
