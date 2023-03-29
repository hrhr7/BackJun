import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;
/*백준 17219번*/

public class FindPwd {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int total = Integer.parseInt(st.nextToken()); // 저장된 사이트 주소 갯수
        int num = Integer.parseInt(st.nextToken()); // 찾으려는 사이트 주소 갯수

        HashMap<String, String> map = new HashMap<>();
        // map에 site 주소와 비밀번호 각 각 key, value 지정해서 저장
        for(int i =0; i<total; i++){
            st = new StringTokenizer(br.readLine());
            String site = st.nextToken();
            String pwd = st.nextToken();
            map.put(site,pwd);
        }
        StringBuilder sb = new StringBuilder();
        for(int i =0; i<num; i++){
            String find = br.readLine();
            sb.append(map.get(find) + "\n");
        }
        System.out.println(sb);
    }
}
