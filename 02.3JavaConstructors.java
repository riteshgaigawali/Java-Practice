class JavaConstructors {
    int a, b, c, d, e;

    JavaConstructors() {
        System.out.println("This is inside default constructor.");
    } // Default Constructor.

    JavaConstructors(int a, int b) {
        this.a = a;
        this.b = b;
        System.out.printf("The value of a is %d and b is %d.", a, b);
        System.out.println();
    } // Parameterised Constructor.

    JavaConstructors(int x, int y, int z) {
        c = x;
        d = y;
        e = z;
        System.out.printf("The value of c is %d d is %d and e is %d.", c, d, e);
        System.out.println();

    } // Second Parameterised Constructor.

    JavaConstructors(JavaConstructors jc) {
        System.out.printf("The value of a from parameterised constructor is %d.", jc.c);
    } // Copy Constructor.

    public static void main(String args[]) {
        JavaConstructors jc = new JavaConstructors(); // Default Constructor will be aoutomatically called here.
        jc = new JavaConstructors(1, 2); // Calling parameterised constructor.
        jc=new JavaConstructors(3, 4, 5); // Calling second parameterised constructor.
        new JavaConstructors(jc); // Calling Copy Constructor.
    }
}