package aplication.spring.SimpleCalculator.Models;

public class SimpleCalculator {

    private int a;
    private int b;

    public SimpleCalculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public SimpleCalculator() {
    }

    public int add(int a, int b){
        return a+b;
    }

    public int subtraction(int a, int b){
        return a-b;
    }

    public int multiplication(int a, int b){
        return a*b;
    }

    public int division(int a, int b){
        if (b == 0){
            System.out.println("Nie dzielimy przez 0 !!");
           return 0;
        } else {
            return a/b;
        }
    }
}
