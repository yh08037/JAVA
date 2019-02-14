
class Camera{
    private Camera() {  //객체화에 대한 제어를 하고 싶을 때 생성자를 private 로 선언할 수 있다
    }
    public static Camera getCamera(){
        Camera c = new Camera();
        return c;
    }
}

public class TestEx {
    public static void main(String[] args) {
//      new Camera();   // private이므로 불가능!!
        Camera ca = Camera.getCamera();
    }
}
