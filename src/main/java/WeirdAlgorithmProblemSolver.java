import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WeirdAlgorithmProblemSolver {
    private static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

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
        return Long.parseLong(READER.readLine());
    }
}
