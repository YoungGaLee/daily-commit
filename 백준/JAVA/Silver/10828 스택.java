import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int Num = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        ArrayList<Integer> stack = new ArrayList<>();

        for(int i = 0; i < Num; i++) {
            String[] input = br.readLine().split(" ");
            String command = input[0];
            int N = 0;

            switch (command) {
                case "push" :
                    N = Integer.parseInt(input[1]);
                    stack.add(N);
                    break;
                case "pop":
                    if(stack.isEmpty()){
                        sb.append(-1).append("\n");
                        break;
                    }
                    sb.append(stack.get(stack.size()-1)).append("\n");
                    stack.remove(stack.size()-1);
                    break;
                case "size" :
                    sb.append(stack.size()).append("\n");
                    break;
                case "empty" :
                    sb.append(stack.isEmpty() ? 1 : 0).append("\n");
                    break;
                case "top" :
                    if(stack.isEmpty()){
                        sb.append(-1).append("\n");
                        break;
                    }
                    sb.append(stack.get(stack.size()-1)).append("\n");
                    break;
            }
        }
        System.out.println(sb);
    }

}
