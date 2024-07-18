class JavaOperators{
    public static void main(String args[]){

        //Arithmetic Operators.
        int a = 7;
        int b= 3;

        System.out.println(a + b); // Addition.
        System.out.println(a - b); // Substraction.
        System.out.println(a * b); // Multiplication.
        System.out.println(a / b); // Division.
        System.out.println(a % b); //Modulo.

        //Relational Operators. (Returns boolean value either true or false.)
        int c = 9;
        int d = 18;

        System.out.println(c > d); // is greater than ?
        System.out.println(c >= d); // is greater than or equal to ?
        System.out.println(c < d); // is less than ?
        System.out.println(c <= d); // is less than or equal to ?
        System.out.println(c == d); // is equal to ?
        System.out.println(c != d); // is not equal to ?

        //Logical Operators.
        boolean e=true;
        boolean f=false;

        System.out.println(e && f); // Logical AND (AND operation returns true only if both are true else it returns false.)
        System.out.println(e || f); // Logical OR (OR operation returns true only if either one of the value is true.)
        System.out.println(!e); // Logical NOT (NOT reverts the value from true to false and vice versa.)

        //Assignment Operators.
        float g= 1.5f; // " = " Assigns the value to variable.

        g += 8; // Short-Hand for Add and Assign.
        g -= 4; // Short-Hand for Substract and Assign.
        g *= 3; // Short-Hand for Multiply and Assign.
        g /= 2; // Short-Hand for Divide and Assign.
        g %= 2; // Short-Hand for Modulo and Assign.

        //Increament and Decreament operators. (Unary operators)
            int h=5;

            //Prefix (First increament then assign.)
            System.out.println(++h); System.out.println(+h); // is equivalent to h = h+1.
            System.out.println(--h); System.out.println(-h); // is equivalent to h = h-1.
            System.out.println(~h); // inverse the positive number to negative and vice-versa.
            System.out.println(!true); // NOT operator

            //Postfix (Post increament assignment.)
            System.out.println(h++); //is equivalent to h = h+1.
            System.out.println(h--); //is equivalent to h = h-1.

            // Ternary Operator. (Conditional operator)
            String result=a<b?"a is less than b":"a is greater than b";
            System.out.println(result);

            //Bitwise Operators.
            int i=1;
            int j=2;

            System.out.println(i & j); // bitwise AND.
            System.out.println(i | j); // bitwise OR.
            System.out.println(i ^ j); // bitwise Ex-OR.
            System.out.println(~j); // 1's complement.
            System.out.println(i << j); // shift left.
            System.out.println(i >> j); // shift right.
            System.out.println(i >>> j); // shift right with zero fill.

            //Special Operators.

            // instanceOf() returns true if the object on left-hand side belongs to the class on right-hand side.
            // . (Dot operator) used to access the instance variables and functions of a class ex. person.age, person.salary().

    }
}