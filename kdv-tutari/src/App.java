import java.math.BigDecimal;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);
        System.out.println("Para: ");
        BigDecimal para = input.nextBigDecimal();

        System.out.println("Kdvsiz fiyat: " + para);

        if (para.compareTo(BigDecimal.valueOf(1000)) < 0 && para.compareTo(BigDecimal.valueOf(0)) > 0) {
            BigDecimal kdv = para.multiply(BigDecimal.valueOf(0.18));
            System.out.println("Kdv: " + kdv);
            System.out.println("Kdvli fiyat: " + para.add(kdv));
        } else {
            BigDecimal kdv = para.multiply(BigDecimal.valueOf(0.08));
            System.out.println("Kdv: " + kdv);
            System.out.println("Kdvli fiyat: " + para.add(kdv));
        }

        input.close();
    }
}
