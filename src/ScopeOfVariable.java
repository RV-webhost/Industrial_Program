public class ScopeOfVariable { // Scope = the area of the program where a variable can be used.

//    int x = 10; it will not run without creating an obj
//    static int x = 10; it will run
    int x = 10;
    static int y = 29;
    public static void main(String args[]) {

        short s = 2;
        int x = 4;
        long l = 824390899L;
        char c = 65;
        float f = 78.53f;

        System.out.println(f);
        System.out.println(l);
        System.out.println(s);
        System.out.println(x);
        System.out.println(c);
        double y = 83847829.348904;

        int g = (int) 78.34;

        System.out.println(g);
        System.out.println(y);


        ScopeOfVariable obj = new ScopeOfVariable();
        System.out.println(obj.x);

        System.out.println(obj.y);
        y=87;
        System.out.println(y);
    }
}
