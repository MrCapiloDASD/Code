public class primitivesExamples {
    public static void main(String[] args) {
    // byte stores small whole numbers from -128 to 127, useful for saving memory
    byte myByte = 100;

    // short stores medium whole numbers from -32,768 to 32,767, larger than byte
    short myShort = 25000;

    // float stores decimal numbers with 6-7 digits of precision, ends with 'f'
    float myFloat = 3.14f;

    // double stores decimal numbers with 15-16 digits of precision, default for decimals
    double myDouble = 99.99;

    // int stores whole numbers from about -2 billion to 2 billion, most common integer type
    int myInt = 500;

    // char stores a single character using single quotes
    char myChar = 'A';

    // long stores very large whole numbers, calculated as 50,000 + 10 times the sum
    long myLong = 50000 + 10 * (myByte + myShort + myInt);

    // Print out each primitive data type
    System.out.println("byte: " + myByte);
    System.out.println("short: " + myShort);
    System.out.println("float: " + myFloat);
    System.out.println("double: " + myDouble);
    System.out.println("int: " + myInt);
    System.out.println("char: " + myChar);
    System.out.println("long: " + myLong);
    }
}

