import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int result;

        ArrayList<Integer> fibo = new ArrayList<>();
        fibo.add(0, 0);
        fibo.add(1, 1);

        for (int i=2 ; i<N+1 ; i++){
            fibo.add(i,(fibo.get(i-2) + fibo.get(i-1)));
        }

        bw.write(String.valueOf(fibo.get(N)));

        bw.flush();
        bw.close();
        br.close();
    }
}
