package testing;

public class InstructorSingleton extends People<Instructor>{

    private static final InstructorSingleton INSTANCE = new InstructorSingleton();

    private InstructorSingleton(){

    }

    public static InstructorSingleton getINSTANCE(){
        return INSTANCE;
    }

    @Override
    public Instructor[] toArray() {
        Instructor[] teacherArray = personList.toArray(new Instructor[personList.size()]);
        return teacherArray;
    }
}
