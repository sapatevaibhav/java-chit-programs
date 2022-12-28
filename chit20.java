//~Write a class Calculator having member function add(). Overload add () 3 times.
class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public String add(String a, String b) {
        return a + b;
    }
}

public class chit20 {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        int sum1 = calculator.add(1, 2);
        double sum2 = calculator.add(1.5, 2.5);
        String concat = calculator.add("Namaste, ", "Bharat.");

        System.out.println(sum1); // 3
        System.out.println(sum2); // 4.0
        System.out.println(concat); // "Namaste, Bharat."

    }
}