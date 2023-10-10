public class Exception6 {
    public static void main(String[] args) {
        int[] array = {4, 2};
        int[] value = null;
        try {
            value[0] = array[0] / array[1]; // value 가 null을 참조하므로 NullPointerException 발생
        } catch (ArrayIndexOutOfBoundsException aiob) {
            System.out.println(aiob.toString());
        } catch (ArithmeticException ae) {
            System.out.println(ae.toString());
        } catch (Exception ex) {    // Exception은 모든 Exception의 최상위 부모. ex가 NullPointerException을 참조해서 블록 문장 실행
            System.out.println(ex);
        }
    }
}
