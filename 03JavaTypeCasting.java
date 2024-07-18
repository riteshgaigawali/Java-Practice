class JavaTypeCasting {
    public static void main(String args[]) {

        byte b1 = 10;
        byte b2 = 30;
        int a = b2; // Widening || Implicite type casting or conversion.

        System.out.println(a);

        float f = 1729.89f;
        int i = (int) f; // Narrowing || Explicite type casting.

        System.out.println(i);

        int result = b1 * b2; // Type promotion. (As the multiplication operation gives result beyond the
                              // range of byte hence it stores it into int.)

        System.out.println(result);
    }

}