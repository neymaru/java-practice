public class MathBeanTest {
    public static void main(String[] args) {
        MathBean mb = new MathBean();

        mb.printClassName();
        mb.printNumber(5000);
        int result = mb.getOne();
        System.out.println(result);
        int result2 = mb.plus(200, 300);
        System.out.println(result2);


    }
}
