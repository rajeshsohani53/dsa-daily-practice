public class MissingNumber
{
    public static void main(String[] args) {
        int[] arr = {3, 0, 1};
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i <= arr.length; i++)
        {
            sum1 = sum1 + i;
            if (i < arr.length)
            {
                sum2 = sum2 + arr[i];
            }
        }
        System.out.println("The missing Number is " + (sum1 - sum2));
    }
}
