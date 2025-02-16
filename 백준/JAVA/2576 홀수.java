import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        int sum = 0;
        int min = Integer.MAX_VALUE;
        boolean oddExist = false;


        for (int i=0; i<7; i++){
            int num = Integer.parseInt(br.readLine());

            if(num%2 == 1){
                oddExist = true;
                sum += num;
                min = Math.min(min, num);
            }
        }

        if (oddExist){
            bw.write(sum + "\n" + min);
        } else {
            bw.write("-1");
        }



        bw.flush();
        bw.close();
        br.close();
    }
}
