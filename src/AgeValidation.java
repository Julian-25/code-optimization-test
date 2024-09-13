import java.util.Scanner;
public class AgeValidation {
    //Eliminacion de numeros magicos mediante el uso de variables con la herramienta final static.
    final static int AGE_LIMIT = 18;
    public static void main(String[] args) {
        //Se logró con la herramineta "Scanner" el usuario pueda ingresar su edad por consola
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter you age");
        int age = scanner.nextInt();
        
        //Eliminacion de uso doble del if con la estructura de control "if else"
        if (age >= AGE_LIMIT) {
            System.out.println("Access granted");
        } else if (age < 18) {
            System.out.println("Access denied");
        }    
    }
}
