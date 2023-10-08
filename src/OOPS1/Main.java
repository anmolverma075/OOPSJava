package OOPS1;

public class Main {
    public static void main(String[] args) {
        Student anmol = new Student(12  , "Cosmic" , 99.0f);


        System.out.println(anmol.rno);
        System.out.println(anmol.name);
        System.out.println(anmol.marks);
    }
}
class Student{
    int rno;
    String name;
    float marks;

    Student(){
        this.name = "Anmol Verma";
        this.marks = 100.0f;
        this.rno = 14;
    }
    Student(int rno , String name , float marks){
        this.rno = rno;
        this.name = name;
        this.marks = marks;
    }

//    OOPS1.Student(int roll , String namee , float markss){
//        rno = roll;
//        name = namee;
//        marks = markss;
//    }
}
