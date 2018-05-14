public class Calculator {
    private int num1;
    private int num2;


    public Calculator(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int getNum1() {
        return this.num1;
    }

    public int getNum2() {
        return this.num2;
    }

    public int addition() {
        return (this.num1 + this.num2);
    }

    public int substraction() {
        return (this.num1 - this.num2);
    }

    public int divide() {
        return (this.num1 / this.num2);
    }

    public int multiply() {
        return (this.num1 * this.num2);
    }
}