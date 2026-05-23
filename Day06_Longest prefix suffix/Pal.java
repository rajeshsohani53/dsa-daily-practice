import java.util.Scanner;

public class Pal {
    public static void main(String[] args) {
        System.out.println("Enter the no to check is the pallindrom or not");
        Scanner sc=new Scanner(System.in);
        int num = sc.nextInt();
        int revso = 0;
        int copy=num;
        int count = String.valueOf(num).length();
        for(int i=0;i<count;i++)
        {
            int rem=num%10;
            revso=(revso*10)+rem;
            //0*10+3=3
            //3*10+5=35
            //35*10+1=350+1=351
            num=num/10;
        }
        System.out.println("Reverse of "+copy+" is "+revso);
        System.out.println("copy :"+copy);
        System.out.println("num :"+num);
        if(revso==copy)
        {
            System.out.println(copy+" is the pallindrome no");
        }
        else
        {
            System.out.println(copy+" it is not a pallindrome no");
        }
    }
}
