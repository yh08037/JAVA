
class NPC {
    public synchronized void 팔기() {
    }
    public synchronized void 사기() {
    }
}

class User extends Thread {
}

public class SynchronizedEx {
    NPC n = new NPC();

    User u1 = new User();
    u1.start();
    User u2 = new User();
    u2.start();
    User u3 = new User();
    u3.start();
}


// 만약 u1이 가장 먼저 우선권을 얻어 팔기를 호출하여 실행 중 다른 유저에게 넘어간다면
// 다른 유저는 팔기, 사기 둘 다 하지 못한다
// u1 이 NPC 의 열쇠를 가지고 안으로 들어갔기 때문!