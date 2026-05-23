public class SevenDigitCaptcha {
    public static void main(String[] args) {
        String captcha = "";
        for (int i = 0; i < 7; i++) {
            int temp = (int) (Math.random() * 3) + 1;
            if (temp == 1) {
                captcha += (char) ((int) (Math.random() * 26) + 97); // a-z
            }
            if (temp == 2) {
                captcha += (char) ((int) (Math.random() * 26) + 65); // A-Z
            }
            if (temp == 3) {
                captcha += (char) ((int) (Math.random() * 10) + 48); // 0-9
            }
        }
        System.out.print(captcha);
    }
}
