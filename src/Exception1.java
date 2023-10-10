// B라는 사용자가 A라는 사용자가 만든 ExceptionObj1 이용한다.
public class Exception1 {
    public static void main(String[] args) {
        ExceptionObj1 exobj = new ExceptionObj1();
        try {
            int value = exobj.divide(10, 0);    // 0으로 나눌 수 없어서 에러
            System.out.println(value);
        } catch (ArithmeticException ex) {
            System.out.println("0으로 나눌 수 없습니다.");
        }
    }
}

// A라는 사용자
//class ExceptionObj1 {
//    public int divide(int i, int k) {
//        int value = 0;
//        value = i / k;  // 정수를 0으로 나누면 ArithmeticException 에러 발생
//        return value;
//    }
//}

// try-catch를 이용해 예외처리
class ExceptionObj1 {
    public int divide(int i, int k) {
        int value = 0;

        try {
            value = i / k;  // 정수를 0으로 나누면 ArithmeticException 에러 발생 -> catch로 넘어감
        } catch (ArithmeticException ex) {
            System.out.println("0으로 나눌 수 없습니다.");
            System.out.println(ex.toString());
        }
        return value;   // 에러가 나지 않고 0을 return 하지만 프로그램에 따라 잘못된 에러 처리가 더 큰 문제를 야기할 수도
    }
}
