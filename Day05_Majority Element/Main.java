class Main
{
    public static int majority(int arr[])
    {
        int count=0;
        int maj=0;
        for(int i=0;i<arr.length;i++)
        {
            if(count==0)
            {
                maj=arr[i];
                count++;
            }else if(arr[i]==maj)
            {
                count++;
            }else
            {
                count--;
            }
        }
        return maj;
    }
    public static void main(String[] args) {
        System.out.println(majority(new int[]{3,3,4}));
    }
}