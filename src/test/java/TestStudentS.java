import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import testing.Student;
import testing.StudentSingleton;

public class TestStudentS {
   private StudentSingleton studentSingleton;
   //BeforeEach annotationDenotes that the annotated method should be
   // executed before each @Test, @RepeatedTest, @ParameterizedTest,
   // or @TestFactory method in the current class; analogous to JUnit 4’s
   // @Before. Such methods are inherited – unless they are overridden or
   // superseded (i.e., replaced
   // based on signature only, irrespective of Java’s visibility rules).

    @BeforeEach
    public void setUp() {
        studentSingleton = StudentSingleton.getInstance();

    }

    @Test
    public void testGetInstance() {
        // Ensure that calling getInstance() multiple times returns the same instance
        StudentSingleton instance1 = StudentSingleton.getInstance();
        StudentSingleton instance2 = StudentSingleton.getInstance();
        assertSame(instance1, instance2);
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
        StudentSingleton anotherInstance = StudentSingleton.getInstance();
        assertSame(studentSingleton, anotherInstance);
    }





}
