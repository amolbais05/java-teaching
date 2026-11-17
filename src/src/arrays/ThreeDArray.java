package arrays;

public class ThreeDArray
{
    public static void main(String[] args)
    {
        int[][][] marks = {
            {
                {85, 90, 78},
                {75, 88, 82}
            },
            {
                {90, 92, 85},
                {80, 87, 95}
            }
        };

        for (int semester = 0; semester < marks.length; semester++)
        {
            System.out.println("semester: " + semester);

            for (int student = 0; student < marks[semester].length; student++)
            {
                System.out.println("student: " + student);

                for (int studentMark = 0; studentMark < marks[semester][student].length; studentMark++)
                {
                    System.out.print(marks[semester][student][studentMark] + " ");
                }
                System.out.println();
            }
        }
    }
}
