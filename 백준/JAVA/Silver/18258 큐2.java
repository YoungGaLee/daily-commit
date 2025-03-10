import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        LinkedList<Integer> queue = new LinkedList<>();
        StringBuilder sb = new StringBuilder();

        int Num = Integer.parseInt(br.readLine());
        for(int i=0; i<Num; i++) {
            String[] input = br.readLine().split(" ");
            String command = input[0];
            int N = 0;

            switch (command) {
                case "push":
                    N = Integer.parseInt(input[1]);
                    queue.add(N);
                    break;
                case "pop":
                    if (queue.isEmpty()) {
                        sb.append(-1).append("\n");
                        break;
                    }
                    sb.append(queue.get(0)).append("\n");
                    queue.remove(queue.get(0));
                    break;
                case "size":
                    sb.append(queue.size()).append("\n");
                    break;
                case "empty":
                    sb.append(queue.isEmpty() ? 1 : 0).append("\n");
                    break;
                case "front":
                    if (queue.isEmpty()) {
                        sb.append(-1).append("\n");
                    } else {
                        sb.append(queue.get(0)).append("\n");
                    }
                    break;
                case "back":
                    if (queue.isEmpty()) {
                        sb.append(-1).append("\n");
                    } else {
                        sb.append(queue.get(queue.size() - 1)).append("\n");
                    }
                    break;
            }
        }
        System.out.println(sb);
    }
}
