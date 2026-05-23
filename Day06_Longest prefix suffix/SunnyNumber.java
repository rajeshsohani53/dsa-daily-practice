public class SunnyNumber {
    public static void main(String[] args) {
        int no = 31;
        int check = no + 1;
        int squareroot = (int) Math.sqrt(check);
        if (squareroot * squareroot == check) {
            System.out.println(no + " is a Sunny number");
        } else {
            System.out.println(no + " is not a Sunny number");
        }
    }
}
