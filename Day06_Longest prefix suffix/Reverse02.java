public class Reverse02 {
    public static void main(String[] args) {
        int num=135;
        String str=String.valueOf(num);
        String t="";
        for(int i=str.length()-1;i>=0;i--)
        {
            System.out.print(str.charAt(i)+" ");
            t=t+str.charAt(i);

        }
        if(String.valueOf(str).equals(t))
        {
            System.out.println("NO is pallindrom");
        }
        else
        {
            System.out.println("not pallindrome");
        }
    }    
}
