import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import testing.Instructor;
import testing.InstructorSingleton;

public class TestInstructorS {

    private InstructorSingleton singleton;

    @BeforeEach
    void setUp() {
        // Ensure the singleton instance is reset before each test

        singleton = InstructorSingleton.getINSTANCE();
    }

    @Test
    void testSingletonInstance_AND_GetInstance() {
        // Ensure that the instance is indeed a singleton
        InstructorSingleton anotherInstance = InstructorSingleton.getINSTANCE();
        assertSame(singleton, anotherInstance);
    }

    @Test
    void testAddInstructor() {
        // Test adding an instructor to the singleton
        Instructor newInstructor = new Instructor(3, "New Instructor");
        singleton.add(newInstructor);
        assertTrue(singleton.contains(newInstructor));

    }

}
