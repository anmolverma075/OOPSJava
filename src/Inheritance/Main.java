package Inheritance;

public class Main {
    public static void main(String[] args) {
//        Box box = new Box();
//        Box box1 =  new Box(12 , 15 , 12);
//        Box box2 = new Box(14);
//        Box box3 = new Box(box);
//        System.out.println(box.l + " " + box.h + " " + box.w);
//        System.out.println(box1.l + " " + box1.h + " " + box1.w);
//        System.out.println(box2.l + " " + box2.h + " " + box2.w);
//        System.out.println(box3.l + " " + box3.h + " " + box3.w);
        BoxWeight box = new BoxWeight(12 ,13 , 14 , 15);
        System.out.println(box.l + " " + box.h + " " + box.w + " " + box.weight);

        //it is the type of the reference variable not the type of object which determines what members can be accessed.
        //ref variable      object
//        Box boxx = new BoxWeight(12, 11 , 15 , 15);
//        System.out.println(boxx.w);

        BoxPrice boxx = new BoxPrice(12 , 50 ,200);
        System.out.println();
    }
}
