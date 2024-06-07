public class TreeRec {
    static void tree(int n) {
        if (n < 1) {
            return;
        }

        System.out.println(n + "Pre call");
        tree(n - 1);
        System.out.println(n + "Mid call");
        tree(n - 2);
        System.out.println(n + "Post Call");

    }

    public static void main(String[] args) {
        tree(3);
    }

}
