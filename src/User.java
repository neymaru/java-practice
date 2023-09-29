public class User {
    private String email;
    private String password;
    private String name;


    // 생성자를 하나라도 만들게 되면, 기본생성자는 자동으로 안만들어진다.
    public User(String name, String email) {
        this(name, email, null);    // 많이 받아들이는 생상자를 this로 호출하는 것이 좋다. *this는 첫번 째 줄에 있어야 한다.
        System.out.println("헬로");
    }

    // 생성자 오버로딩
    public User(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "User{" +
                "email='" + email + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
