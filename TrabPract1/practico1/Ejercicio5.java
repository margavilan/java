package practico1;
import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int suma = 0;
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        scan.close();

        for (int i = 0; i < num2; i++) {
            suma = suma + num1;
        }
        System.out.print(num1 + " X " + num2 + ": " + suma);
    }
}