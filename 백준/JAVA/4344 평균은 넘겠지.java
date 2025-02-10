import java.util.Scanner;
import java.util.Arrays;

public class Main{
    public int inputCaseNum(){
        Scanner sc = new Scanner(System.in);
        int caseNum = sc.nextInt();
        sc.nextLine();

        return caseNum;
    }

    public int[] inputStudentScore(){
        Scanner sc = new Scanner(System.in);
        int studentNum = sc.nextInt();
        
        int[] studentScore = new int[studentNum];
        for (int i=0; i<studentNum; i++){
            studentScore[i] = sc.nextInt();
        }
        return studentScore;
    }

    public double avg(int[] studentScore){
        double sum = 0;
        for (int score : studentScore){
            sum += score;
        }
        double avgScore = sum / studentScore.length;
        
        return avgScore;
    }

   public double checkOverAvg(double avgScore, int[] studentScore){
        double count = 0;
        for (int score : studentScore){
            if (score > avgScore){
                count += 1;
            }
        }
        return count;
   }


    public void solution(){
        int caseNum = inputCaseNum();

        for (int i=0; i<caseNum; i++){
            int[] studentScore = inputStudentScore();
            double avgScore = avg(studentScore);
            double aboveStudent = checkOverAvg(avgScore, studentScore);
            double result = aboveStudent / studentScore.length;
            System.out.printf("%.3f%%",result*100);
        }
    }

    public static void main(String[] args) {
        Main app = new Main();
        app.solution();
    }
}


/*


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
*/



