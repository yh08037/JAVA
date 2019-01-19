public class ZooKeeper {
//    public void feed(Tiger tiger) {
//        System.out.println("feed apple");
//    }
//
//    public void feed(Lion lion) {
//        System.out.println("feed banana");
//    }
    // 메소드 오버로딩
    // 이렇게 하면 동물 하나 추가할 떄 마다 메소드 새로 써주어야...

    public void feed(Predator predator) {
        System.out.println("feed " + predator.getFood());
    }
    // feed 메소드의 입력으로 Tiger, Lion 을 각각으로 필요했었지만
    // 이제 이것을 Predator 라는 인터페이스로 대체할 수 있다.
    // tiger, lion 은 Tiger, Lion 클래스의 객체이기도 하면서 Predator 인터페이스의 객체이기도 하다
    // 이와같이 객체가 한 개 이상의 자료형 타입을 갖게되는 특성을 다형성이라고 한다.

    public static void main(String[] args) {
        ZooKeeper zooKeeper = new ZooKeeper();
        Tiger tiger = new Tiger();
        Lion lion = new Lion();
        zooKeeper.feed(tiger);
        zooKeeper.feed(lion);
    }
}
