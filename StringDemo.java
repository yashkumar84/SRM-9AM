public class StringDemo {
    static void reverse(char[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        String str = "Yash";
        System.out.println(str);
        str = str + "Ram";
        System.out.println(str);
        char arr[] = str.toCharArray();
        reverse(arr);
        // System.out.println(arr);
        for (char a : arr) {
            System.out.print(a + " ");
        }
        str = new String(arr);
        System.out.println(str);

    }

}
