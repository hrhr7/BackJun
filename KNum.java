import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
/*백준 11004번*/
public class KNum {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int num = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] array = new int[num];

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<num; i++){
            array[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(array);
        System.out.println(array[k-1]);

    }
}
