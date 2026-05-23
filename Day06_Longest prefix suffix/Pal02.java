import java.util.Scanner;

public class Pal02 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no to check is the pallindrome or not");
        int num=sc.nextInt();
        int copy=num;
        int revno=0;
        while (num!=0)
        {
            int rem=num%10;
            revno=(revno*10)+rem;
            num=num/10;
        }
        System.out.println("reverse no is "+revno);
        //now we are checking is the no is palindrome or not
        if(revno==copy)
        {
            System.out.println(copy+" is the palindrom no");
        }else
        {
            System.out.println(copy+" is not the palindrome no");
        }
    
    }
}
//spy no 
//amgstrome no
