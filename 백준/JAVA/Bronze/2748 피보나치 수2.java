import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        BigInteger result = new BigInteger("1");

        BigInteger one = BigInteger.ZERO;
        BigInteger two = BigInteger.ONE;

        for (int i=2 ; i<N+1 ; i++){
            result = one.add(two);
            one = two;
            two = result;
        }

        bw.write(String.valueOf(result));

        bw.flush();
        bw.close();
        br.close();
    }
}
