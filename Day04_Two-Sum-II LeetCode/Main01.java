class Main01{
    public static int[] twoSumII(int arr[],int target)
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]+arr[j]==target)
                {
                    return new int[]{i+1,j+1};
                }
                
            }
        }
        return new int[]{0,0};
    }
    public static void main(String[] args) {
        int arr[]={2,7,11,15};
        int[] result = twoSumII(arr, 9);
        System.out.println(result[0]);
        System.out.println(result[1]);

        
    }
}