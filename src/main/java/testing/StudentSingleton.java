package testing;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @class is an unexntedable class and extends People
 *
 */
public class StudentSingleton extends People{
    private static final StudentSingleton INSTANCE = new StudentSingleton();



    private StudentSingleton(){
        super.add(new Student(1, "Jordan Vargas"));
        super.add(new Student(2, "Julio Rodriguez"));
        super.add(new Student(3, "Devon Brown"));


    }




    public static StudentSingleton getInstance(){
       // normally would have an if statement to check if the the instance is null
        // and if its null create a new instance
        return INSTANCE;
    }


}
