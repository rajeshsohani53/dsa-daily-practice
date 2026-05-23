public class NeonNumber {
    public static void main(String[] args) {
        int no = 9;
        int copy = no;
        int square = no * no;
        int sum = 0;
        while (square != 0) {
            int reminder = square % 10;
            sum = sum + reminder;
            square = square / 10;
        }
        if (sum == copy) {
            System.out.println(copy + " is a Neon number");
        } else {
            System.out.println(copy + " is not a Neon number");
        }
    }
}
