public class Implicit_Explicit_Casting {
    public static void main(String[] args) {

        short s = 123;
        System.out.println("short s: " + s);

        int sint = s;
        System.out.println("short to int: " + sint);

        double x = 123.987;
        System.out.println(x);

        int y = (int) x;// explicit type casting
        System.out.println("int value of x: " + y);

        int b = (byte) y;
        System.out.println("byte value of y: " + b);

        int r = 5;
        System.out.println(++r + r++);

        String str = "abc.def"; // abc def

        String[] result = str.split(".");
        // "" "" "" "" ""

        System.out.println(result.length);
    }
}

//death  note - 50
//AOt - 150
// Solo leveling - 70
//jjk - 90
// Demons Slayer - 70
// Ragna Crimson - 24
//.. ReZero