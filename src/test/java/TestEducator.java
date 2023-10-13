import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import testing.*;

import static org.junit.jupiter.api.Assertions.*;
public class TestEducator {

    //Since we cant instantiate an Enum we just testing the enum's methods.


    @Test
    void testTeach(){
        var totalTimeWorked = Educator.INSTRUCTOR1.getTimeWorked();

        Learner learner = new Student(1, "JOrdy");
        Educator.INSTRUCTOR1.teach(learner, 30);

        assertEquals(totalTimeWorked + 30, Educator.INSTRUCTOR1.getTimeWorked());
    }

    @Test
    void testLecture(){
        var totalTimeWorked = Educator.INSTRUCTOR2.getTimeWorked();

        Learner learner = new Student(1, "Jordy");
        Learner learner2 = new Student(2, "Jordy");
        Learner learner3= new Student(3, "Jordy");
        Learner[] learners = new Learner[]{learner, learner2, learner3};
        Educator.INSTRUCTOR2.lecture(learners, 70);
        assertEquals(totalTimeWorked + 70, Educator.INSTRUCTOR2.getTimeWorked());

    }

    @Test
    void testSetTimeWorked(){
        Educator.INSTRUCTOR3.setTimeWorked(90);

        assertTrue(90 == Educator.INSTRUCTOR3.getTimeWorked());
    }



}
