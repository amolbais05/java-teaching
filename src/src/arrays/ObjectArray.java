package arrays;

import oops.Student;

public class ObjectArray
{
    public static void main(String[] args)
    {
        // <type>[] varibleName = new type[szie]
        Student[] students = new Student[5];
        students[0] = new Student("Amit", 1, 40, "Mumbai");
        students[1] = new Student("Rahul", 2, 30, "Pune");
        students[2] = new Student("Priya", 3, 95.5, "Thane");
        students[3] = new Student("abc", 4, 100, "Thane");
        students[4] = new Student("Pritam", 5, 25, "zzz");

        // students[2].display();

        students[0].name = "Rishikesh";
        // System.out.println(students[0].name);
        //students[0].display();

        students[0].setName("Amol");
        //System.out.println(students[0].name);
        // students[0].display();

        /*for (int i = 0 ; i < students.length ; i++)
        {
            students[i].display();
            System.out.println("--");
        }*/

        /*for (Student student : students)
        {
            student.display();
            // operation
        }*/

        //Student studentWithMaxMarks = getMaxMarkStudent(students);

        /*Student studentWithMaxMarks = getMaxMarkStudentEnhanceForLoop(students);
        studentWithMaxMarks.display();*/

        /*System.out.println(findStudent(students, 5));
        findStudentByMarks(students, 90);
        printPassFailCount(students);
        */
        System.out.println(findStudentByName(students, "priya"));

        //
    }

    private static Student getMaxMarkStudent(Student[] students)
    {
        int maxIndex = 0;
        for (int i = 1; i < students.length; i++)
        {
            if (students[i].marks > students[maxIndex].marks)
            {
                maxIndex = i;
            }
        }
        return students[maxIndex];
    }

    private static Student getMaxMarkStudentEnhanceForLoop(Student[] students)
    {
        Student topper = students[0]; // Assume first student is topper

        for (Student student : students)
        {
            if (student.marks > topper.marks)
            {
                topper = student;
            }
        }
        return topper;
    }

    private static boolean findStudent(Student[] students, int rollNumber)
    {
        for (Student student : students)
        {
            if (student.rollNumber == rollNumber)
            {
                return true;
            }
        }
        return false;
    }

    private static void  findStudentByMarks(Student[] students, int requiredMarks)
    {

        for (Student student : students)
        {
            if (student.marks >= requiredMarks)
            {
                student.display();
            }
        }
    }

    private static void  printPassFailCount(Student[] students)
    {
        int passCount = 0;
        int failCount = 0;
        for (Student student : students)
        {
            if (student.marks >= 40)
            {
                passCount++;
            }
            else
            {
                failCount++;
            }
        }
        System.out.println("Pass student: " + passCount);
        System.out.println("Fail student: " + failCount);
    }

    private static boolean findStudentByName(Student[] students, String name)
    {
        for (Student student : students)
        {
            if (student.name.equalsIgnoreCase(name))
            {
                return true;
            }
        }
        return false;
    }
    // H.W.
    // 1. Sort student on the basis of marks
    // 2. Find second topper

}
