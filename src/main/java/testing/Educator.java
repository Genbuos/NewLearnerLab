package testing;

public enum Educator implements Teacher{
    INSTRUCTOR1(new Instructor(4, "Tori")), INSTRUCTOR2(new Instructor(5, "Essence")), INSTRUCTOR3(new Instructor(6, "Daniel"));

    private final Instructor instructor;
    private double timeWorked;

    Educator(Instructor instructor) {
        this.instructor = instructor;
        // adding to the singleton
        InstructorSingleton.getINSTANCE().add(instructor);
    }

    public double getTimeWorked() {
        return timeWorked;
    }

    public void setTimeWorked(double timeWorked) {
        this.timeWorked = timeWorked;
    }

    @Override
    public void teach(Learner learner, double numberOfHours) {
        timeWorked += numberOfHours;
            instructor.teach(learner, numberOfHours);
    }

    @Override
    public void lecture(Learner[] learners, double numberOfHours) {
        timeWorked += numberOfHours;
        instructor.lecture(learners, numberOfHours);
    }
}
