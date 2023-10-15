package generics.Comparing;

public class Main {
    public static void main(String[] args) {
        Student anmol = new Student(15 , 89.9f);
        Student who = new Student(17 , 99.0f);

        if(anmol.compareTo(who) < 0) {
            System.out.println(anmol.compareTo(who));
            System.out.println("Anmol has less marks than who");
        }
    }
}
