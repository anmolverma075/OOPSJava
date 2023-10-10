package Inheritance;

public class BoxWeight extends Box {
    double weight;

    public BoxWeight(){
        this.weight = -1;
    }

//    @Override
    static void greeting() {
        System.out.println("Hey I am in BoxWeight class , Greetings!");
    }

    BoxWeight (BoxWeight other){
        super(other);
        weight = other.weight;
    }

    //above statement is same as  "Box boxx = new BoxWeight(12, 11 , 15 , 15);"

    public BoxWeight(double l , double w , double h , double weight){
        super(l , h , w);

        //suppose weight is also present in parent class & we explicitly want to access the weight of it so we use super instead of this.
        //we would use "this" to enter weight of child class.
        System.out.println(super.weight);
        this.weight = weight;
    }

    public BoxWeight(double side , double weight){
        super(side);
        this.weight = weight;
    }
}