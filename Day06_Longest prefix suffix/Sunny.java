public class Sunny {
   public static void main(String[] args) {

        int no = 31;
        int check = no + 1;

        int squareroot = (int) Math.sqrt(check);

        if (squareroot * squareroot == check) {
            System.out.println("The number is sunny number");
        } else {
            System.out.println("Not a sunny number");
        }
   }
}