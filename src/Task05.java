public class Task05 {
    public static String task05(int a, int b, int n) {

        if (a < 0 || b < 0 || n <= 0 || a == 0 && b == 0){
            return "error";
        }

        a *= n;
        b *= n;
        a += b / 100;
        b %= 100;

        return a + " " + b;
    }
}
