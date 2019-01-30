
public class Main {
	public static void main(String[] args) {
		
		Car c = new Car();
		Producer p = new Producer(c);
		Thread py = new Thread(p, "Producer");
		py.start();
	
	}
}
