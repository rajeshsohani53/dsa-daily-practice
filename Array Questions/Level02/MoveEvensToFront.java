public class MoveEvensToFront
{
    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 4, 7, 6, 8, 5};
        int slow = 0;
        for (int fast = 0; fast < arr.length; fast++)
        {
            if (arr[fast] % 2 == 0)
            {
                int temp = arr[fast];
                arr[fast] = arr[slow];
                arr[slow] = temp;
                slow++;
            }
        }
        for (int item : arr)
        {
            System.out.print(item + " ");
        }
    }
}
