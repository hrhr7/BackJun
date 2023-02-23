import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class StackString {
    public static void main(String[] args) throws IOException {
//        완전한 수식에는 stack에 아무것도 없어야 한다
//        ( 쓰면 push ) 쓰면 여는 괄호 pop
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i<T; i++){
            Stack<Character> stack = new Stack<>(); //  위치 위로 하면 오류남
            String str = br.readLine(); //괄호 입력값
            boolean isVPS = true;

            for(int j = 0; j<str.length(); j++){
                char c = str.charAt(j);

                if(c == '('){
                    stack.push(c);
                }else if(c == ')'){
                    if(!stack.empty()){
//                        stack에 ( 존재하면 stack 값을 삭제
                        stack.pop();
                    }else{
                        isVPS = false;
                        break;
                    }
                }
            }
            if(!stack.isEmpty()){
                isVPS = false;
            }

            if(isVPS){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }

    }
}
