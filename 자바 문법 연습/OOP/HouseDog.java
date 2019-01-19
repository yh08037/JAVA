public class HouseDog extends Dog {

    // 디폴트 생성자
//  public HouseDog() {
//  }
    // 만약 클래스에 생성자가 하나도 없다면 컴파일러가 자동으로 디폴트 생성자를 추가한다.
    // 하지만 아래와 갗이 사용자가 작성한 생성자가 하나라도 구현되어 있다면
    // 컴파일러는 디폴트 생성자를 추가하지 않는다.
    // 따라서 name 을 파라미터로 받는 생성자를 만든 후에
    // new HouseDog(); 는 사용할 수 없게 된다.

    public HouseDog(String name) {
        this.setName(name);
    }

    public HouseDog(int type) {
        if (type == 1) {
            this.setName("시츄");
        } else if (type == 2) {
            this.setName("불독");
        }
    }

    // 메소드 오버라이딩 : 메소드 덮어쓰기
    // 부모클래스의 메소드를 자식클래스가 동일한 형태로 다시 구현하는 것
    public void sleep() {
        System.out.println(this.name + " zzz in house");
    }

    public void sleep(int hour) {
        System.out.println(this.name + " zzz in house " + hour + " hours");
    }

    public static void main(String[] args){
        // 생성자를 선언하지 않았을 때
//      HouseDog housedog = new HouseDog();
//      housedog.setName("봄");

        HouseDog myDog = new HouseDog("봄");
        System.out.println(myDog.name);
        myDog.sleep(5);

        HouseDog dog1 = new HouseDog(1);
        HouseDog dog2 = new HouseDog(2);

        System.out.println(dog1.name);
        System.out.println(dog2.name);
    }
}
