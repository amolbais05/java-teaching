package arrays;

public class TwoDAraayProblems
{
    public static void main(String[] args)
    {
        int[][] marks = new int[][] {
            {85, 90, 78},
            {75, 88, 82},
            {92, 80, 95}
        };

        calaculateTotalMarksApproach1(marks);
        calaculateTotalMarksApproach2(marks);
        calaculateSubjectMarks(marks);
        findLargestElement();
    }

    public static void calaculateTotalMarksApproach1(int[][] marks)
    {
        int k = 0;
        int x = 0;
        int y = 0;
        for (int i = 0; i < marks.length; i++)
        {
            for (int j = 0; j < marks[i].length; j++)
            {
                if (i == 0)
                {
                    k = k + marks[i][j];
                }
                if (i == 1)
                {
                    x = x + marks[i][j];
                }
                if (i == 2)
                {
                    y = y + marks[i][j];
                }
            }
        }
        System.out.println("k = " + k);
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }

    public static void calaculateTotalMarksApproach2(int[][] marks)
    {

        for (int i = 0; i < marks.length; i++)
        {
            int total = 0;
            for (int j = 0; j < marks[i].length; j++)
            {
                    total = total + marks[i][j];
            }
            System.out.println("for Student "+ i + " Total = " + total);
        }
    }

    private static void calaculateSubjectMarks(int[][] marks)
    {
        for (int col = 0; col < marks[0].length; col++)
        {
            int total = 0;
            for (int row = 0; row < marks.length; row++)
            {
                total = total + marks[row][col];
            }
            System.out.println("for subjects "+ col + " Total = " + total);

        }
    }

    private static void findLargestElement()
    {
        int[][] numbers = {
            {10, 25, 30},
            {45, 15, 20},
            {12, 60, 35}
        };

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++)
        {
            for (int j = 0; j < numbers[i].length; j++)
            {
                if (numbers[i][j] > max)
                {
                    max = numbers[i][j];
                }
            }
        }
        System.out.println("max = " + max);

    }

}
