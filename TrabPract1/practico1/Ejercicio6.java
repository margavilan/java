package practico1;
import java.util.Scanner;

public class Ejercicio6 {
    
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int prod = 1;
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        scan.close();

        for(int i = 0; i < num2; i++) {
            prod = prod * num1;
        }
        System.out.print(num1 + " elevado a la " + num2 + ": " + prod);
    }
}
