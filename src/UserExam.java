public class UserExam {
    public static void main(String[] args) {
        User user = new User("네이마루", "asdf");
//        System.out.println(user.name);  // private 으로 접근불가 에러
//        System.out.println(user.getName());
//        System.out.println(user.getEmail());
        System.out.println(user);

        User user2 = new User("네이마루", "asdf", "1234");
        System.out.println(user2.getName());
        System.out.println(user2.getEmail());
        System.out.println(user2.getPassword());
        System.out.println(user2);
    }
}
