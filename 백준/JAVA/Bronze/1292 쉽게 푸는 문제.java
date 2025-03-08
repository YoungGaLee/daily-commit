import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder str = new StringBuilder();

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        int n = 1;
        int idex = 1;
        int result = 0;
        while(idex <= B){
            for(int i = 0; i < n; i++){
                if(A <= idex && idex <= B)
                    result += n;
                idex++;
            }
            n++;
        }

        str.append(result);

        System.out.print(str);
        br.close();
    }
}
