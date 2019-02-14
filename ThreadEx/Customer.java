
public class Customer implements Runnable{
	private Car car;
	
	public Customer(Car car) {
		this.car = car;
	}
	
	public void run() {
		String carName = null;
		for (int i = 0; i < 20; i++) {
			carName = car.pop();
			try {	
				Thread.sleep((int) (Math.random() * 200));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
