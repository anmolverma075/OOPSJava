package Inheritance;

public class BoxPrice extends BoxWeight{
    double price;

     static void greeting() {
        System.out.println("Hey I am in BoxPrice class , Greetings!");
    }

    BoxPrice(){
        super();
        this.price = -1;
    }

    BoxPrice(BoxPrice other){
        super(other);
        this.price = other.price;
    }
    public BoxPrice(double l , double h , double w , double weight , double cost){
        super(l ,h , w , weight);
        this.price = price;
    }

    public BoxPrice(double side , double weight , double price){
        super(side ,weight);
        this.price = price;
    }
}