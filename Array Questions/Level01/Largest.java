public class Largest {
    public static void main(String[] args) {
        int[] arr={12,35,1,10,34,1};
        int largest=-1;
        int secondlargest=-1;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>=largest)
            {
                largest=arr[i];
            }

        }
        System.out.println(largest);
    }
}
