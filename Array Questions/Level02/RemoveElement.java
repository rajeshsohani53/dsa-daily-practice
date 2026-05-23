public class RemoveElement
{
    public static void main(String[] args) {
        int[] arr = {3, 2, 2, 3, 4, 3};
        int target = 4;
        int slow = 0;
        for (int fast = 0; fast < arr.length; fast++)
        {
            if (arr[fast] != target)
            {
                arr[slow] = arr[fast];
                slow++;
            }
        }
        for (int i = 0; i < slow; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}
