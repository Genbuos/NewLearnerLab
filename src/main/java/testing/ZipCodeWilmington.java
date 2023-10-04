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
    public static void hostLecture(Teacher teacher, double numberOfHours){
        List<Learner> learners = studentSingleton.personList.stream()
                .filter(p -> p instanceof Learner)
                .map(p -> (Learner) p)
                .collect(Collectors.toList());

        Learner[] learnersarray = learners.toArray(new Learner[0]);

        teacher.lecture(learnersarray, numberOfHours);
    }

    public static void hostLecture(long id, double numberOfHours){

       //- going inside of the list of instructors
        //the idea is to grab the instructor based on the id param
        //but since this list that is a list of Person obje
        for (Person person : instructorSingleton.personList) {
            if (person instanceof Instructor ){
                Instructor instructor = (Instructor) person;
                if (instructor.getId() == id){
                    instructor.lecture((Learner[]) studentSingleton.personList.toArray(), numberOfHours);
                    break;
                }
            }

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
