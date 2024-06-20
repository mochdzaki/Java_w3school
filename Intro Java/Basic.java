
// SOME BASIC JAVA PUNCION OR METHOD

// Print word "hello world" in java using class
public class Basic {
    
    public static void main(String[] args){
        // this type of print is to make a new line for each word
        System.out.println("Hello World");

        // this type of print is also show the output without make a new line
        System.out.print("Its me!");
        System.out.println(" Ucok");

        System.out.println(2330);

        // even though for calculation
        System.out.println(30 + 3);

        // print word using variable
        String name = "kepin";
        int myNumber = 139;
        int myNum1;
        myNum1 = 40;
        final String typeLamp = "bulb"; // this type of declare variable it for case if you dont want to over write the value of the variable
        int x = 1, y = 39, z = 93; // simply to declare more variables

        System.out.println(name);

        // how to combine with variable
        System.out.println(myNum1 + myNumber);
    }

    public static void second(String[] aStrings){
        // this print a int of value
        System.out.print(5);
        System.out.print(100);

        // some simple application in advanced case
        String typeShape = "Triangle";
        int base = 20;
        int tall = 25;
        int baseArea;

        baseArea = base * tall / 2;

        System.out.println("Type of Shape: " + typeShape);
        System.out.println("Base of Triangle: " + base);
        System.out.println("Tall of Triangle: " + tall);
        System.out.println("Base Area of Triangle: " + baseArea);
    }
}