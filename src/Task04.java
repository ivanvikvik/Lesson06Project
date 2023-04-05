public class Task04 {
    public static boolean task04(int width, int length, int a, int b) {
        return width > 0 && length > 0
                && (width <= a && length <= b || width <= b && length <= a);

    }
}
