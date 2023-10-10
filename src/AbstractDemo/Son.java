package AbstractDemo;

public class Son extends Parent{

    public Son(int age) {
        super(14);
        this.age = age;
    }

    @Override
    void career() {
        System.out.println("I am going to be a Engineer.");
    }

    @Override
    void partner() {
        System.out.println("She is Peppa Pig.");
    }
}
