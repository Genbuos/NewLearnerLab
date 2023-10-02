package testing;

public class InstructorSingleton extends People{

    private static final InstructorSingleton INSTANCE = new InstructorSingleton();

    private InstructorSingleton(){
        super.add(new Instructor(1, "Margaret West"));
        super.add(new Instructor(2, "Vinte Clemons"));
        super.add(new Instructor(1, "Mikaila Akredolu"));
    }

    public static InstructorSingleton getINSTANCE(){
        return INSTANCE;
    }
}
