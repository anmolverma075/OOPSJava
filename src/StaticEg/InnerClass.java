package StaticEg;

public class InnerClass {
    static class Test{
        String name ;
        public Test(String name){
            this.name = name;
        }
    }

    public static void main(String[] args) {

//        InnerClass obj = new InnerClass();
//        InnerClass.Test.
        Test a = new Test("Anmol");
        Test b = new Test("Verma");
        System.out.println(a.name);
        System.out.println(b.name);
    }
}
