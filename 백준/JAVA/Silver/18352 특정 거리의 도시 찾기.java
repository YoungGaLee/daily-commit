import static java.util.Arrays.*;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nmkx = (br.readLine().split(" "));
        int n = Integer.parseInt(nmkx[0]);
        int m = Integer.parseInt(nmkx[1]);
        int k = Integer.parseInt(nmkx[2]);
        int startNode = Integer.parseInt(nmkx[3]);

        int[] record = new int[n]; // 각 도시에 방문기록용 리스트 생성 (초기값 0)
        List<List<Integer>> nodeMap = new ArrayList<>(n); // 입력된 도시(노드)의 연결맵
        for (int i = 0; i < n; i++) nodeMap.add(new ArrayList<>());

        for(int i=0 ; i<m ; i++){ // nodeMap에 입력
            String[] info = br.readLine().split(" ");
            int a = Integer.parseInt(info[0]);
            int b = Integer.parseInt(info[1]);

            nodeMap.get(a-1).add(b); // 단방향
        }

        Queue<Integer> nodeToVisit = new LinkedList<>(); // 이번에 방문할 도시리스트
        nodeToVisit.offer(startNode); // 우선 시작도시부터 방문리스트에 담는다.
        int distance = 1; // 거리가 1인 도시들을 방문
        record[startNode-1] = k + 100;

        for (int i=0; i<k+2 ; i++){// 거리가 k가 될때 까지 진행
            int size = nodeToVisit.size(); //방문리스트에 실시간으로 추가해주면 for문의 범위 바뀜 (범위고정을 위해)
            for (int j=0; j<size; j++){
                //record 방문기록 없는거 확인하고 추가 (불필요한 메모리 방지) // 메모리초과..
                int nodeIdx = nodeToVisit.poll() -1;
                if(record[nodeIdx] == 1) {
                    nodeToVisit.addAll(nodeMap.get(nodeIdx));
                    record[nodeIdx] = distance;
                }
            }
            distance += 1;
        }

        int result = -1;
        for (int i = 0; i < record.length; i++) {
            if (record[i] == k) {
                result = 1;
                System.out.println(i);
            }
        }
        if (result == -1){
            System.out.println(result);
        }
    }
}
