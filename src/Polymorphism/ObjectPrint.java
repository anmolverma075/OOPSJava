package Polymorphism;

public class ObjectPrint {
    int num;

    public ObjectPrint(int num) {
        this.num = num;
    }

    @Override
    public String toString(){
        return "ObjectPrint {" + "nums " + num + '}';
     } // without this it would called the by default toString function and print a random hash value.

    public static void main(String[] args) {
        ObjectPrint obj = new ObjectPrint(17);

        System.out.println(obj);
    }
}
