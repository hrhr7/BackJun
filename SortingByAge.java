import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;
/*백준 10814번*/

public class SortingByAge {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[][] array = new String[n][2];

        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine()); // for문 안에 있어야함
            array[i][0] = st.nextToken(); //나이 입력
            array[i][1] = st.nextToken(); //이름 입력
        }
        Arrays.sort(array, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                // o1은 첫번째 행, o2는 두번째 행
                if(o1[0]==o2[0]){
                    return 1;
                }else{
                    return Integer.parseInt(o1[0])-Integer.parseInt(o2[0]);
                }
            }
        });
        for(int i=0; i<n; i++){
            System.out.println(array[i][0]+" "+array[i][1]);
        }
    }
}
