
import org.junit.jupiter.api.Test;
import testing.*;

import static org.junit.jupiter.api.Assertions.*;
public class ZipCodeWilmington {
    StudentSingleton studentSingleton = StudentSingleton.getInstance();
    @Test
    void testHostLecture(){
        var s1 = new Student(1,"jordy");
        var s2 = new Student(1,"julio");
        var s3 = new Student(1,"jordan");

        Learner[] theClass= {s1, s2, s3};

        var t = new Instructor(1,"mikaila");

        t.lecture(theClass, 5.0);

        assertEquals(s1.getTotalStudyTime(), 5.0);
        assertEquals(s2.getTotalStudyTime(), 5.0);
        assertEquals(s3.getTotalStudyTime(), 5.0);
    }

    @Test
    void testHostLecture2(){

        var t = new Instructor(1,"mikaila");
        testing.ZipCodeWilmington.hostLecture(t, 5);

        assertFalse(testing.ZipCodeWilmington.getStudyMap().isEmpty());

        //checking for the new value of study for each student.
        for (int i = 0; i < studentSingleton.toArray().length; i++) {
            var p =studentSingleton.toArray()[i];
            var s = (Student) p;
            assertEquals(s.getTotalStudyTime(), 5);

        }

    }

    @Test
    void testHostLecture3(){


        Learner learner = new Student(1, "Jordy");
        Learner learner2 = new Student(2, "Jordy");
        Learner learner3= new Student(3, "Jordy");
        Learner[] learners = new Learner[]{learner, learner2, learner3};
        testing.ZipCodeWilmington.hostLecture(Educator.INSTRUCTOR1, learners, 40 );

        assertEquals( 40 , Educator.INSTRUCTOR1.getTimeWorked());
        ;
    }

}
