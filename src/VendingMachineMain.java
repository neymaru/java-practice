public class VendingMachineMain {
    public static void main(String[] args) {
        VendingMachine.printVersion();
        VendingMachine vm1 = new VendingMachine();
        VendingMachine vm2 = new VendingMachine();

        String product = vm1.pushProductButton(100);
        vm1.printVersion(); // static 메소드를 호출할 때는 클래스명 사용해서 호출 -> VendingMachine.printVersion();
        System.out.println(product);

//        * JVM은 CLASSPATH 경로에서 클래스를 찾아서 실행한다.
//        - Java VendingMachineMain 이라고 입력하면 JVM은 CLASSPATH 에서 VendingMachineMain이라는 클래스를 찾아 읽어들이고 읽어들인 클래스 정보(인스턴스 아님)를 PERM이라는 메모리 영역에 저장한다.
//                클래스 정보가 PERM 영역에 올라가게 되면, JVM은 해당 클래스가 어떤 static 메소드를 가지고 있는지, 어떤 인스턴스 메소드를 가지고 있는데 알게된다.
//                그리고 JVM은 프로그램 시작 점인 main 메소드를 찾아 실행한다.
//                main 메소드를 실행하면 Java Stack 이라고 불리는 메모리 영역에 실행된 메소드 정보가 올라가게 된다.
//                JVM은 PERM 메모리에 올라가 있는 VendingMachineMain 클래스에서 main 메소드를 찾아서 해당 메소드 정보를 Java Stack에 넣어준다.
//                Java Stack에 저장된 메소드 실행 정보 하나를 스택 엔트리(Stack Entry)라고 한다.
//                main 메소드 안에 선언된 변수들은 스택 엔드리에 저장되고 이러한 변수를 로컬(local) 변수라고 한다.
//                메소드가 실행되면 Java Stack에 스택 엔트리가 하나 더 추가된다.
//                메소드가 실행 후 종료되면 해당 메소드의 실행 정보를 담고있는 스택 엔트리는 자바 스택에서 제거 된다.
//                그 다음줄이 실행되고 인스턴스 생성 코드가 있으면 인스턴스는 Heap 메모리에 생성되고 스택 엔트리의 참조 변수가 참조하게 된다.
//                main() 메소드가 종료되면 main() 메소드의 실행 정보를 가지고 있는 스택 엔트리가 자바 스택에서 제거된다.
//                자바 스택에는 더 이상 남아있는 스택 엔트리가 없게 된다.
//                메소드 안에 선언된 지역변수는 메소드가 실행될 때 생성되고 종료될 때 사라진다.
//                같은 메소드를 동시에 열 번 호출하면 그 메소드 안의 지역변수는 각각 다른 영역에 저장되어 사용된다.

    }
}
