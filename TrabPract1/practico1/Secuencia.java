package practico1;
import java.util.Scanner;

public class Secuencia {
    
    public static void main(String[] args) {
          Scanner scan = new Scanner(System.in);
          System.out.print("Ingrese un número entero: ");

        int numero = scan.nextInt();
        int rep = 0, cont;

        for (cont = 1; cont <= numero; cont++) {
            rep = rep * 10 + cont;
            System.out.println(rep + " ");
            scan.close();
        }
    }
}