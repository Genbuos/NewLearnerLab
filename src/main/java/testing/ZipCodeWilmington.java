package testing;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ZipCodeWilmington {
    private static ZipCodeWilmington zipCodeWilmington;
    private static final StudentSingleton studentSingleton = StudentSingleton.getInstance();
    private static final InstructorSingleton instructorSingleton = InstructorSingleton.getINSTANCE();

    private ZipCodeWilmington(){

    }

    public static void hostLecture(Educator educator, Learner[] learners, double numOfHours ){
        educator.lecture(learners, numOfHours);

    }
    public static void hostLecture(Teacher teacher, double numberOfHours){
//        List<Learner> learners = studentSingleton.personList.stream()
//                .filter(p -> p instanceof Learner)
//
//                .map(p -> (Learner) p)
//
//                .collect(Collectors.toList());

        Learner[] learnersarray =studentSingleton.personList.toArray(new Learner[0]);

        teacher.lecture(learnersarray, numberOfHours);
    }

    public static void hostLecture(long id, double numberOfHours){




        Instructor instructor = instructorSingleton.findById(id);

        if(instructor != null){
            instructor.lecture(studentSingleton.personList.toArray(new Student[0]), numberOfHours);
        }

    }

    /**
     * the idea is to map the students to their studyhours
     * and return that map
     * @return
     */
    public static Map getStudyMap(){
        Map<Student, Double> studymap = new HashMap<>();
       for(Person student: studentSingleton.personList){
           studymap.put((Student) student, ((Student) student).getTotalStudyTime());
       }

        return studymap;
    }

    public static ZipCodeWilmington getInstance(){
        if(zipCodeWilmington == null){
            zipCodeWilmington = new ZipCodeWilmington();
        }
        return zipCodeWilmington;
    }
}
