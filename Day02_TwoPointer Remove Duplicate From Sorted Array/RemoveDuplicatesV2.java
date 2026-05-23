public class RemoveDuplicatesV2
{
    public static void main(String[] args) {
        int arr[] = {1, 1, 2};
        int j = 0;
        int count = 0;
        for (int i = 1; i < arr.length; i++)
        {
            if (arr[i - 1] != arr[i])
            {
                arr[j++] = arr[i];
            }
            else
            {
                count++;
            }
        }
        arr[j] = arr[arr.length - 1];
        for (int i = 0; i <= j; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("count = " + count);
    }
}
