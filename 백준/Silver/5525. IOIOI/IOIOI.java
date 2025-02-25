import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());     // O 개수 : N
        int lenP = 2*N + 1;                          // P(n)의 길이 : 2*N+1
        int lenS = Integer.parseInt(br.readLine());  // S의 길이
        String S = br.readLine();                    // S

        char before = 'O';
        int count = 0;
        int result = 0;
        for (int i=0; i<lenS; i++){

            if (before == S.charAt(i)){
                count = 0; // oo
                if(S.charAt(i) == 'I'){
                    count++;
                }
            } else {
                count++;
            }

            if (count == lenP){
                result++;
                count -= 2;
            }
            before = S.charAt(i);
        }
        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
    }
}
