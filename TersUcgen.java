import  java.util.Scanner;
public class TersUcgen {
    public static void main(String[] args) {
        int n;

        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        n = input.nextInt();
        for (int i = n; i <= n; i--) {
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            if (i == 0) {
                break;
            }
            for (int k = 1; k <= (2 * i) - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
