class temp01
{
    public static void main(String[] args) {
        int[] arr = {10,5,12,8,3,15};

        for(int i = 0; i < arr.length; i++)
        {
            boolean swap = false;

            for(int j = 0; j < arr.length - i - 2; j++)
            {
                if(arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap = true;
                }
            }

            // Print full array after each pass
            for(int k = 0; k < arr.length; k++)
            {
                System.out.print(arr[k] + " ");
            }
            System.out.println();

            if(!swap)
            {
                break;
            }
        }
    }
}