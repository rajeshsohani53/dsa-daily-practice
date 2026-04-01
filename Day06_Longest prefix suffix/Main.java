class Main{
    public static int longestPreSuf(String str)
    {
        int strLen=str.length();
        int[] arr=new int[strLen];
        int prefix=0;
        int suffix=1;
        while (suffix<strLen) {
            if(str.charAt(prefix)==str.charAt(suffix))
            {
                arr[suffix]=prefix+1;
                prefix++;
                suffix++;
            }
            else{
                if(prefix==0)
                {
                    arr[suffix]=0;
                    suffix++;
                }else
                {
                    prefix=arr[prefix-1];
                }
            }
        }
        return arr[strLen-1];
    }
    public static void main(String[] args) {
        //System.out.println(longestPreSuf()); 
         System.out.println(longestPreSuf("aabaacaabaa"));       
    }
}