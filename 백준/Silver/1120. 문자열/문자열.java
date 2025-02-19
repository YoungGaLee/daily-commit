import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] S = br.readLine().split(" ");
        String filter = S[0];
        String window = S[1];

        int result = Integer.MAX_VALUE;
        int num = window.length() - filter.length()+1;
        for(int i=0; i<num; i++){
            int count = 0;
            for(int j=0; j<filter.length();j++){
                if(filter.charAt(j) != window.charAt(i+j)){
                    count += 1;
                }
            }
            if (result > count){
                result = count;
            }
        }
        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
    }
}
