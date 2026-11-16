package arrays;

public class DoubleArray
{
   public static void main(String[] args)
    {
        double[] arr = {66.65, 89.55, 75.78, 12.12, 11.22};
        String[] stringArray = new  String[2];


        /*System.out.println(stringArray[0]);
        System.out.println(stringArray[1]);*/


        for (int start = arr.length - 1; start >= 0; start--)
        {
            System.out.println(arr[start]);
        }
    }
}
