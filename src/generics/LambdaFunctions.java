package generics;

import java.util.ArrayList;
import java.util.function.Consumer;

public class LambdaFunctions {
    public static void main(String[] args) {
//        int[] arr = {3 , 25 , 12 ,51 ,1};
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0 ; i < 5 ; i++){
            arr.add(i + 1);
        }
//        arr.forEach((item)-> System.out.println(item * 2));
        Consumer<Integer> fun = (item) -> System.out.println(item * 2);
        arr.forEach(fun);
    }
    int sum(int a , int b){
        return a  + b;
    }
}