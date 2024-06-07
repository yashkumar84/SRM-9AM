public class PrintDigit {
    static void printDigit(int num) {
        if (num == 0)
            return;
        System.out.println(num);
        printDigit(num - 1);
    }

    public static void main(String[] args) {
        printDigit(5);
    }

}
