public class App {
    public static void main(String[] args) throws Exception {
        int arr[] = { 7, 5, 1, 8, 3, 6, 0, 9, 4, 2 };
        long start = System.nanoTime();
        int binarySearch = binarySearch(arr, 0, arr.length - 1, 8);
        long end = System.nanoTime();
        System.out.println("Time taken: " + (end - start) + " ns");
        System.out.println("Index: " + binarySearch);
    }

    static int binarySearch(int arr[], int lowIndex, int highIndex, int find) {

        if (highIndex >= lowIndex) {
            int mid = lowIndex + (highIndex - lowIndex) / 2;

            // If the element is present at the
            // middle itself
            if (arr[mid] == find)
                System.out.println("Element is present at index " + mid);

            // If element is smaller than mid, then
            // it can only be present in left subarray
            if (arr[mid] > find)
                return binarySearch(arr, lowIndex, mid - 1, find);

            // Else the element can only be present
            // in right subarray
            return binarySearch(arr, mid + 1, highIndex, find);
        }

        // We reach here when element is not present
        // in array
        return -1;
    }
}
