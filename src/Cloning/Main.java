package Cloning;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException{
        Human anmol = new Human(21 , "Anmol");
//        Human twin = new Human(anmol);
        Human twin = (Human)anmol.clone();

        System.out.println(twin.age + " " + twin.name);

        System.out.println(Arrays.toString(twin.arr));
        twin.arr[0] = 99;
        System.out.println(Arrays.toString(twin.arr));
        System.out.println(Arrays.toString(anmol.arr));
    }
}