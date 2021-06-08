package practico1;

import java.util.Scanner;

public class OperMat {

    public static void main(String[] args) {

        int numeroUno, numeroDos;
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduzca el primer número: ");
        numeroUno = scan.nextInt();
        System.out.println("Introduzca el segundo número: ");
        numeroDos = scan.nextInt();
        scan.close();

        System.out.print(numeroUno + " + " + numeroDos + ": ");
        System.out.println(numeroUno + numeroDos);
        System.out.print(numeroUno + " - " + numeroDos + ": ");
        System.out.println(numeroUno - numeroDos);
        System.out.print(numeroUno + " * " + numeroDos + ": ");
        System.out.println(numeroUno * numeroDos);
        System.out.print(numeroUno + " / " + numeroDos + ": ");
        System.out.println(numeroUno / numeroDos);
        System.out.print(numeroUno + " % " + numeroDos + ": ");
        System.out.println(numeroUno % numeroDos);

    
        
    }
}