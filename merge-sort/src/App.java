
public class App {
    public static void main(String[] args) throws Exception {

        // [16,21,11,8,12,22] -> Merge Sort

        int[] arr = { 16, 21, 11, 8, 12, 22 };
        int len = arr.length;

        System.out.println("Before Sorting: ");
        for (int i = 0; i < len; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("\nAfter Sorting: ");
        long startTime = System.nanoTime();
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        System.out.println("Duration: " + duration);
        for (int i = 0; i < len; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
