package arrays;

public class Search
{
   public static void main(String[] args)
    {
        int[] marks = {45, 89, 67, 95, 72};
        /*System.out.println(search(marks, 72));
        System.out.println(search(marks, 95));
        System.out.println(search(marks, 46));
        System.out.println(search(marks, 45));
*/
    }

    // linear search
    public static boolean search(int[] arr, int k)
    {
        for (int i = 0 ;i < arr.length; i++)
        {
            if (k == arr[i])
            {
                return true;
            }
        }
        return false;

    }

}
