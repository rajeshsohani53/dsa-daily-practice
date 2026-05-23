public class Seven_digitCaptch {
    public static void main(String[] args) {
        // 48-57---decimal 0 to 9
        // 97-122------ a to z
        // 65-90 ------ A to Z
        // Expected out O/P is 7 character f8hj2IA
        String captcha="";
       for(int i=0;i<7;i++)
       {        
            //(min to max) →
            //(int)(Math.random() * (max - min + 1)) + min
            int temp=(int)(Math.random()*3)+1;
            if(temp==1)
            {
                captcha+=(char)((int)(Math.random() * 26) + 97);//a(97) to  z(122)=  
                
            }
            if(temp==2)
            {
                captcha+=(char)((int)(Math.random()*26)+65);//65-90 ------ A to Z
            }
            if(temp==3)
            {
                captcha+=(char)((int)(Math.random()*10)+48);//48-57---decimal 0 to 9
            }

       }    
       System.out.print(captcha);
    }    
}
