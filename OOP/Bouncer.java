public class Bouncer {
//    public void barkAnimal(Animal animal) {
//        if (animal instanceof Tiger) {
//            System.out.println("어흥");
//        } else if (animal instanceof Lion) {
//            System.out.println("으르렁");
//        }
//        // instanceof 는 특정 객체가 특정 클래스의 인스턴스인지 판정한다.
//    }

    public void barkAnimal(Barkable animal) {
        animal.bark();
    }

    public static void main(String[] args) {
        Tiger tiger = new Tiger();
        Lion lion = new Lion();

        Bouncer bouncer = new Bouncer();
        bouncer.barkAnimal(tiger);
        bouncer.barkAnimal(lion);
    }
}
