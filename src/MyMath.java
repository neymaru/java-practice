public class MyMath {
    // 자동생성 - 기본생성자는 생성자가 없을 경우 컴파일 시 자동 생성된다.
    private MyMath() {
        // 생성자의 접근제한자가 private 하다는 것은 인스턴스 생성을 못하게 한다는 의미
        // 인스턴스를 생성하지 못하면 인스턴스 메소드들은 사용할 수 없다.
    }
    public static int abs(int x) {
        if (x < 0)
            return x * -1;
        else
            return x;
    }

}
