public class CheckifArrayisSorted {
    public static void main(String[] args) {
        int[] arr={1, 1, 2, 2, 3};
        boolean flag=true;
        for(int i=0;i<arr.length-1;i++)
        {
           
            if(arr[i+1]<=arr[i])
            {
                flag=false;
                break;
            }
            
        }
        System.out.println(flag);
    }    
}