class MaxSumSubarray
{
    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3;
        int itr = (arr.length) - k + 1;
        int a = 0;
        int b = 1;
        int c = 2;
        int sum = 0;
        int largest = 0;
        for (int i = 0; i < itr; i++)
        {
            System.out.print(arr[a] + " " + arr[b] + " " + arr[c]);
            System.out.println();
            sum = (arr[a] + arr[b] + arr[c]);
            if (sum > largest)
            {
                largest = sum;
            }
            a++;
            b++;
            c++;
        }
        System.out.println("Max Sum: " + largest);
    }
}
