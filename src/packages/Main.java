package packages;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [] arr = {1 ,23 ,5 ,21 ,5,};
        change(arr);
        int a = 100;
        changeVal(a);
        System.out.println(a);
        System.out.println(Arrays.toString(arr));
    }

    private static void changeVal(int a) {
        a = -91;
    }

    public static void change(int []nums){
        nums[0] = 99;
    }
}