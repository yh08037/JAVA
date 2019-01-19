
class Updater {
    void update(Counter counter) {
        counter.count++;
    }
}

public class Counter {
    int count = 0;
    public static void main(String[] args){
        Counter myCounter = new Counter();
        System.out.println("업데이트 전 : " + myCounter.count);

        Updater myUpdater = new Updater();
        myUpdater.update(myCounter);
        System.out.println("업데이트 후 : " + myCounter.count);
    }
}
