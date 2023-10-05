public class ObjectBocMain {
    public static void main(String[] args) {
        ObjectBox box = new ObjectBox();
        box.set("kim");
        String str = (String)box.get(); // Object 타입으로 리턴해주기 때문에 본래 타입으로 형변환
        System.out.println(str.toUpperCase());

        box.set(new Integer(5));
        Integer i = (Integer)box.get();
        System.out.println(i);
        System.out.println(i.intValue());

        // ObjectBox는 어떤 Object든 저장할 수 있고, 어떤 Object를 꺼낼 수 있지만 꺼내서 사용할 때는 본래 타입으로 형변환 시키는 번거로운 과정이 필요하다.
        // 이러한 단점을 보완하고 타입을 지정하는 박스를 만들기 위해 나온 것이 제네릭(Generic) 기법이다.


    }
}
