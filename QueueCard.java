import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

/*백준 2164번*/

public class QueueCard {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Queue<Integer> que = new LinkedList<>();

        for(int i = 1 ; i<=N ; i++){
            que.offer(i);
        }
        while(que.size() != 1 ){
            que.poll(); // 첫번쨰 숫자 버림
            que.offer(que.poll()); // 첫번째 숫자 뒤로 넘김
        }
        System.out.println(que.poll());
    }
}
