public class NeonNo {
 public static void main(String[] args) {
    int no=9;
    int copy=no;
    int square=no*no;
    int sum=0;
    while (square!=0) {
        int reminder=square%10;
        sum=sum+reminder;
        square=square/10;
    }
    if(sum==copy)
    {
        System.out.println("yes the given no is neon no");
    }else{
        System.out.println("the given no is not a neon no");
    }
 }    
}
