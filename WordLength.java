import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WordLength {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = String.valueOf(br.readLine());
        int len = word.length();

        System.out.println(len);
    }
}
