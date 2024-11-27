package spacecoding.exceptionhandling;

public class ThrowsException {
    public static void divide() throws ArithmeticException, NumberFormatException{
       int a = Integer.parseInt("8b");
       int b = Integer.parseInt("0");
       int c = a / b;
       System.out.println("Result : " + c);
    }
    public static void main(String[] args) {
        try{
            divide();
        }catch(ArithmeticException e){
            System.out.println("Youcan not divide number by zero");
        }catch(NumberFormatException e){
            System.out.println("Invalid number format!");
        }
    }
}
