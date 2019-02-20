
public class IFEx {

	public static void main(String[] args) {
		
		int x = 10;
		x = x + 1; //x++; x+=1;
		int y = 20;
		y = y + 2; //y+=2;
		
		if (x>100 && (y+=100)>10){
			System.out.println("참");
		}
		
		System.out.println("y == " + y);
		
		if ( x > y ) {
			System.out.println("x가 크다");
		}
		else {
			System.out.println("y가 크다");
		}

	}

}
