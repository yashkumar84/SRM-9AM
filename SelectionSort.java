public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = { 2, 4, 3, 5, 9, 7, 1 };
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_idx]) {
                    min_idx = j;
                }
            }

            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }

        for (int val : arr) {
            System.out.print(val + " ");
        }
    }

}
