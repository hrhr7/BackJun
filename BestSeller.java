import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BestSeller {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine()); //하루 동안 팔린 책의 개수
        HashMap<String,Integer> map = new HashMap<>();
        int cnt=0; // 가장 많이 팔린 책 수량 저장할 변수
        for(int i =0; i<num; i++){
            String book = br.readLine(); // 책의 제목
            map.put(book, map.getOrDefault(book,0)+1);
            cnt = Math.max(cnt,map.get(book));
        }
        // cnt가 최댓값인 책들을 리스트에 넣음
        List<String> list = new ArrayList<>();
        for(Map.Entry<String,Integer> entry : map.entrySet()){
            if(entry.getValue() == cnt) {
                list.add(entry.getKey());
            }
        }
        //list 오름차순 후 인덱스 0번 값 출력
        Collections.sort(list);
        System.out.println(list.get(0));
    }
}
