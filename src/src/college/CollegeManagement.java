package college;

public class CollegeManagement
{
    public static void main(String[] args)
    {
        Student student = new  Student();

        student.studentName = "Rahul";
        student.rollNo = 101;

        Course course = new Course();
        course.courseName = "Computer Science";
        course.courseCode  = "CSE";
        course.credits = 10;


        student.attendExam("CSE");

    }
}
