package StaticEg;

public class StaticBlock {
    static int a = 4;
    static int b;

    // will only run once when the first object is created.
    static {
        System.out.println("This is static block");
        b = a * 5;
    }

    public static void main(String[] args) {
        StaticBlock obj = new StaticBlock();
        System.out.println(StaticBlock.a + " " + StaticBlock.b);


        StaticBlock.b += 3;
        System.out.println(StaticBlock.a + " " + StaticBlock.b);

        StaticBlock newob  = new StaticBlock();
        System.out.println(StaticBlock.a + " " + StaticBlock.b);

    }
}
