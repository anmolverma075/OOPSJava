package StaticEg;

public class Main {
    public static void main(String[] args) {
        Human anmol = new Human(21 , "Anmol" , 690000 , false);

        System.out.println(anmol.married);
        System.out.println(anmol.population);
        System.out.println(Human.population);
    }
}
