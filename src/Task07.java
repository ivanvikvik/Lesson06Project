public class Task07 {
    public static int task07(int number) {

        int result;

        if (number < 0)
            number *= -1;

        if (number > 9999)
            result = 0;
        else
            result = (number / 1000) + (number / 100 % 10) + (number / 10 % 10) + (number % 10);

        return result;
    }
}
