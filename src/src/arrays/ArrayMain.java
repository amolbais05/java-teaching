package arrays;

public class ArrayMain
{
    public static void main(String[] args)
    {
        int[] marks = {89, 90, 86, 80, 76}; // declare + initialize
        // marks[3];

        int[] colors = new int[2]; // declare
        colors[0] = 101;
        colors[1] = 102;

       /* System.out.println("mark1: " + marks[0]);
        System.out.println("mark2: " + marks[1]);
        System.out.println("mark3: " + marks[2]);
        System.out.println("mark4: " + marks[3]);
        System.out.println("mark5: " + marks[4]);*/

        marks[2] = 99;
       // System.out.println("new mark3: " + marks[2]);

        int j = 0;
        for (int i = 0; i < marks.length; i++)
        {
            j = j + marks[i];
        }
       // System.out.println(j);
       int k = 0;
        for (int value : marks)
        {
            k += value;
        }
        System.out.println(k);


    }
}
