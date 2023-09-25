public class VendingMachine {
    // field: 가지는 것들
    // 생성자
    // method

    // 메소드 선언
    //[접근제한자] [static] 리턴type 메소드이름([매개변수,...]) {
    //	실행문
    //}
    public String pushProductButton(int menuId) {
        System.out.println(menuId + "를 전달받았습니다.");
        return "콜라";
    }

    public static void printVersion() {
        System.out.println("v1.0");
    }

}
