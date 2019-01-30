import java.util.ArrayList;
import java.util.List;


public class Car {
	
	private List<String> carList = null;
	
	public Car() {
		carList = new ArrayList<String>();
	}
	
	public String getCar() {
		String carName = null;
		switch ((int)Math.random() * 3) {
		case 0:
			carName = "car1";
			break;
		case 1:
			carName = "car2";
			break;
		case 2:
			carName = "car3";
			break;
		}
		return carName;
	}
	
	public synchronized String pop() {
		String carName = null;
		if (carList.size() == 0) {
			try {
				System.out.println("차가 없어요 생산할 때가지 기다리세요");
				this.wait();  // 멈춰있어! -> notify()할 때 까지!
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		carName = (String) carList.remove(carList.size() - 1);
		System.out.println("손님이 차를 사갔습니다. 손님이 구입한 차는 " + carName +"입니다.");
		return carName;
	}
	
	public synchronized void push(String car) {
		carList.add(car);
		System.out.println("차가 만들어졌습니다. 차의 이름은 " + car + "");
		if (carList.size() == 5) {
			this.notify();   // 주석처리를 하게되면 deadlock 상태에 빠짐
		}
	}
	
}
