package Java.BaiTap;

public class SoNguyenToNhoHon100 {
    public static void main(String[] args) {
        boolean check = true;
        int number = 2;
        while (number < 100) {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                System.out.println(number);
            } else {
                check = true;
            }
            number++;
        }
    }
}
