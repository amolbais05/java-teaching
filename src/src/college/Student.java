package college;

public class Student
{
    String studentName;
    int rollNo;
    Course course;


    void attendExam(String course)
    {
        System.out.println("Attending Exam for course : " + course);
    }
}