public class Exception7 {
    public static void main(String[] args) {
        try {
            ExceptionObj7 exobj = new ExceptionObj7();
            int value = exobj.divide(10, 0);
            System.out.println(value);
        } catch (MyException ex) {  // 4. 사용자가 만든 MyException을 catch로 감싸서 실행
            System.out.println("사용자 정의 Exception이 발생했네요.");
        }
    }
}

class ExceptionObj7 {
    public int divide(int i, int k) throws MyException {    // 3. divide 메소드를 사용하는 사람은 MyException을 처리해줘야 함
        int value = 0;
        try {
            value = i / k;  // 1. JVM이 ArithmeticException 인스턴스를 만들어서 throw 해줘서 catch로 받음
        } catch (ArithmeticException ae) {
            throw new MyException("0으로 나눌 수 없습니다.");    // 2. catch로 받은 것을 프로그래머가 MyException 을 생성해서 divide를 호출한 곳에 throw
        }
        return value;
    }
}

