package AbstractDemo;

public class Main {
    public static void main(String[] args) {
        Son son = new Son(16);

        son.career();

        Parent.hello();

        Daughter daughter = new Daughter(18);
        daughter.career();
    }
}
