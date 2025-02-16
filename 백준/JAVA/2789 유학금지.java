import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        String[] input = br.readLine().split(" ");
        int before = Integer.MIN_VALUE;
        String result = "Good";

        for (String num : input){
            int current = Integer.parseInt(num);
            if (current < before){
                result = "Bad";
                break;
            }
            before = current;
        }
        bw.write(result);

        bw.flush();
        bw.close();
    }
}
