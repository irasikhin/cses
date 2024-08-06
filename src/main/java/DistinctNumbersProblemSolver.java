import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class DistinctNumbersProblemSolver {
    private static final BufferedReader READER = new BufferedReader(
            new InputStreamReader(System.in),
            8192
    );

    public static void main(String[] args) throws IOException {
        var count = Long.parseLong(READER.readLine(), 10);
        var input = READER.readLine();
        var length = input.length();
        var set = new HashSet<>();
        var wordCount = 0;
        long i = 0, start = 0;
        for (; i < length && wordCount < count; i++) {
            var ch = input.charAt((int) i);
            if (ch == ' ') {
                set.add(Long.parseLong(input, (int) start, (int) i, 10));
                start = i + 1;
                wordCount++;
            }
        }
        set.add(Long.parseLong(input, (int) start, (int) i, 10));
        System.out.println(set.size());
    }
}
