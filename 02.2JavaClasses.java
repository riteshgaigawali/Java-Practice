class Calculator {
    int add(int a, int b) {
        int result = a + b;
        return result;
    }

}

class JavaClasses {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println("The addition is " + c.add(5, 6));

        Calculator c1 = new Calculator();
        System.out.println("The addition is " + c1.add(8, 6));
    }
}
