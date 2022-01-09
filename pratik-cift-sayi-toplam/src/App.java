import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // Java döngüler ile kullanıcının girdiği sayıya kadar çift olan sayıları bulan
        // programı yazıyoruz.

        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        // Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan 3 ve 4'e tam
        // bölünen sayıların ortalamasını hesaplayan programı yazınız.

        System.out.println("===========================================================");
        
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                list.add(i);
            }

        }
        System.out.println(list);
        int ortalama = 0;

        for (Integer i : list) {
            ortalama += i;
        }
        System.out.println(ortalama / list.size());

        sc.close();
    }
}
