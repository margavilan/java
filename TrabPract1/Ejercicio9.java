import java.io.IOException;
import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        String texto;
        char caracter;
        int cantRep = 0;
        do {
            System.out.println("Introduce texto: ");
            texto = scan.nextLine();
        } while (texto.isEmpty());
        System.out.print("Introduce un carácter: ");
        caracter = (char) System.in.read();
        scan.close();
        cantRep = contarCaracteres(texto, caracter);
        System.out.println("El caracter " + caracter + " aparece " + cantRep + " veces");                   
    }

    public static int contarCaracteres(String cadena, char caracter) {
        int posc, cont = 0;
        posc = cadena.indexOf(caracter);
        while (posc != -1) { 
            cont++;           
            posc = cadena.indexOf(caracter, posc + 1);
        }
        return cont;
   }
}