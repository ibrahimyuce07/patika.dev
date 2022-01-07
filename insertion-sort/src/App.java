public class App {
    public static void main(String[] args) throws Exception {

        int[] dizi = { 22, 27, 16, 2, 18, 6 };
        long startTime = System.nanoTime();
        int n = dizi.length;
        for (int i = 0; i < n; ++i) {
            int b = i - 1;
            int key = dizi[i];
            while (b >= 0 && dizi[b] > key)
                dizi[b + 1] = dizi[b--];
            dizi[b + 1] = key;
        }

        long endTime = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.println("Total time: " + totalTime + " milliseconds");
        System.out.println("Sorted array: ");
        for (int i = 0; i < dizi.length; i++) {
            System.out.print(dizi[i] + " ");
        }

    }
}
