import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String update;
        String result;
        String inputWord = br.readLine();
        String prohibit = "CAMBRIDEGE";

        for (int i=0; i<prohibit.length(); i++){
            update = "";
            for(int j=0; j<inputWord.length(); j++){
                if (prohibit.charAt(i) == inputWord.charAt(j)){
                    continue;
                }else{
                    update += inputWord.charAt(j);
                }
            }
            inputWord = update;
        }
        result = inputWord;

        bw.write(result);

        bw.flush();
        bw.close();
        br.close();
    }
}
