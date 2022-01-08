import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dik kenar uzunluğunu giriniz: ");
        int dikKenarUzunluk = scanner.nextInt();

        System.out.println("Dik kenar uzunluğunu giriniz: ");
        int dikKenarUzunluk2 = scanner.nextInt();

        int hipotenus = (int) Math.sqrt(dikKenarUzunluk * dikKenarUzunluk + dikKenarUzunluk2 * dikKenarUzunluk2);

        System.out.println("Hipotenüs: " + hipotenus);

        scanner.close();
    }
}
