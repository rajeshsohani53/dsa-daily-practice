import java.util.Scanner;

public class Spy {
    public static void main(String[] args) {
        //1124: sum 1+1+2+4=4 and product 1*1*2*4=8 then the no is the Spy no 
        System.out.println("Enter the no to check is the no is Spy no or not ");
        Scanner sc=new Scanner(System.in);

        int num=sc.nextInt();
        int copy=num;
        int sum=0;
        int product=1;
        while (num!=0) {
            int rem=num%10;
            sum=sum+rem;
            product=product*rem;
            num=num/10;
        }
        if(product==sum)
        {
            System.out.println("the given no is the spy no ");
        }
        else
        {
            System.out.println(" the given no is not a spy no");
        }
    }
}
