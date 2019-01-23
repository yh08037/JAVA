
class Complex {
    private double real;
    private double imag;

    Complex(double r, double i) {
        this.real = r;
        this.imag = i;
    }

    void print() {
        double a = this.real;
        double b = this.imag;

        if (b == 0) {
            System.out.println(a);
        }else if (a == 0) {
            if (b == 1) {
                System.out.println("i");
            }else if (b == -1) {
                System.out.println("-i");
            }else {
                System.out.println(b + "i");
            }
        }else {
            if (b == 1) {
                System.out.println(a + "+i");
            }else if (b == -1) {
                System.out.println(a + "-i");
            }else if (b > 0) {
                System.out.println(a + "+" + b + "i");
            }else if (b < 0) {
                System.out.println(a + "" + b + "i");
            }
        }
    }

    Complex getConjugate() {
        return new Complex(this.real, -this.imag);
    }

    Complex sum(Complex num) {
        return new Complex(this.real + num.real, this.imag + num.imag);
    }

    Complex substract(Complex num) {
        return new Complex(this.real - num.real, this.imag - num.imag);
    }

    Complex multipy(Complex num) {
        return new Complex(this.real*num.real - this.imag*num.imag, this.real*num.imag + this.imag*num.real);
    }

    double norm() {
        return this.real * this.real + this.imag * this.imag;
    }

}


public class ComplexTest {
    public static void main(String[] args) {
        Complex number = new Complex(3, 2);
        number.print();

        Complex number2 = number.getConjugate();
        number2.print();

        number.sum(number2).print();
        number.substract(number2).print();
        number.multipy(number2).print();
        System.out.println(number.norm());
        System.out.println(number2.norm());
    }
}