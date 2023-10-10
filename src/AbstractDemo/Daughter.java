package AbstractDemo;

public class Daughter extends Parent{

    public Daughter(int age) {
        super(20);
        this.age = age;
    }

    @Override
    void career() {
        System.out.println("I am going to be a Coder.");
    }

    @Override
    void partner() {
        System.out.println("He is Iron Man");
    }
}