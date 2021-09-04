package calc;

class Calculator
{
    public void calculate(int a, int b)
    {
        System.out.println("Your Result In Normal Addition Is: " +  (a + b));
    }
}

class scCalculator{
    public void calculate(int a, int b)
    {
        System.out.println("Your Result In Scientific Calculator Is: " + Math.sin(a+b));
    }
}

class hyCalculator{
    public void calculate(int a, int b)
    {
        System.out.println("Your Result In Hybrid Calculator Is: " + Math.sin(a+b));
        System.out.println("Your Result In Hybrid Calculator Is: " + (a+b));
    }
}
public class Problem1 {
    public static void main(String[] args) {
        System.out.println("I am in main method");
        Calculator c = new Calculator();
        c.calculate(10,5);

        scCalculator s = new scCalculator();
        s.calculate(10, 5);

        hyCalculator h = new hyCalculator();
        h.calculate(10, 5);
    }
}
