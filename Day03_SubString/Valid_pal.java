class Valid_pal
{
    static boolean checkStr(String s)
    {
        s=s.toLowerCase();
        s=s.replaceAll("[^a-z0-9]","");
        int j=s.length();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!=s.charAt(j-1-i))
            {
                return false;
            }
            
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(checkStr("race a car"));
    }
}