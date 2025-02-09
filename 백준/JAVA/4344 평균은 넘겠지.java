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
