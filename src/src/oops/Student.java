package oops;

public class Student
{
    public String name;
    public int rollNumber;
    public double marks;
    public String city;

    public Student(String name,  int rollNumber, double marks, String city)
    {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
        this.city = city;
    }

    public double getMarks()
    {
        return marks;
    }

    public void setMarks(double marks)
    {
        this.marks = marks;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void display()
    {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
    }
}
