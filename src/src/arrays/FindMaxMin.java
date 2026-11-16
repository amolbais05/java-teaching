package arrays;

public class FindMaxMin
{
    public static void main(String[] args)
    {
        int[] marks = {45, 89, 67, 95, 72};
        int maxNumber = 0;
        int minNumber = Integer.MAX_VALUE;
        // maximum
        for (int mark : marks)
        {

            maxNumber = Math.max(maxNumber, mark);
            minNumber = Math.min(minNumber, mark);
            /*if (marks[i] > maxNumber)
            {
                maxNumber = marks[i];
            }

            if (marks[i] < minNumber)
            {
                minNumber = marks[i];
            }*/

        }
        System.out.println("Maximum number is " + maxNumber);
        System.out.println("Maximum number is " + minNumber);

    }
}
