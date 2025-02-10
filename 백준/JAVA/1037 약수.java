
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int result = 0;

        int[] divisor = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        Arrays.sort(divisor);

        if (divisor.length == 1){
            result = divisor[0] * divisor[0];
        }else{
            result = divisor[0] * divisor[divisor.length-1];
        }


        bw.write(String.valueOf(result));

        bw.flush();
        bw.close();
        br.close();
    }
}
