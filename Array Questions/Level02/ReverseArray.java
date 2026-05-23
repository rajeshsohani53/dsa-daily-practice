public class ReverseArray
{
    public static void main(String[] args) {
        int[] arr = {3, 7, 1, 9, 2, 8};
        int left = 0;
        int right = arr.length - 1;
        while (left < right)
        {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        for (int item : arr)
        {
            System.out.print(item + " ");
        }
    }
}
