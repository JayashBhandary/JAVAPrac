class Calculate{
    int z;
    public void addition(int x, int y){
        z = x + y;
        System.out.println("The sum of given number " + z);
    }

    public void subtraction(int x, int y){
        z = x - y;
        System.out.println("The difference of given number " + z);
    }
}

class MyCalculate extends Calculate {
    public void multiplication(int x, int y){
        z = x * y;
        System.out.println("The product of given number " + z);
    }
}

public class TestInheritance {
    public static void main(String args[]){
        int a = 200, b =20;
        MyCalculate demo = new MyCalculate();
        demo.addition(a, b);
        demo.subtraction(a, b);
        demo.multiplication(a, b);
    }
}
