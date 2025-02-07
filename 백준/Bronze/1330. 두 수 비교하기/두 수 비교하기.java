import java.util.Scanner;

public class Main {
    public void solution(){
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int result = num1 - num2;

        if (result == 0){
            System.out.println("==");
        } else if(result > 0){
            System.out.println(">");
        } else {
            System.out.println("<");
        }
    }

    public static void main(String[] args){
        Main app = new Main();
        app.solution();
    }
}
