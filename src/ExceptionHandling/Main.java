package ExceptionHandling;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        try{
            String name = "ANMOL";
            if(name.equals("ANMOL")){
                throw new MyException("The name is ANMOL here");
            }
        }catch (MyException e){
            System.out.println(e.getMessage());
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }catch (Exception e) {
            System.out.println(("Normal exception"));
        } finally {
            System.out.println("This will always execute");
        }
    }
    static int divide(int a , int b) throws ArithmeticException{
        if(b == 0){
            throw new ArithmeticException("Please do not divide by zero.");
        }
        return a / b;
    }
}