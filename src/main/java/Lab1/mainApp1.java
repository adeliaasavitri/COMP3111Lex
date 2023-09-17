package Lab1;

public class mainApp1 {
    public static void main(String[] args){
        int b = 2;
        int n = 11;
        System.out.println("Welcome to Scientific Calculator! Where you could only do Basic Addition, Power-Of, and Factorial :)");
        System.out.println("Program starts...");
        System.out.println(b+" plus "+n+" = "+ myLibrary.Addition(b,n));
        System.out.println(b+" to power "+n+" = "+ myLibrary.Power(b,n));
        System.out.println(n+"! = "+myLibrary.factorial(n));
        System.out.println("Program ..Ended ...");
    }
}
