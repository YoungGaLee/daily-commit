import java.util.Scanner;
import java.util.Arrays;

public class Main{
    public int inputNum(){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.nextLine();

        return num;
    }

    public int[] inputDivisor(){
        Scanner sc = new Scanner(System.in);
        int[] divisor = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        return divisor;
    }

    public int[] sortingDivisor(int[] divisor){
        Arrays.sort(divisor);
        return divisor;
    }

    public int divisorLess2(int[] sortedDivisor){
        int result = sortedDivisor[0] * sortedDivisor[0];
        return result;
    }

    public int divisor(int[] sortedDivisor){
        int result = sortedDivisor[0] * sortedDivisor[sortedDivisor.length - 1];
        //자바는 음수 인덱스 요청이 오면 예외 발생시킴
        return result;
    }

    public void solution(){
        int num = inputNum();
        int[] arrayDivisor = inputDivisor();
        int result = 0;

        int[] sortedDivisor = sortingDivisor(arrayDivisor);

        if (num == 1){
            result = divisorLess2(sortedDivisor);
        } else {
            result = divisor(sortedDivisor);
        }

        System.out.println(result);
    }

    public static void main(String[] args) {
        Main app = new Main();
        app.solution();
    }
}
