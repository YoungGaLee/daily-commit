import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        long price = 0;   // 거리에 따라 업데이트되는 실시간 가격 // 업데이트 안해도 되겠는데..?
        // > Min을 통해 최종 최저비용 출력
        int oilPrice = Integer.MAX_VALUE;     // 지금까지 간 도시중 최저 오일 가격
        // (이후 방문한 국가의 오일보다 비쌀 경우, oilprice 가격으로 오일을 구매 (최저 oilPrice였던 국가에서 구매한걸로 침)
        int distance = 0;   // 실시간 간 거리


        int N = Integer.parseInt(br.readLine());  // 도시 개수
        String[] distanceArr = br.readLine().split(" ");  // 인덱스 접근에서는 split가 유리하지 않을까 하는 생각
        String[] oilPriceArr = br.readLine().split(" ");  // 사실 마지막 인덱스 값은 필요없음.


        for(int i=0; i<N-1; i++) {  // 한 국가씩 방문하면서 현재까지 나온 최저오일비용과 비교해가며 리터구매 (다음 국가까지 가는 거리 참고하여)
            oilPrice = Math.min(Integer.parseInt(oilPriceArr[i]), oilPrice);  // 방문국가의 오일가격과 이전에 지나왔던 최저오일비용과 비교하여 갱신
            // 현재 국가의 오일가격이 더 비싸면 최저오일비용으로 구매 (> 이전 국가에서 구매한걸로)
            price += oilPrice * Long.parseLong(distanceArr[i]);
        }

        bw.write(String.valueOf(price));
        bw.flush();
        bw.close();
    }
}
