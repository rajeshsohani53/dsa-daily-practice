public class Day01_TwoPointer_TwoSum
{
    public static void main(String[] args) {
        int arr[]={2,3,4,7,11,15};
        int target=10;
        int left=0;
        int right=arr.length-1;
        boolean found=false;
        while (left<right) {
            int sum=arr[left]+arr[right];
            if(sum==target)
            {
                System.out.println("Pair: " + arr[left] + " " + arr[right]);
                found=true;
                break;
            }else if (sum>target)
            {
                right--;
            }
            else
            {
                left++;
            }
            
        }
        if(!found)
            {
                System.out.println("pair not found");
            }
    }
}