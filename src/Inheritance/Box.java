package Inheritance;

public class Box {
    double l;
    double h;
    double w;
    double weight;


    static void greeting() {
        System.out.println("Hey I am in Box class , Greetings!");
    }


    BoxWeight obj = new BoxWeight();

    //super(); Object class
    Box (){
        this.h = -1;
        this.l = -1;
        this.w = -1;
    }

    //Cube
    Box (double side){
        this.w = side;
        this.l = side;
        this.h = side;
    }

    Box(double l , double h , double w){
        this.l = l;
        this.h = h;
        this.w = w;
    }

    Box(Box old){
        this.h = old.h;
        this.l = old.l;
        this.w = old.w;
    }


    public void information(){
        System.out.println("Running the box");
    }
}
