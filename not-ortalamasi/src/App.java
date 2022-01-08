import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        // Java ile Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik derslerinin sınav puanlarını kullanıcıdan alan ve ortalamalarını hesaplayıp ekrana bastırılan programı yazın.

        Scanner input = new Scanner(System.in);
        System.out.println("Matematik: ");
        int matematik = input.nextInt();
        System.out.println("Fizik: ");
        int fizik = input.nextInt();
        System.out.println("Kimya: ");
        int kimya = input.nextInt();
        System.out.println("Turkce: ");
        int turkce = input.nextInt();
        System.out.println("Tarih: ");
        int tarih = input.nextInt();
        System.out.println("Muzik: ");
        int muzik = input.nextInt();

        int ortalama = (matematik + fizik + kimya + turkce + tarih + muzik) / 6;

        System.out.println("Ortalama: " + ortalama);

        System.out.println(ortalama > 60 ? "Gecti" : "Kaldi");
        input.close();
    }
}
