import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        double result = 0.0;

        for (int i=0; i<N; i++){
            double sum = 0;
//            int studentNum = Integer.parseInt(String.valueOf(br.read()));

            int[] studentScore = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int studentNum = studentScore[0];
            for (int j=1; j<=studentNum ; j++){
                sum += studentScore[j];
            }
            double avgScore = sum / studentNum;
            double count = 0;
            for (int k=1; k<=studentNum ; k++) {
                if (studentScore[k] > avgScore) {
                    count += 1;
                }
            }
            result = count / studentNum * 100;
            String formResult = String.format("%.3f%%\n", result);
            bw.write(String.valueOf(formResult));
        }


        bw.flush();
        bw.close();
        br.close();
    }
}