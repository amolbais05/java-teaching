package arrays;

public class JaggedArray
{
    public static void main(String[] args)
    {
        int[][] numbers = {
            {10, 20},
            {30, 40, 50},
            {60}
        };

        for (int i = 0; i< numbers.length;i++)
        {
            for (int j = 0; j < numbers[i].length;j++)
            {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }


    }
}
