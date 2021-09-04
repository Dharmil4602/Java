package folder.folderl1.folderl2;

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
public class Problem2 {

    protected int proInt = 4;
    int defInt = 40;
    public static void main(String[] args) {
        System.out.println("I am in main method");
    }
}