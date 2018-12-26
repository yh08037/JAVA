/*두 수의 합 구하기*/

import java.util.Scanner;   //Scanner 클래스 포함

public class Add2 {
    //main 메서드에서 부터 실행 시작
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);   //입력을 받기 위한 Scanner 객체 생성
        int x, y, sum;

        System.out.print("첫번째 숫자를 입력하시오: ");
        x = input.nextInt();

        System.out.print("두번째 숫자를 입력하시오: ");
        y = input.nextInt();

        sum = x + y;

        System.out.println(sum);

    }
}
