public class Day03 {

     public static String SubStr(String str)
    {
      // String sub=" ";
       String longest = "";
        int right=0;
        int len=str.length();
        int left=0;
        int iteration=(str.length())*(str.length()+1)/2;
        for(int i=0;i<iteration;i++)
        {
            if(right==len)
            {
                left++;
                right=left;
            }
            right++;
           // System.out.println(str.substring(left,right));
            String sub=str.substring(left,right);
            boolean flag=pal(sub);
            if (flag && sub.length() > longest.length())
            {
                longest = sub;
            }

            
        }
        return longest;
    }

    public static boolean pal(String str)
    {
        int right=str.length();
        int count=0;
        for(int left=0;left<str.length()/2;left++)
        {
            if(str.charAt(left)!=str.charAt(right-1))
            {
                return false;
            }else
            {
                count++;
                right--;
            }
        }
        //System.out.println("count :"+count);
        return true;
    }

   /*  public static String SubStr(String str) {
    String longest = "";
    int right = 0, left = 0;
    int len = str.length();
    int iteration = len * (len + 1) / 2;

    for (int i = 0; i < iteration; i++) {
        if (right == len) {
            left++;
            right = left;
        }
        right++;
        String sub = str.substring(left, right);  // current substring

        if (pal(sub) && sub.length() > longest.length()) {
            longest = sub;  // track longest palindrome
        }
    }
    return longest;
}

public static boolean pal(String str) {
    for (int left = 0; left < str.length() / 2; left++) {
        int right = str.length() - 1 - left;
        if (str.charAt(left) != str.charAt(right)) return false;
    }
    return true;
}

*/
    public static void main(String args[])
    {
       // System.out.println(pal("radar"));
        System.out.println(SubStr("cbbd"));
    }
}
//brute force O(n³) solution is correct