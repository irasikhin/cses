import java.io.IOException;

public class WeirdAlgorithmProblemSolver {
    public static void main(String[] args) throws IOException {
        var input = readLong();
        var builder = new StringBuilder();
        builder.append(input);
        while (input != 1L) {
            if (input % 2L == 0L) {
                input = input / 2L;
            } else {
                input = (input * 3L) + 1L;
            }
            builder.append(" ").append(input);
        }
        System.out.print(builder);
    }

    private static long readLong() throws IOException {
        long ret = 0;
        boolean dig = false;
        for (int c = 0; (c = System.in.read()) != -1; ) {
            if (c >= '0' && c <= '9') {
                dig = true;
                ret = ret * 10 + (c - '0');
            } else if (dig)
                break;
        }
        return ret;
    }
}
