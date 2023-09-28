public class Book {
    //    public int price; // 필드를 직접 접근 하는 것은 정보 은닉 관점에서 안좋다.
// 외부에서 접근하지 못하도록 public 접근제한자를 private 접근제한자로 수정한다.
    private int price;  // 필드 price
    private String title;

    // 필드의 값을 수정하고 얻기 위한 메소드를 만든다. setter, getter

    // setter, getter - 프로퍼티(property)
    public int getPrice() {
        return this.price;  // this는 내 자신 인스턴스를 말하는 키워드
    }

    public void setPrice(int price) {   // 지역변수 price
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
