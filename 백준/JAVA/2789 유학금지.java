// Java 11에서는 안됨. (14부터 가능)

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String inputWord = br.readLine();
        String result = "";
        char check;

        for (int i=0; i<inputWord.length(); i++){
            check = inputWord.charAt(i);
            switch (check){
                case 'C','A', 'M', 'B', 'R', 'I', 'D', 'G', 'E':
                      // Java 11에서는 안됨. (14부터 가능)
                    break;
                default:
                    result += check;
            }
        }

        bw.write(result);

        bw.flush();
        bw.close();
        br.close();
    }
}
