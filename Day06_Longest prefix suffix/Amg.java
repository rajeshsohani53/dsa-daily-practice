import java.util.Scanner;

public class Amg {
    public static void main(String[] args) {
        System.out.println("Enter the no to check is the angstrom or not");
        Scanner sc=new Scanner(System.in);

        int num=sc.nextInt();
        int copy=num;
        int rev=0;
        int sum=0;
    while(num!=0)//for(int i=0;i<3;i++)//while(num!=0)
    {
        int rem=num%10;
        sum=sum+(int)Math.pow(rem, 3);
        num=num/10;
    }
     if(sum==copy)
     {
        System.out.println(copy+" no is the angstrom no");
     }
     else
     {
        System.out.println(copy+" no is not a angstrom no");
     }

    }
}
/*
what is the angstrom no :
1^3+3^3+5^3==135 then the no is the angstrom
*/