class Number{
    int sum(int a, int b){
        return a+b;
    }
}

public class Test {

    public static void main(String[] args){
        int a = 3;
        int b = 4;

        Number myNumber = new Number();

        int c = myNumber.sum(a, b);

        System.out.println(c);
    }
}
