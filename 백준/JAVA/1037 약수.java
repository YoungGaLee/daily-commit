//java.util.NoSuchElementException는 존재하지 않는 것을 가져오려고 할 때 발생
//Scanner에서 더 이상 입력받을 수 있는 값이 없을 때 발생. 입력이 끝났다는 EOF가 없어서 발생되는 에러 // (EOF : End Of File)
//Scanner에서 EOF처리는 java.util.Scanner.hashNextInt();를 통해 처리할 수 있음 (while + hashNextInt())
// hashNextInt() : Scanner 객체 입력값이 int일때만 true > while False 탈출방식 사용하여 eof처리함.
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
