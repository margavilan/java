import java.util.Scanner;

public class Ejerc1 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] ciudades = new String[4];
        ciudades[0] = "Nada";
        System.out.println("Ingrese la primer ciudad");
        ciudades[1] = scan.nextLine();
        System.out.println("Ingrese la segunda ciudad");
        ciudades[2] = scan.nextLine();
        System.out.println("Ingrese la segunda ciudad");
        ciudades[3] = scan.nextLine();
        scan.close();

        for (int i = 1; i <= 4; i++) {
            System.out.println("#" + i + " - " + ciudades[i]);
        }
    }
}