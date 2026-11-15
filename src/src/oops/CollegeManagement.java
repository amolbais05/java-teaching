package oops;

public class CollegeManagement
{
    static void registerStudent(String name)
    {
        System.out.println("Registering student " + name);
    }

    static void enrollStudent(String name, String course)
    {
        System.out.println("Enrolling student " + name + " to " + course);
    }

    static void conductExam(String name)
    {
        System.out.println("Conducting exam for " + name);
    }

    static String getStudent(String studentName)
    {
        return "Getting student " + studentName;
    }

    static  void calculateMarks(int marks)
    {
        System.out.println("Calculating marks for " + marks);
    }

    static void getFacultyInfo(String facultyName)
    {
        System.out.println("Getting faculty info for " + facultyName);
    }


    public static void main(String[] args)
    {
        registerStudent("John");
        enrollStudent(getStudent("John"), "CSE");
        conductExam("John");
        calculateMarks(90);

    }

}