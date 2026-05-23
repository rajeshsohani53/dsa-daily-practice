public class Temp {
    public static void main(String[] args) {
        int num = 153;
        int sum=0;
        for (int i = 0; i < 3; i++) {

        
            int rev = num % 10;
            System.out.println( (int) Math.pow(rev, 3) );
            sum=sum+(int) Math.pow(rev, 3);
            num=num/10;
        }
        System.out.println(sum);
    }
}
