import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;
/*백준 1269번*/

public class SymmetricSet {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int aNum = Integer.parseInt(st.nextToken());
        int bNum = Integer.parseInt(st.nextToken());

        HashSet<Integer> Aset = new HashSet<>();
        HashSet<Integer> Bset = new HashSet<>();

        st = new StringTokenizer(br.readLine());
        for(int i =0; i<aNum; i++){
            Aset.add(Integer.parseInt(st.nextToken()));
        }
        st = new StringTokenizer(br.readLine());
        for(int i =0; i<bNum; i++){
            Bset.add(Integer.parseInt(st.nextToken()));
        }

        int count = 0;
        for(int num : Aset){
            if(!Bset.contains(num)){
                count++;
            }
        }
        for(int num : Bset){
            if(!Aset.contains(num)){
                count++;
            }
        }
        System.out.println(count);
    }
}
