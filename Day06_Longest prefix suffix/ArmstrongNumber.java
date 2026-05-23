public class ArmstrongNumber {
    public static void main(String[] args) {
        int num = 153;
        int copy = num;
        int sum = 0;
        while (num != 0) {
            int rem = num % 10;
            sum = sum + (int) Math.pow(rem, 3);
            num = num / 10;
        }
        if (sum == copy) {
            System.out.println(copy + " is an Armstrong number");
        } else {
            System.out.println(copy + " is not an Armstrong number");
        }
    }
}
