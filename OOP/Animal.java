// '동물'이라는 클래스 만들기
// 클래스는 객체를 만드는 기능을 가지고 있다.
// 클래스에 의해서 만들어진 객체는 인스턴스라고 한다.
// new 는 객체를 생성할 때 사용하는 키워드이다.
// Animal cat = new Animal();
// 에 의해서 만들어진 cat 이라는 객체는 Animal 의 인스턴스이다.
// 같은 방법으로 무수히 많은 동물 객체를 만들 수 있다.

public class Animal {
    String name;

    public void setName(String name){
        this.name = name;
    }

    // this 는 클래스에 의해서 생성된 객체를 지칭한다.
    // 즉, cat.setName("haru"); 와 같이 cat 객체에 의해 setName 메소드를 호출하면
    // setName 메소드 내부의 this 는 cat 객체를 지칭하게 된다.
    // 따라서, this.name = name; 은 cat.name = "haru"; 로 해석되어진다.

    public static void main(String[] args){
        Animal cat = new Animal();
        cat.setName("haru");

        Animal dog = new Animal();
        dog.setName("taromaru");

        System.out.println(cat.name);
        System.out.println(dog.name);
    }
}
