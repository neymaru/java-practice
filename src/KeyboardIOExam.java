import java.io.BufferedReader;
import java.io.InputStreamReader;

public class KeyboardIOExam {
    public static void main(String[] args) throws Exception {
        // 키보드로부터 한 줄씩 입력받고 한 줄씩 출력하기
        // 키보드: System.in (InputStream 주인공)
        // 화면에 출력: System.out (PrintStream 주인공)
        // 키보드로 입력받는다는 건 문자를 입력받는 것 -> char 단위 입출력
        // char단위 입출력 클래스는 Reader, Writer
        // 한 줄 읽기: BufferedReader라는 클래스는 readLine이라는 메소드를 가지고 있다.
        //             BufferedReader는 장식. 주인공이 없으면 쓸 수 없다.
        //              주인공은 어디로부터 읽어들일 것이냐, 어디로 쓸 것이냐를 나타냄.
        // 한 줄 쓰기: PrintStream, PrintWriter

        // BufferedReader x
        // CharReader x - 문자로부터 읽어들인다.
        // FilterReader x - 장식. Reader를 넣어줘야 한다.
        // InputStreamReader(InputStream in) - 장식
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 사용자가 입력한 갑을 System.in이 읽어들이고,
        // 읽어들인 걸 InputStreamReader에게 전달하고,
        // InputStreamReader는 BufferedReader에게 전달하고,
        // BufferedReader는 문자로 리턴

        String line = null;
        while ((line = br.readLine()) != null) {    // 한 줄 입력받기
            System.out.println("읽어들인 값: " + line);
        }
        br.readLine();  // readLine(): 한 줄씩 입력받고, 더 이상 읽어들일 것이 없으면 null 리턴
    }
}
