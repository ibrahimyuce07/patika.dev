import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Gidilecek km: ");
        int km = sc.nextInt();

        double taksimetreKM = 2.20;
        double taksimetreAcilis = 10;
        double minimumTutar = 20;

        double toplamTutar = taksimetreAcilis + (km * taksimetreKM);
        if (toplamTutar < minimumTutar) {
            toplamTutar = minimumTutar;
        }

        System.out.println("Toplam tutar: " + toplamTutar);
    }
}
