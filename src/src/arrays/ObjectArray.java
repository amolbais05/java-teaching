package arrays;

import oops.Student;

public class ObjectArray
{
    public static void main(String[] args)
    {
        Student amit = new Student("Amit", 1, 85.5);
        Student rahul = new Student("Rahul", 2, 90);
        Student priya = new Student("Priya", 3, 95.5);



        // <type>[] varibleName = new type[szie]

        Student[] students = new Student[3];
        students[0] = new  Student("Amit", 1, 85.5);
        students[1] = new  Student("Rahul", 2, 90);
        students[2] = new  Student("Priya", 3, 95.5);

        students[2].display();

        students[0].name = "Rishikesh";
        System.out.println(students[0].name);
        students[0].display();


        students[0].setName("Amol");
        System.out.println(students[0].getName());
        students[0].display();



        //student.setMarks(33);

        //



    }
}
