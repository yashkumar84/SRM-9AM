public class InsertionSort {
    public static void main(String[] args) {
        int arr[] = { 3, 4, 1, 7, 5, 1 };
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int value = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > value) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = value;

        }

        for (int i : arr) {
            System.out.print(i + " ");
        }

    }

}
