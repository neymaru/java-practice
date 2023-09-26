public class Hello2 {
    // main 메소드보다 먼저 실행되는 static 블록
    static int i;
    static {
        i = 500;
        System.out.println("static block"); // 원래는 static field를 초기화 한다.
    }
    public static void main(String[] args) {
        System.out.println("Hello");
    }
}

// javac Hello2.java
// java Hello2

