public class PythagoreanTable {
    public static String create(int size) {
        StringBuilder builder = new StringBuilder();

        for (int j = 1; j <= size; j++) {
            for (int i = 1; i <= size; i++) {
                builder.append(i * j).append("\t");
            }
            builder.append("\n");
        }

        return builder.toString();
    }
}
