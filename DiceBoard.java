public class DiceBoard {
    static void diceBoard(int start, int target, String result) {
        if (start ==target) {
            System.ou0t.print(result + " ");
            return;
        }
        if (start > target) {
            return;
        }
        for (int i = 1; i <= 6; i++) {
            diceBoard(start + i, target, result + i);
        }
    }

    public static void main(String[] args) {
        diceBoard(0, 10, "");
    }
}