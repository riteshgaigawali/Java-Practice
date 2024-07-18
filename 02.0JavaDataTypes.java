class JavaDataTypes {

    public static void main(String args[]) {

        // 1. Primitive Data Types: These are the most basic data types in Java and
        // represent single values. They are:

        boolean bool = true; // 1-bit || Holds values "True" or "False". || Default value = false.

        byte b = 127; // 8-bits (1 Bytes) || Ranges from -128 to 127. || Default value =0.

        short s = 32_767; // 16-bits (2 Bytes) || Its value-range lies between -32,768 to 32,767. ||
                          // Default
                          // value =0.

        int i = 38299; /*
                        * 32-bits (4 Bytes) ||
                        * Its value-range lies between - 2,147,483,648 (-2^32) to 2,147,483,647
                        * (2^32-1). || Default value =0.
                        */

        long l = 89403938849383l; /*
                                   * 64-bits (8 Bytes) ||
                                   * Its value-range lies between -9,223,372,036,854,775,808(-2^64) to
                                   * 9,223,372,036,854,775,807(2^63 -1). || Default value =0L.
                                   */

        float f = 256.5f; // 32-bit (4 Bytes) || Default value =0.0f.

        double d = 3489.78; // 64-bit (8 Bytes) || Default value =0.0d.

        char c = '$'; // 16-bit (2 Bytes) || Unicode character Its value-range lies between '\u0000'
                      // (or
                      // 0) to
                      // '\uffff' (or 65,535 inclusive). || Default value = '\u0000'.

        /*
         * 2. Non-Primitive Data Types: Also known as reference data types, these are
         * used to store complex data structures and objects. Some common non-primitive
         * data types are:
         * String: Represents a sequence of characters.
         * Arrays: Used to store a collection of similar type data. (See
         * 02.1JavaArrays.java)
         * Classes: User-defined blueprints for creating objects. (See
         * 02.2JavaClasses.java)
         * Interfaces: A contract that classes can implement.
         */

        String str = "This is a String's example in Java which can hold sequence of characters.";

    }
}