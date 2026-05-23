/*
public class temp02 {
    public static void main(String[] args) {
        int[] arr = {10,5,12,8,3,15};
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]>arr[j])
                {
                    int a=arr[i];
                    arr[i]=arr[j];
                    arr[j]=a;
                }
            }
        }
        //print array
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }   
}
-------> this code is corrct partially but it has some mistakes 
*/
class temp02 {
    public static void main(String[] args) {
        int[] arr = { 10, 5, 12, 8, 3, 15 };
        for (int i = 0; i < arr.length; i++) {
            int Minimum_element = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[Minimum_element] > arr[j]) {
                    Minimum_element = j;
                }
            }
            // only ONE swap
            int temp = arr[i];
            arr[i] = arr[Minimum_element];
            arr[Minimum_element] = temp;
        }
        // print array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}