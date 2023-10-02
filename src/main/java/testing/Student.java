package testing;

public class Student extends Person implements  Learner{
    private double totalStudyTime;
    public Student(long id, String name) {
        super(id, name);
    }


    @Override
    public void learn(double numberOfHours) {
//increments the totalStudyTime variable by the specified
// numberOfHours argument.

        var newTotal = numberOfHours + getTotalStudyTime();
        for (int i = 0; i < newTotal; i++) {
            totalStudyTime++;

        }

    }

    @Override
    public Double getTotalStudyTime() {
        // method which returns the totalStudyTime instance variable.
        return this.totalStudyTime;
    }
}
