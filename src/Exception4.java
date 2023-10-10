import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exception4 {
    public static void main(String[] args) {
        try {
            // Runtime Exception과 Runtime Exception을 상속받는 Exception은 예외 처리르 안해줘도 컴파일이 잘 되지만
            // 일반적인 Exception을 상속받는 Checked Exception은 예외처리를 안해주면 컴파일 에러
            FileInputStream fis = new FileInputStream("Exception4.java");
        }catch (FileNotFoundException fnfe) {
            System.out.println("file을 찾을 수 없습니다.");
        }
    }
}
