import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input size of table: ");
        int size = scanner.nextInt();

        String table = PythagoreanTable.create(size);

        System.out.println(table);
    }

    public static int task01(int a, int b) {

        return a > b ? a : b;
    }
}

