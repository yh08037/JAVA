public class Dog extends Animal {
    public void sleep() {
        System.out.println(this.name + " zzz");
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setName("타로마루");
        System.out.println(dog.name);
        dog.sleep();
    }
}

// Dog 클래스는 Animal 클래스를 상속받았다.
// 이때 Dog 은 자식 클래스, Animal 은 부모 클래스라고 한다.
// Dog 클래스는 Animal 클래스의 메소드인 setName() 을 그대로 쓸 수 있다.
// 또한 sleep()과 같이 새로운 메소드를 추가할 수 있다.
// 이와 같이 자식 메소드는 부모 클래스의 기능에 더하여 좀더 많은 기능을 갖도록 설계한다.

// Dog 클래스는 Animal 클래스를 상속받았다.
// 즉 Dog 은 Animal 의 하위개념이므로, "개는 동물이다", "Dog is a Animal"라고 표현할 수 있다.
// 자바에서는 이러한 관계를 IS-A 관계 (상속관계)라고 한다.

// 이때, 자식 객체는 부모클래스의 자료형인 것처럼 사용할 수 있다.
// 즉, Animal dog = new Dog(); 가 가능하다.
// "개로 만든 객체는 동물형이다"
// 반대로, Dog dog = new Animal(); 는 불가능하다.
// "동물로 만든 객체는 개형이다"
