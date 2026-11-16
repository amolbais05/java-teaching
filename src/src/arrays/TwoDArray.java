package arrays;

public class TwoDArray
{
    public static void main(String[] args)
    {
        //int[][] marks; -- delcare
      //  int row = 3;
      //  int col = 3;
       // int[][] random = new int[row][col]; // -- initizlize

        int[][] marks = new int[][] {
            // column
         //  0   1   2
            {85, 90, 78}, // row 0
            {75, 88, 82}, // row 1
            {92, 80, 95} //  row 2
        };

        // access
        System.out.println(marks[0][0]); // 85
        System.out.println(marks[0][1]); // 90
        System.out.println(marks[2][1]); // 80
        System.out.println(marks[2][0]); // 92
        System.out.println(marks[1][1]); // 88
        System.out.println(marks[1][2]); // 82

        // update
        marks[0][0] = 91;
        System.out.println("update : "+ marks[0][0]); // 85

        marks[1][2] = 23;
        System.out.println("update : "+ marks[1][2]); // 90

       // int row = marks.length; // 3
       // int col = marks[0].length; // 3

        // loop
        for (int row = 0; row < marks.length; row++)
        {
            for (int col = 0; col < marks[row].length; col++)
            {
                System.out.print(" " + marks[row][col]);
            }
            System.out.println();
        }
    }
}
