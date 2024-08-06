import java.io.IOException;

public class WeirdAlgorithmProblemSolver {
    public static void main(String[] args) throws IOException {
        var input = readLong();
        System.out.print(input);
        while (input != 1L) {
            if (input % 2L == 0) {
                input = input >> 1;
            } else {
                input = (input << 1) + input + 1L;
            }
            System.out.print(" " + input);
        }
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
