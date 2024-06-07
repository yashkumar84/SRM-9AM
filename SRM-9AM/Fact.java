public class Fact {
    static int fact(int num) {
        if (num == 1) {
            return 1;
        }
        return num * fact(num - 1);
    }

    public static void main(String[] args) {
        int ans = fact(4);
        System.out.println(ans);
    }

}
