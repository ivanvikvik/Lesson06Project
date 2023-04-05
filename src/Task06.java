
public class Task06 {
    public static boolean task06(int a, int b, int c) {
        return a > 0 && b > 0 && c > 0
                && (a + b) > c && (a + c) > b && (b + c) > a;
    }
}
