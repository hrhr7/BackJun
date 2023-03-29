import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/*백준 10807*/

public class CountNum {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num  = Integer.parseInt(br.readLine());
        int[] arr = new int[num];
        StringTokenizer st = new StringTokenizer(br.readLine());

        int v = Integer.parseInt(br.readLine());
        int count= 0;

        for(int i =0; i<arr.length; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for(int i =0; i<arr.length; i++){
            if(arr[i]==v){
                count++;
            }
        }
        System.out.println("일치하는 정수 갯수는 : " + count);
    }
}
