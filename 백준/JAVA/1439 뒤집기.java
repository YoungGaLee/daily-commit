import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String S = br.readLine();
        char start = S.charAt(0);
        int count = 0;

        for(int i=1; i<S.length(); i++){
            if (start != S.charAt(i)){
                count += 1;
                start = S.charAt(i);
            }
        }
        if(count%2==1){
            bw.write(String.valueOf(count/2 +1));
        } else {
            bw.write(String.valueOf(count/2));
        }

        bw.flush();
        bw.close();
    }
}
